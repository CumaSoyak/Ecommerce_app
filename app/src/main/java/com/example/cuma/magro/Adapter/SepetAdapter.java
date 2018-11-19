package com.example.cuma.magro.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cuma.magro.Class.Sepet;
import com.example.cuma.magro.R;

import java.util.ArrayList;
import java.util.List;

public class SepetAdapter extends RecyclerView.Adapter<SepetAdapter.MyViewHolder> {
    public List<Sepet> sepetList = new ArrayList<>();

    public SepetAdapter(List<Sepet> sepetList) {
        this.sepetList = sepetList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sepet_show_cardview, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.urun_isim_sepet.setText(sepetList.get(i).getUrun_isim_sepet());
        myViewHolder.beden_sepet.setText(sepetList.get(i).getBeden_sepet());
        myViewHolder.renk_sepet.setText(sepetList.get(i).getRenk_sepet());
        myViewHolder.fiyat_sepet.setText(sepetList.get(i).getFiyat_sepet());
        myViewHolder.urun_resim_sepet.setImageResource(sepetList.get(i).getUrun_resim_sepet());
    }

    @Override
    public int getItemCount() {
        return sepetList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView urun_isim_sepet, beden_sepet, renk_sepet, fiyat_sepet;
        private ImageView urun_resim_sepet;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            urun_isim_sepet = itemView.findViewById(R.id.urun_isim_sepet);
            beden_sepet = itemView.findViewById(R.id.beden_sepet);
            renk_sepet = itemView.findViewById(R.id.renk_sepet);
            fiyat_sepet = itemView.findViewById(R.id.fiyat_sepet);
            urun_resim_sepet = itemView.findViewById(R.id.urun_resim_sepet);


        }
    }
}
