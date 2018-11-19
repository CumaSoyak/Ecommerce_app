package com.example.cuma.magro.ShopFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cuma.magro.Adapter.KategorilerAdapter_Erkek;
import com.example.cuma.magro.Adapter.KategorilerAdapter_Kadin;
import com.example.cuma.magro.Class.Kategoriler;
import com.example.cuma.magro.R;

import java.util.ArrayList;


public class Shop_Erkek_Fragment extends Fragment {


    private ArrayList<Kategoriler> kategorilerList;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private KategorilerAdapter_Erkek kategorilerAdapter_erkek;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shop__erkek_, container, false);
        recyclerView = view.findViewById(R.id.kategori_erkek_recylerview);
        kategorilerList = new ArrayList<Kategoriler>();
        kategorilerAdapter_erkek = new KategorilerAdapter_Erkek(getContext(), kategorilerList);
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(kategorilerAdapter_erkek);
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.erkekgiyim, "kadin"));


        return view;
    }

}
