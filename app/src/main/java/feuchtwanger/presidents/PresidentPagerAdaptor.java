package feuchtwanger.presidents;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class PresidentPagerAdaptor extends PagerAdapter {

    private Presidents[] presidents;
    private int[] pics;

    PresidentPagerAdaptor(Presidents[] presidents, int[] pics)
    {
        this.presidents = presidents;
        this.pics = pics;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View view = inflater.inflate(R.layout.president_pager_item, null);
        TextView name = (TextView) view.findViewById(R.id.name); //There's no method "findViewById"
        //in PagerAdaptor
        TextView number = (TextView) view.findViewById(R.id.number);
        TextView office = (TextView) view.findViewById(R.id.office);
        TextView party = (TextView) view.findViewById(R.id.party);
        TextView life = (TextView) view.findViewById(R.id.life);
        ImageView image = (ImageView) view.findViewById(R.id.image);

        Presidents president = presidents[position];
        int picNumber = president.getNumber();
        picNumber-=1;
        image.setImageResource(pics[picNumber]);
        name.setText(president.getPresident());
        number.setText(String.valueOf(president.getNumber()));
        if(president.getLeftOffice() == null){
            office.setText(president.getTookOffice() + " - present");
        } else {
            office.setText(president.getTookOffice() + " - " + president.getLeftOffice());
        }
        party.setText(president.getParty());
        if(president.getDeathYear() == null){
            life.setText(president.getBirthYear() + " - present");
        } else{
            life.setText(president.getBirthYear() + " - " + president.getDeathYear());
        }


        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return presidents.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
