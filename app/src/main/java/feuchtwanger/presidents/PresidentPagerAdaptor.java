package feuchtwanger.presidents;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PresidentPagerAdaptor extends PagerAdapter {

    private Presidents[] presidents;

    PresidentPagerAdaptor(Presidents[] presidents){
        this.presidents = presidents;
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

        image.setImageDrawable();
        name.setText(president.getPresident());
        number.setText(String.valueOf(president.getNumber()));
        office.setText(president.getTookOffice() + "-" + president.getLeftOffice());
        party.setText(president.getParty());
        life.setText(president.getBirthYear() + "-" + president.getDeathYear());

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
