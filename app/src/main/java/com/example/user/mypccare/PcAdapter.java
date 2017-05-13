package com.example.user.mypccare;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by USER on 11/05/2017.
 */

public class PcAdapter extends RecyclerView.Adapter<PcAdapter.MyViewHolder> {

    List<PcModel> pcModelList;
    Context context;


    public PcAdapter(Context context, List<PcModel> pcModelList){
        this.pcModelList = pcModelList;
        this.context = context;
    }


    @Override
    public PcAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PcAdapter.MyViewHolder holder, int position) {
        final PcModel pcModel = pcModelList.get(position);

        holder.judul.setText(pcModel.getNamaIndo());
        holder.gambar.setImageResource(pcModel.getGambar());

        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(context.getApplicationContext(), DetailActivity.class);
                i.putExtra("PC",pcModel);
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return pcModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView judul;
        ImageView gambar;
        LinearLayout layout;

        public MyViewHolder(View itemView) {
            super(itemView);

            judul = (TextView) itemView.findViewById(R.id.judul);
            gambar = (ImageView) itemView.findViewById(R.id.gambar);
            layout = (LinearLayout) itemView.findViewById(R.id.layout);

        }
    }
}