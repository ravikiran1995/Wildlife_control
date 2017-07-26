package com.example.ravikiran.wildlife;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;
/**
 * Created by RaviKiran on 7/25/2017.
 */

public class View_crime_adapter extends RecyclerView.Adapter<View_crime_adapter.ViewHolder> {

    private Context context;
    private List<upload_crime_info> uploads;

    public View_crime_adapter(Context context, List<upload_crime_info> uploads) {
        this.uploads = uploads;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.crime_card, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        upload_crime_info upload = uploads.get(position);

        holder.Animal_Name.setText(upload.getAnimal_name());
        holder.Animal_Condition.setText(upload.getAnimal_condition());
        holder.Animal_Location.setText(upload.getLocation());
        Glide.with(context).load(upload.getImgurl()).into(holder.Animal_Image);
    }

    @Override
    public int getItemCount() {
        return uploads.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView Animal_Name;
        public TextView Animal_Location;
        public TextView Animal_Species;
        public TextView Animal_Condition;
        public TextView Animal_offense;

        public ImageView Animal_Image;

        public ViewHolder(View itemView) {
            super(itemView);
            Animal_Condition= (TextView) itemView.findViewById(R.id.tv_animalCondition);
            Animal_Location= (TextView) itemView.findViewById(R.id.tv_animalLocation);
            Animal_Name = (TextView) itemView.findViewById(R.id.tv_Animal);
            Animal_Image = (ImageView) itemView.findViewById(R.id.iv_AnimalImg);
        }
    }
}
