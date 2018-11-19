package com.example.cuma.magro.ShopFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cuma.magro.Adapter.KategorilerAdapter_Kadin;
import com.example.cuma.magro.Class.Kategoriler;
import com.example.cuma.magro.R;

import java.util.ArrayList;


public class Shop_Kadin_Fragment extends Fragment   {

    private ArrayList<Kategoriler> kategorilerList;
    private RecyclerView recyclerView;
    private KategorilerAdapter_Kadin kategorilerAdapterKadin;
    private GridLayoutManager gridLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop__kadin_, container, false);

        recyclerView = view.findViewById(R.id.kategori_kadin_recylerview);
        kategorilerList = new ArrayList<Kategoriler>();
        kategorilerAdapterKadin = new KategorilerAdapter_Kadin(getContext(), kategorilerList);
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(kategorilerAdapterKadin);
        //todo veri tabanından yüklenecek
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "kazak "));
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "mont"));
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "giysi"));
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "asdasd"));
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "kadin"));
        kategorilerList.add(new Kategoriler(R.drawable.kadin, "kadin"));


        return view;
    }



    /*
                fragmentTransaction = getFragmentManager().beginTransaction().replace(R.id.urunlistele, new  );
                fragmentTransaction.commit();

        */
}
