package com.Seyed.boomghardi;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {

    Typeface typeface;
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
        typeface = Typeface.createFromAsset(context.getAssets(), "shazdemosafer.ttf");
        holder.Txtstar.setTypeface(typeface);
        holder.Txtstar2.setTypeface(typeface);
        holder.Txtstar3.setTypeface(typeface);
        holder.Txtstar4.setTypeface(typeface);
        holder.Txtstar5.setTypeface(typeface);
        holder.txt_title.setText(mData.get(position).getTitle());
        holder.Img_item.setImageResource(mData.get(position).getThumbnail());
        holder.txt_item2.setText(mData.get(position).getCategory());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "", Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        Typeface typeface;
        TextView txt_title, txt_item2, Txtstar,Txtstar2,Txtstar3,Txtstar4,Txtstar5;
        ImageView Img_item;
        CardView cardView;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            Txtstar = (TextView) itemView.findViewById(R.id.Txtstar);
            Txtstar2 = (TextView) itemView.findViewById(R.id.Txtstar2);
            Txtstar3 = (TextView) itemView.findViewById(R.id.Txtstar3);
            Txtstar4 = (TextView) itemView.findViewById(R.id.Txtstar4);
            Txtstar5 = (TextView) itemView.findViewById(R.id.Txtstar5);
            txt_item2 = (TextView) itemView.findViewById(R.id.txt_item2);
            txt_title = (TextView) itemView.findViewById(R.id.txt_title);
            Img_item = (ImageView) itemView.findViewById(R.id.Img_item);
            cardView = (CardView) itemView.findViewById(R.id.Cardview_item);
        }
    }

}
