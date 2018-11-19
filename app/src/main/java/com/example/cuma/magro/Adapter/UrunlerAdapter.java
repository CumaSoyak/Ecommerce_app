package com.example.cuma.magro.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cuma.magro.Activity.GosterActivity;
import com.example.cuma.magro.Activity.MainActivity;
import com.example.cuma.magro.Class.Urunler;
import com.example.cuma.magro.R;

import java.util.ArrayList;
import java.util.List;

public class UrunlerAdapter extends RecyclerView.Adapter<UrunlerAdapter.MyViewHolder> {
    private Context context;
    public List<Urunler> urunlerList = new ArrayList<>();

    public UrunlerAdapter(Context context, List<Urunler> urunlerList) {
        this.urunlerList = urunlerList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.urun_show_cardview, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
        myViewHolder.urun_resim.setImageResource(urunlerList.get(i).getUrun_resim());
        myViewHolder.urun_aciklama.setText(urunlerList.get(i).getUrun_aciklama());
        myViewHolder.urun_fiyat.setText(urunlerList.get(i).getUrun_fiyat());
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,String.valueOf(i),Toast.LENGTH_LONG).show();
                Log.i("Goster", ":"+ urunlerList.get(i));
                Intent ıntent = new Intent(context, GosterActivity.class);
                ıntent.putExtra("urunaciklama",i);
                context.startActivity(ıntent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return urunlerList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView urun_aciklama, urun_fiyat;
        private ImageView urun_resim;
        private CardView cardView;

        public MyViewHolder(View view) {
            super(view);
            urun_aciklama = view.findViewById(R.id.urun_aciklama);
            urun_fiyat = view.findViewById(R.id.urun_fiyat);
            urun_resim = view.findViewById(R.id.urun_resim);
            cardView = view.findViewById(R.id.urun_show);
        }
    }
}
