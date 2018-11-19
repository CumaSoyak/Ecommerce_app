package com.example.cuma.magro.ShopFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cuma.magro.Adapter.KategorilerAdapter_Bebek;
import com.example.cuma.magro.Adapter.KategorilerAdapter_Cocuk;
import com.example.cuma.magro.Class.Kategoriler;
import com.example.cuma.magro.R;

import java.util.ArrayList;


public class Shop_Bebek_Fragment extends Fragment {

    private ArrayList<Kategoriler> kategorilerList;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private KategorilerAdapter_Bebek kategorilerAdapter_bebek;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view= inflater.inflate(R.layout.fragment_shop__bebek_, container, false);
        recyclerView = view.findViewById(R.id.kategori_bebek_recylerview);
        kategorilerList = new ArrayList<Kategoriler>();
        kategorilerAdapter_bebek = new KategorilerAdapter_Bebek(getContext(), kategorilerList);
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(kategorilerAdapter_bebek);
        kategorilerList.add(new Kategoriler(R.drawable.bebekgiyim, "bebek"));
        kategorilerList.add(new Kategoriler(R.drawable.bebekgiyim, "bebek"));
        kategorilerList.add(new Kategoriler(R.drawable.bebekgiyim, "bebek"));
        kategorilerList.add(new Kategoriler(R.drawable.bebekgiyim, "bebek"));
        kategorilerList.add(new Kategoriler(R.drawable.bebekgiyim, "bebek"));
        kategorilerList.add(new Kategoriler(R.drawable.bebekgiyim, "bebek"));
        kategorilerList.add(new Kategoriler(R.drawable.bebekgiyim, "bebek"));
        kategorilerList.add(new Kategoriler(R.drawable.bebekgiyim, "bebek"));
        kategorilerList.add(new Kategoriler(R.drawable.bebekgiyim, "bebek"));
        kategorilerList.add(new Kategoriler(R.drawable.bebekgiyim, "bebek"));
        kategorilerList.add(new Kategoriler(R.drawable.bebekgiyim, "bebek"));
        kategorilerList.add(new Kategoriler(R.drawable.bebekgiyim, "bebek"));
        kategorilerList.add(new Kategoriler(R.drawable.bebekgiyim, "bebek"));

    return view;
    }

}
