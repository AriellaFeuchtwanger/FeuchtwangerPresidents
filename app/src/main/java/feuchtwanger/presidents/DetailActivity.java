package feuchtwanger.presidents;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        PresidentPagerAdaptor adaptor = new PresidentPagerAdaptor(MainActivity.presidents);
        viewPager.setAdapter(adaptor);

    }
}
