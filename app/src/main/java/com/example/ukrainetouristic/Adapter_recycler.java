package com.example.ukrainetouristic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter_recycler extends RecyclerView.Adapter<Adapter_recycler.myViewHolder> {

    Context mContext;
    List<item> mData;

    public Adapter_recycler(Context mContext, List<item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.list_item, parent, false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.background_img.setImageResource(mData.get(position).getBackground());
        holder.tv_title.setText(mData.get(position).getProfileName());
        holder.tv_short_describe.setText(mData.get(position).getProfileDescribe());

    }

    @Override
    public int getItemCount() {
        return mData.size() ;
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        ImageView background_img;
        TextView tv_title, tv_short_describe;




        public myViewHolder (View itemView) {
            super(itemView);
            background_img = itemView.findViewById(R.id.card_background);
            tv_title = itemView.findViewById(R.id.card_title);
            tv_short_describe = itemView.findViewById(R.id.short_describe_place);
        }
    }
}
