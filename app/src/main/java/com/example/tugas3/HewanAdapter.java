package com.example.tugas3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

public class HewanAdapter extends RecyclerView.Adapter<com.example.card_view.MyViewHolder> {
    List<com.example.card_view.HewanData> listHewanData = Collections.emptyList();
    Context context;
    AdapterView.OnItemClickListener click;
    public HewanAdapter(List<com.example.card_view.HewanData> listHewanData, Context context) {
        this.listHewanData = listHewanData;
        this.context = context;
    }
    @Override
    public com.example.card_view.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_layout,parent,false);
        com.example.card_view.MyViewHolder mvh = new com.example.card_view.MyViewHolder(v);
        return mvh;
    }
    @Override
    public void onBindViewHolder(@NonNull com.example.card_view.MyViewHolder holder, int position) {
        holder.myTextView1.setText(listHewanData.get(position).getName());
        holder.myTextView2.setText(listHewanData.get(position).getTag());
        holder.myImageView.setImageResource(listHewanData.get(position).getImage());
        holder.myTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent description = new Intent(v.getContext(), HewanDescription.class);
                description.putExtra("name" , listHewanData.get(position).getName());
                description.putExtra("tag" , listHewanData.get(position).getTag());
                description.putExtra("description" , listHewanData.get(position).getDescription());
                description.putExtra("image", listHewanData.get(position).getImage());
                v.getContext().startActivity(description);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHewanData.size();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder {
TextView myTextView1 , myTextView2;
ImageView myImageView;
MyViewHolder(View itemView){
    super(itemView);
    myTextView1 = itemView.findViewById(R.id.name);
    myTextView2 = itemView.findViewById(R.id.tag);
    myImageView = itemView.findViewById(R.id.ilustration);
}
}
