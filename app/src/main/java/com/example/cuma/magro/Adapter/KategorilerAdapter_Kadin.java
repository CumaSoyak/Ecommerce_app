package com.example.cuma.magro.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cuma.magro.Class.Kategoriler;
import com.example.cuma.magro.Fragment.ShopFragment;
import com.example.cuma.magro.Fragment.Urunler_listele_Fragment;
import com.example.cuma.magro.R;
import java.util.ArrayList;
import java.util.List;

public class KategorilerAdapter_Kadin extends RecyclerView.Adapter<KategorilerAdapter_Kadin.MyViewHolder> {
    private FragmentManager mFragmentManager;
    FragmentTransaction fragmentTransaction;
    ShopFragment shopFragment = new ShopFragment();


    private Context context;
    private List<Kategoriler> kateogorilerList = new ArrayList<>();

    public KategorilerAdapter_Kadin(Context context, List<Kategoriler> kategorilerList) {
        this.context = context;
        this.kateogorilerList = kategorilerList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.kategori_show_cardview, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder,final int i) {
        Kategoriler currentItem=kateogorilerList.get(i); //todo gecerli urun youtobe
        myViewHolder.kategori_resim.setImageResource(kateogorilerList.get(i).getKategori_resim());
        myViewHolder.kateori_isim.setText(kateogorilerList.get(i).getKategori_isim());
        myViewHolder.kategori_cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,String.valueOf(100 +i),Toast.LENGTH_LONG).show();
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.urunlistele_kadin, new Urunler_listele_Fragment()).addToBackStack(null).commit();

//todo list app bar layout positon al

            }
        });

    }

    @Override
    public int getItemCount() {
        return kateogorilerList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView kateori_isim;
        private ImageView kategori_resim;
        private CardView kategori_cardview;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            kateori_isim = itemView.findViewById(R.id.kateori_isim);
            kategori_resim = itemView.findViewById(R.id.kategori_resim);
            kategori_cardview = itemView.findViewById(R.id.kategori_cardview);


        }
    }
}


