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
    private OnPresidentSelectedListener listener;

    public PresidentAdaptor(Presidents[] presidents, int[] pics, OnPresidentSelectedListener listener){
        this.presidents = presidents;
        this.pics = pics;
        this.listener = listener;
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
        holder.bind(presidents[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onSelect(presidents, position, pics);
            }
        });
    }

    @Override
    public int getItemCount() {
        return presidents.length;
    }
}
