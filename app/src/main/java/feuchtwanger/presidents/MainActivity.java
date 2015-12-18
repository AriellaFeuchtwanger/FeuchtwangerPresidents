package feuchtwanger.presidents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity implements OnPresidentSelectedListener{
    private PresidentListFragment listFragment;
    private PresidentDetailFragment detailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        listFragment = (PresidentListFragment) manager.findFragmentById(R.id.listFragment);
        detailFragment = (PresidentDetailFragment) manager.findFragmentById(R.id.detailFragment);

    }

    @Override
    public void onSelect(Presidents[] presidents, int position, int[] pics){
        if (detailFragment != null) {
            detailFragment.showPresidentDetail(presidents, position, pics);
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("PRESIDENTS", presidents);
            intent.putExtra("POSITION", position);
            intent.putExtra("IMAGES", pics);
            this.startActivity(intent);
        }
    }
}
