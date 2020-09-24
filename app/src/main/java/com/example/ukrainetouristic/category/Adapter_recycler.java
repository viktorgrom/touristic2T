package com.example.ukrainetouristic.category;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ukrainetouristic.detail.DetailPlaceInfo;
import com.example.ukrainetouristic.R;

import java.util.List;

public class Adapter_recycler extends RecyclerView.Adapter<Adapter_recycler.myViewHolder> {

    Context mContext;
    public List<ItemCategory> mData;

    public Adapter_recycler(Context mContext, List<ItemCategory> mData) {
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
    public void onBindViewHolder(@NonNull final myViewHolder holder, final int position) {

        holder.background_img.setImageResource(mData.get(position).getBackground());
        holder.tv_title.setText(mData.get(position).getProfileName());
        holder.tv_short_describe.setText(mData.get(position).getProfileDescribe());
        holder.tv_long_describe.setText(mData.get(position).getProfileLongDescribe());
        // set clicklistener
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = null;
                mData.get(position);

                intent = new Intent(mContext, DetailPlaceInfo.class);
                intent.putExtra(DetailPlaceInfo.EXTRA_MOUNTAIN, (Parcelable) mData.get(position));

                mContext.startActivity(intent);

                Toast.makeText(v.getContext(), "Гарний вибір №" + (position + 1), Toast.LENGTH_SHORT).show();


            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
        ImageView background_img;
        TextView tv_title, tv_short_describe, tv_long_describe;


        public myViewHolder(View itemView) {
            super(itemView);
            background_img = itemView.findViewById(R.id.card_background);
            tv_title = itemView.findViewById(R.id.card_title);
            tv_short_describe = itemView.findViewById(R.id.short_describe_place);
            tv_long_describe = itemView.findViewById(R.id.tv_long_describe);

        }
    }

}
