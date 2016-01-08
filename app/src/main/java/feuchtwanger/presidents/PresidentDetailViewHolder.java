package feuchtwanger.presidents;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by student1 on 1/7/2016.
 */
public class PresidentDetailViewHolder {
    @Bind(R.id.name)
    TextView name;
    @Bind(R.id.number)
    TextView number;
    @Bind(R.id.image)
    ImageView image;
    @Bind(R.id.office)
    TextView office;
    @Bind(R.id.party)
    TextView party;
    @Bind(R.id.life)
    TextView life;

    public PresidentDetailViewHolder(View ItemView, Presidents president, int[] pics){
        ButterKnife.bind(this, ItemView);
        name.setText(president.getPresident());
        number.setText(String.valueOf(president.getNumber()));

        int picNumber = president.getNumber();
        picNumber-=1;
        image.setImageResource(pics[picNumber]);

        if(president.getLeftOffice() == null){
            office.setText(president.getTookOffice() + " - present");
        } else {
            office.setText(president.getTookOffice() + " - " + president.getLeftOffice());
        }
        party.setText(president.getParty());
        if(president.getDeathYear() == null){
            life.setText(president.getBirthYear() + " - present");
        } else{
            life.setText(president.getBirthYear() + " - " + president.getDeathYear());
        }
    }
}
