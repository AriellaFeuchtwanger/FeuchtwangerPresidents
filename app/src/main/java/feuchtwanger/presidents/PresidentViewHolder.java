package feuchtwanger.presidents;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PresidentViewHolder extends RecyclerView.ViewHolder{

    private ImageView image;

    public PresidentViewHolder (View itemView){
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.image);
    }

    public void bind(int president){
        image.setImageResource(president);
    }
}
