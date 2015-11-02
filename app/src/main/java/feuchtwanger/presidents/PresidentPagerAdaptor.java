package feuchtwanger.presidents;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PresidentPagerAdaptor extends PagerAdapter {

    private PresidentList presidents;

    PresidentPagerAdaptor(PresidentList presidents){
        this.presidents = presidents;
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View view = inflater.inflate(R.layout.president_pager_item, null);
        TextView name = (TextView) view.findViewById(R.id.name); //There's no method "findViewById"
        //in PagerAdaptor
        TextView number = (TextView) view.findViewById(R.id.number);
        TextView tookOffice = (TextView) view.findViewById(R.id.tookOffice);
        TextView leftOffice = (TextView) view.findViewById(R.id.leftOffice);
        TextView party = (TextView) view.findViewById(R.id.party);
        TextView life = (TextView) view.findViewById(R.id.life);

        Presidents president = presidents.get(position);
        name.setText(president.getPresident());
        number.setText(String.valueOf(president.getNumber()));
        tookOffice.setText(president.getTookOffice());
        leftOffice.setText(president.getLeftOffice());
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
        return presidents.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
