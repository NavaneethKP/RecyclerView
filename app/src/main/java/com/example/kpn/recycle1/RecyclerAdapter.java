package com.example.kpn.recycle1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kpn on 8/6/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    ArrayList<movie> list = new ArrayList<movie>();

    public RecyclerAdapter(ArrayList<movie> list) {
        this.list = list;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv_moviename.setText(list.get(position).name);
        holder.tv_release.setText(list.get(position).release);
        holder.iv_movie.setImageResource(list.get(position).imgid);
        holder.rb_movie.setRating(list.get(position).rating);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder{

        TextView tv_moviename,tv_release;
        ImageView iv_movie;
        RatingBar rb_movie;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tv_moviename=(TextView) itemView.findViewById(R.id.tv_moviename);
            tv_release=(TextView) itemView.findViewById(R.id.tv_release);
            iv_movie=(ImageView)itemView.findViewById(R.id.iv_movie);
            rb_movie=(RatingBar)itemView.findViewById(R.id.rb_movie);

        }
    }
}
