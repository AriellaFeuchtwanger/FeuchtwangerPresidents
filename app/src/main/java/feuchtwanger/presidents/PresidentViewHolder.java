package feuchtwanger.presidents;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PresidentViewHolder extends RecyclerView.ViewHolder{

 //   private ImageView image;

//    public PresidentViewHolder (View itemView){
  //      super(itemView);
    //    image = (ImageView) itemView.findViewById(R.id.image);
    //}

    private TextView name;

    public PresidentViewHolder(View itemView) {
        super(itemView);
        //tell the class that holds the view that its connected to the president adapter
        //the adapter connects to the president class
        name = (TextView) itemView.findViewById(R.id.name);
    }

    public void bind(Presidents president) {
        name.setText(president.getPresident()); //get the name
    }
    //public void bind(int president){
        //image.setImageResource(president);
   // }
}
