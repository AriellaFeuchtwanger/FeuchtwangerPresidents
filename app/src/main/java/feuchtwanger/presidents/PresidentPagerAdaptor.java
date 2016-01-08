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
        PresidentDetailViewHolder viewHolder = new PresidentDetailViewHolder(view, presidents[position], pics);

        Presidents president = presidents[position];



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
