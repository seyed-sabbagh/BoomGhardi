package com.Seyed.boomghardi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {

    private Context context;
    private List<ModelBoomGardi> mData;

    public RecyclerviewAdapter(Context context, List<ModelBoomGardi> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mlayoutInflater = LayoutInflater.from(context);
        view = mlayoutInflater.inflate(R.layout.cardview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerviewAdapter.ViewHolder holder, int position) {

        holder.txt_item.setText(mData.get(position).getTitle());
        holder.Img_item.setImageResource(mData.get(position).getThumbnail());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_item;
        ImageView Img_item;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            txt_item = (TextView) itemView.findViewById(R.id.txt_item);
            Img_item = (ImageView) itemView.findViewById(R.id.Img_item);
        }
    }

}
