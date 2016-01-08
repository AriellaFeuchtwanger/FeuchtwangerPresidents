package feuchtwanger.presidents;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PresidentViewHolder extends RecyclerView.ViewHolder{

 //   private ImageView image;

//    public PresidentViewHolder (View itemView){
  //      super(itemView);
    //    image = (ImageView) itemView.findViewById(R.id.image);
    //}
    @Bind(R.id.name)
    TextView name;

    public PresidentViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(Presidents president) {
        name.setText(president.getPresident()); //get the name
    }
    //public void bind(int president){
        //image.setImageResource(president);
   // }
}
