package feuchtwanger.presidents;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        Presidents[] presidents = (Presidents[]) getIntent().getSerializableExtra("PRESIDENTS");
        PresidentPagerAdaptor adaptor = new PresidentPagerAdaptor(presidents);
        viewPager.setAdapter(adaptor);

        int position = getIntent().getIntExtra("POSITION", 0);
        viewPager.setCurrentItem(position);
    }
}
