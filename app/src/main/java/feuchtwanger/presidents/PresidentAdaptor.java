package feuchtwanger.presidents;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


public class PresidentAdaptor extends RecyclerView.Adapter<PresidentViewHolder> {
    private Presidents[] presidents;
    private int[] pics;
    public PresidentAdaptor(Presidents[] presidents, int[] pics){
        this.presidents = presidents;
        this.pics = pics;
    }

    //The next two methods create the president and bind it there
    @Override
    public PresidentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.president_list_item, parent, false);
        return new PresidentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final PresidentViewHolder holder, final int position) {
        holder.bind(pics[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Context context = holder.itemView.getContext();
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("PRESIDENTS", presidents);
                intent.putExtra("POSITION", position);
                intent.putExtra("IMAGES", pics);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return presidents.length;
    }
}
