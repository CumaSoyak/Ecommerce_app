package com.example.cuma.magro.Fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import com.example.cuma.magro.Adapter.ShopAdapter;
import com.example.cuma.magro.R;
import com.example.cuma.magro.ShopFragment.Shop_Aksesuar_Fragment;
import com.example.cuma.magro.ShopFragment.Shop_Ayakkabi_Fragment;
import com.example.cuma.magro.ShopFragment.Shop_Bebek_Fragment;
import com.example.cuma.magro.ShopFragment.Shop_Cocuk_Fragment;
import com.example.cuma.magro.ShopFragment.Shop_Erkek_Fragment;
import com.example.cuma.magro.ShopFragment.Shop_Kadin_Fragment;


public class ShopFragment extends Fragment {
    private ViewPager viewPager;
    private ShopAdapter shopAdapter;
    public TabLayout tabLayout;
    int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public ShopFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shop, container, false);

        shopAdapter = new ShopAdapter(getChildFragmentManager());
        viewPager = view.findViewById(R.id.shop_viewpager);
        setup_viewpager(viewPager);

        tabLayout = view.findViewById(R.id.shop_tablayout);
        tabLayout.setupWithViewPager(viewPager);
        String[] tabString = {"ERKEK", "KADIN", "BEBEK", "ÇOCUK", "AYAKKABI", "AKSESUAR"};
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                position = tab.getPosition();
                Log.i("Position", ":" + position);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }

    public void setup_viewpager(ViewPager viewPager) {
        ShopAdapter adapter = new ShopAdapter(getChildFragmentManager());
        adapter.addFragment(new Shop_Kadin_Fragment(), "Kadin");
        adapter.addFragment(new Shop_Erkek_Fragment(), "Erkek");
        adapter.addFragment(new Shop_Cocuk_Fragment(), "Çocuk");
        adapter.addFragment(new Shop_Bebek_Fragment(), "Bebek");
        adapter.addFragment(new Shop_Ayakkabi_Fragment(), "Ayakkabı");
        adapter.addFragment(new Shop_Aksesuar_Fragment(), "Aksesuar");
        viewPager.setAdapter(adapter);
        /**/
    }


}
