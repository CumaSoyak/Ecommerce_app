package com.example.cuma.magro.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.cuma.magro.R;
import com.example.cuma.magro.ShopFragment.Shop_Aksesuar_Fragment;
import com.example.cuma.magro.ShopFragment.Shop_Ayakkabi_Fragment;
import com.example.cuma.magro.ShopFragment.Shop_Bebek_Fragment;
import com.example.cuma.magro.ShopFragment.Shop_Cocuk_Fragment;
import com.example.cuma.magro.ShopFragment.Shop_Erkek_Fragment;
import com.example.cuma.magro.ShopFragment.Shop_Kadin_Fragment;


public class HomeFragment extends Fragment implements View.OnClickListener {

    Button erkek_shop_button, kadin_shop_button, jean_shop_button, encok_shop_button,
            cocuk_shop_button, bebek_shop_button, ayakkabi_shop_button, aksesuar_shop_button;
    ImageView yeni_gelen;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    View view1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        erkek_shop_button = view.findViewById(R.id.erkek_shop_button);
        kadin_shop_button = view.findViewById(R.id.kadin_shop_button);
        jean_shop_button = view.findViewById(R.id.jean_shop_button);
        encok_shop_button = view.findViewById(R.id.encok_shop_button);
        cocuk_shop_button = view.findViewById(R.id.cocuk_shop_button);
        bebek_shop_button = view.findViewById(R.id.bebek_shop_button);
        ayakkabi_shop_button = view.findViewById(R.id.ayakkabi_shop_button);
        aksesuar_shop_button = view.findViewById(R.id.aksesuar_shop_button);
        yeni_gelen=view.findViewById(R.id.yeni_gelen);
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();


        erkek_shop_button.setOnClickListener(this);
        kadin_shop_button.setOnClickListener(this);
        jean_shop_button.setOnClickListener(this);
        encok_shop_button.setOnClickListener(this);
        cocuk_shop_button.setOnClickListener(this);
        bebek_shop_button.setOnClickListener(this);
        ayakkabi_shop_button.setOnClickListener(this);
        aksesuar_shop_button.setOnClickListener(this);
        yeni_gelen.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.erkek_shop_button:
                fragmentTransaction.replace(R.id.fragment_home, new Shop_Erkek_Fragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.kadin_shop_button:
                fragmentTransaction.replace(R.id.fragment_home, new Shop_Kadin_Fragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.jean_shop_button:
              /*  fragmentTransaction.replace(R.id.fragment_home, new Shop_Kadin_Fragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/
                break;
            case R.id.encok_shop_button:
              /*  fragmentTransaction.replace(R.id.fragment_home, new Shop_Kadin_Fragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/
                break;
            case R.id.cocuk_shop_button:
                fragmentTransaction.replace(R.id.fragment_home, new Shop_Cocuk_Fragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.bebek_shop_button:
                fragmentTransaction.replace(R.id.fragment_home, new Shop_Bebek_Fragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.ayakkabi_shop_button:
                fragmentTransaction.replace(R.id.fragment_home, new Shop_Ayakkabi_Fragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.aksesuar_shop_button:
                fragmentTransaction.replace(R.id.fragment_home, new Shop_Aksesuar_Fragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case  R.id.yeni_gelen:
           /*   fragmentTransaction.replace(R.id.fragment_home, new Shop_YeniGelen_Fragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/
                break;
        }
    }
}
