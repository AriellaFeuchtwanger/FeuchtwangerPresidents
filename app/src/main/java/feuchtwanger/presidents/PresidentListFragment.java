package feuchtwanger.presidents;

/**
 * Created by student1 on 12/10/2015.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;

public class PresidentListFragment extends Fragment{
    private RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_president_list, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = (RecyclerView) view.findViewById(R.id.list);
        //set up how the recycler view looks
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        GsonBuilder builder = new GsonBuilder();
        builder.setFieldNamingStrategy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);

        Gson gson = builder.create();

        InputStream in = getResources().openRawResource(R.raw.presidents);

        Presidents[] presidents = gson.fromJson(new InputStreamReader(in), Presidents[].class);

       int[] pics = new int[]{R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6,
                R.drawable.p7, R.drawable.p8, R.drawable.p9, R.drawable.p10, R.drawable.p11, R.drawable.p12,
                R.drawable.p13, R.drawable.p14, R.drawable.p15, R.drawable.p16, R.drawable.p17, R.drawable.p18,
                R.drawable.p19, R.drawable.p20, R.drawable.p21, R.drawable.p22, R.drawable.p23, R.drawable.p24,
                R.drawable.p25, R.drawable.p26, R.drawable.p27, R.drawable.p28, R.drawable.p29, R.drawable.p30,
                R.drawable.p31, R.drawable.p32, R.drawable.p33, R.drawable.p34, R.drawable.p35, R.drawable.p36,
                R.drawable.p37, R.drawable.p38, R.drawable.p39, R.drawable.p40, R.drawable.p41, R.drawable.p42,
                R.drawable.p43, R.drawable.p44};

        PresidentAdaptor adaptor = new PresidentAdaptor(presidents, pics);
        recyclerView.setAdapter(adaptor);
    }
}

