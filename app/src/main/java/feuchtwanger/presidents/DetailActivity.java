package feuchtwanger.presidents;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        PresidentDetailFragment fragment = (PresidentDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailFragment);
        Intent intent = getIntent();
        Presidents[] presidents = (Presidents[]) intent.getSerializableExtra("PRESIDENTS");
        int[] pics = (int[]) intent.getSerializableExtra("IMAGES");
        fragment.showPresidentDetail(presidents, intent.getIntExtra("POSITION", 0), pics);
    }
}
