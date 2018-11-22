package com.example.cuma.magro.Fragment;


import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cuma.magro.Adapter.UrunlerAdapter;
import com.example.cuma.magro.Class.Urunler;
import com.example.cuma.magro.R;

import java.util.ArrayList;


public class Urunler_listele_Fragment extends Fragment {

    private ArrayList<Urunler> urunlerList;
    private RecyclerView recyclerView;
    private UrunlerAdapter urunlerAdapter;
    private GridLayoutManager gridLayoutManager;
    private Button filtrele, sirala, fiyat_artan, fiyat_azalan, indirim_oranı, urun_filtrele_urun_goster;
    private TextView urun_filtrele_dialog_vazgec,urun_sirala_vazgec;
    Dialog basarili_dialog;
    private String[] beden = {"32", "33"};
    private String[] renk = {"kırmızı", "mavi"};
    private String[] fiyat = {"45 TL", "78 TL"};
    private Spinner spinnerbeden, spinnerrenk, spinnerfiyat;
    private ArrayAdapter<String> dataAdapterForBeden, dataAdapterForRenk, dataAdapterForFiyat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_urunler_listele_, container, false);
        filtrele = view.findViewById(R.id.filtrele);
        sirala = view.findViewById(R.id.sirala);

        basarili_dialog = new Dialog(getActivity(), R.style.DialogNotitle);
        basarili_dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        basarili_dialog.getWindow().getAttributes().windowAnimations = R.style.Anasayfa_dilog_animasyonu;

        filtrele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                filtrele_dialog();
            }
        });
        sirala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sirala_dialog();
            }
        });

        recyclerView = view.findViewById(R.id.urun_listele_recylerview);
        urunlerList = new ArrayList<Urunler>();
        urunlerAdapter = new UrunlerAdapter(getContext(), urunlerList);

        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        //  recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(urunlerAdapter);
        //todo buraya zaten veri tabanından  bilgiler gelecek kime ait olduğu felan
        //todo bütün kategoriler 1'den başlayarak sıralanıp gitmesi lazım kategori id benzersiz olmalı
        //todo gönderdiğim koda göre buraya bilgiler gelecek ve basacağım içine
        urunlerList.add(new Urunler("Çıtçıtlı Denim Gömlek", "89,99 TL", R.drawable.encoksatanlar));
        urunlerList.add(new Urunler("Çıtçıtlı Denim Gömlek", "89,99 TL", R.drawable.encoksatanlar));
        urunlerList.add(new Urunler("Çıtçıtlı Denim Gömlek", "89,99 TL", R.drawable.encoksatanlar));
        urunlerList.add(new Urunler("Çıtçıtlı Denim Gömlek", "89,99 TL", R.drawable.encoksatanlar));
        urunlerList.add(new Urunler("Çıtçıtlı Denim Gömlek", "89,99 TL", R.drawable.encoksatanlar));
        urunlerList.add(new Urunler("Çıtçıtlı Denim Gömlek", "89,99 TL", R.drawable.encoksatanlar));
        urunlerList.add(new Urunler("Çıtçıtlı Denim Gömlek", "89,99 TL", R.drawable.encoksatanlar));
        urunlerList.add(new Urunler("Çıtçıtlı Denim Gömlek", "89,99 TL", R.drawable.encoksatanlar));
        urunlerList.add(new Urunler("Çıtçıtlı Denim Gömlek", "89,99 TL", R.drawable.encoksatanlar));
        urunlerList.add(new Urunler("Çıtçıtlı Denim Gömlek", "89,99 TL", R.drawable.encoksatanlar));
        urunlerList.add(new Urunler("Çıtçıtlı Denim Gömlek", "89,99 TL", R.drawable.encoksatanlar));
        urunlerList.add(new Urunler("Çıtçıtlı Denim Gömlek", "89,99 TL", R.drawable.encoksatanlar));

        return view;
    }

    public void filtrele_dialog() {
        basarili_dialog.setContentView(R.layout.dialog_filtrele);
        urun_filtrele_urun_goster = basarili_dialog.findViewById(R.id.urun_filtrele_urun_goster);
        urun_filtrele_dialog_vazgec = basarili_dialog.findViewById(R.id.urun_filtrele_dialog_vazgec);
        spinnerbeden = basarili_dialog.findViewById(R.id.beden_spinner);
        spinnerrenk = basarili_dialog.findViewById(R.id.renk_spinner);
        spinnerfiyat = basarili_dialog.findViewById(R.id.fiyat_spinner);
        dataAdapterForBeden = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, beden);
        dataAdapterForRenk = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, renk);
        dataAdapterForFiyat = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, fiyat);

        dataAdapterForBeden.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterForRenk.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterForFiyat.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerbeden.setAdapter(dataAdapterForBeden);
        spinnerrenk.setAdapter(dataAdapterForRenk);
        spinnerfiyat.setAdapter(dataAdapterForFiyat);
        urun_filtrele_urun_goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Ürün göster", Toast.LENGTH_LONG).show();
            }
        });
        urun_filtrele_dialog_vazgec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                basarili_dialog.dismiss();
            }
        });

        basarili_dialog.show();
    }

    public void sirala_dialog() {
        basarili_dialog.setContentView(R.layout.dialog_sirala);
        urun_sirala_vazgec=basarili_dialog.findViewById(R.id.urun_sirala_vazgec);
        fiyat_artan = basarili_dialog.findViewById(R.id.fiyat_artan);
        fiyat_azalan = basarili_dialog.findViewById(R.id.fiyat_azalan);
        indirim_oranı = basarili_dialog.findViewById(R.id.indirim_orani);
        fiyat_artan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        fiyat_azalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        indirim_oranı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        urun_sirala_vazgec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                basarili_dialog.dismiss();
            }
        });
        basarili_dialog.show();
    }

}
