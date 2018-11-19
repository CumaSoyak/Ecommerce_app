package com.example.cuma.magro.ShopFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cuma.magro.Adapter.KategorilerAdapter_Ayakkabi;
import com.example.cuma.magro.Adapter.KategorilerAdapter_Bebek;
import com.example.cuma.magro.Class.Kategoriler;
import com.example.cuma.magro.R;

import java.util.ArrayList;

public class Shop_Ayakkabi_Fragment extends Fragment {

    private ArrayList<Kategoriler> kategorilerList;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private KategorilerAdapter_Ayakkabi kategorilerAdapter_ayakkabi;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop__ayakkabi_, container, false);
        recyclerView = view.findViewById(R.id.kategori_ayakkabi_recylerview);
        kategorilerList = new ArrayList<Kategoriler>();
        kategorilerAdapter_ayakkabi = new KategorilerAdapter_Ayakkabi(getContext(), kategorilerList);
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(kategorilerAdapter_ayakkabi);
        kategorilerList.add(new Kategoriler(R.drawable.ayakkabigiyim, "ayakkabı"));
        kategorilerList.add(new Kategoriler(R.drawable.ayakkabigiyim, "ayakkabı"));
        kategorilerList.add(new Kategoriler(R.drawable.ayakkabigiyim, "ayakkabı"));
        kategorilerList.add(new Kategoriler(R.drawable.ayakkabigiyim, "ayakkabı"));
        kategorilerList.add(new Kategoriler(R.drawable.ayakkabigiyim, "ayakkabı"));
        kategorilerList.add(new Kategoriler(R.drawable.ayakkabigiyim, "ayakkabı"));
        kategorilerList.add(new Kategoriler(R.drawable.ayakkabigiyim, "ayakkabı"));
        kategorilerList.add(new Kategoriler(R.drawable.ayakkabigiyim, "ayakkabı"));
        kategorilerList.add(new Kategoriler(R.drawable.ayakkabigiyim, "ayakkabı"));
        kategorilerList.add(new Kategoriler(R.drawable.ayakkabigiyim, "ayakkabı"));
        kategorilerList.add(new Kategoriler(R.drawable.ayakkabigiyim, "ayakkabı"));
        return view;
    }

}
