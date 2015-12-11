package feuchtwanger.presidents;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PresidentDetailFragment extends Fragment {
    public ViewPager viewPager;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_president_detail, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
    }

    public void showPresidentDetail(Presidents[] presidents, int position, int[] pics){
        PresidentPagerAdaptor adaptor = new PresidentPagerAdaptor(presidents, pics);
        viewPager.setAdapter(adaptor);
        viewPager.setCurrentItem(position);
    }
}
