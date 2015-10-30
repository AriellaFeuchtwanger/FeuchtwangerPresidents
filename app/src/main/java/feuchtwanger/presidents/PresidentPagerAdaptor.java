package feuchtwanger.presidents;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

        Presidents president = presidents.get(position);
        name.setText(president.getPresident());
        number.setText(String.valueOf(president.getNumber()));

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
