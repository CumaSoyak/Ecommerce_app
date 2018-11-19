package com.example.cuma.magro.ShopFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cuma.magro.Adapter.KategorilerAdapter_Aksesuar;
import com.example.cuma.magro.Adapter.KategorilerAdapter_Ayakkabi;
import com.example.cuma.magro.Class.Kategoriler;
import com.example.cuma.magro.R;

import java.util.ArrayList;


public class Shop_Aksesuar_Fragment extends Fragment {


    private ArrayList<Kategoriler> kategorilerList;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private KategorilerAdapter_Aksesuar kategorilerAdapter_aksesuar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop__aksesuar_, container, false);

        recyclerView = view.findViewById(R.id.kategori_aksesuar_recylerview);
        kategorilerList = new ArrayList<Kategoriler>();
        kategorilerAdapter_aksesuar = new KategorilerAdapter_Aksesuar(getContext(), kategorilerList);
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(kategorilerAdapter_aksesuar);
        kategorilerList.add(new Kategoriler(R.drawable.aksesuargiyim, "aksesuar"));
        kategorilerList.add(new Kategoriler(R.drawable.aksesuargiyim, "aksesuar"));
        kategorilerList.add(new Kategoriler(R.drawable.aksesuargiyim, "aksesuar"));
        kategorilerList.add(new Kategoriler(R.drawable.aksesuargiyim, "aksesuar"));
        kategorilerList.add(new Kategoriler(R.drawable.aksesuargiyim, "aksesuar"));
        kategorilerList.add(new Kategoriler(R.drawable.aksesuargiyim, "aksesuar"));
        kategorilerList.add(new Kategoriler(R.drawable.aksesuargiyim, "aksesuar"));
        kategorilerList.add(new Kategoriler(R.drawable.aksesuargiyim, "aksesuar"));
        kategorilerList.add(new Kategoriler(R.drawable.aksesuargiyim, "aksesuar"));
        kategorilerList.add(new Kategoriler(R.drawable.aksesuargiyim, "aksesuar"));
        return view;
    }

}
