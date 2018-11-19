package com.example.cuma.magro.ShopFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cuma.magro.Adapter.KategorilerAdapter_Cocuk;
import com.example.cuma.magro.Adapter.KategorilerAdapter_Erkek;
import com.example.cuma.magro.Class.Kategoriler;
import com.example.cuma.magro.R;

import java.util.ArrayList;

public class Shop_Cocuk_Fragment extends Fragment {


    private ArrayList<Kategoriler> kategorilerList;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private KategorilerAdapter_Cocuk kategorilerAdapter_cocuk;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View view=inflater.inflate(R.layout.fragment_shop__cocuk_, container, false);
        recyclerView = view.findViewById(R.id.kategori_cocuk_recylerview);
        kategorilerList = new ArrayList<Kategoriler>();
        kategorilerAdapter_cocuk = new KategorilerAdapter_Cocuk(getContext(), kategorilerList);
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(kategorilerAdapter_cocuk);
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));
        kategorilerList.add(new Kategoriler(R.drawable.cocukgiyim, "Cocuk"));


     return view;
    }

}
