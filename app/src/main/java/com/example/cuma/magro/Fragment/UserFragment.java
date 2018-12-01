package com.example.cuma.magro.Fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.cuma.magro.R;
import com.example.cuma.magro.Uyelik_Fragment.GirisFragment;
import com.example.cuma.magro.Uyelik_Fragment.UyeolFragment;
import com.example.cuma.magro.Uyelik_Fragment.UyeolmadanAlisverisFragment;


public class UserFragment extends Fragment {
    RadioGroup uyelik_radioGroup;
    RadioButton uye_girisi, uye_kayit, uye_olmadan_alisveris;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    GirisFragment girisFragment = new GirisFragment();
    UyeolFragment uyeolFragment = new UyeolFragment();
    UyeolmadanAlisverisFragment uyeolmadanAlisverisFragment = new UyeolmadanAlisverisFragment();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);

        uyelik_radioGroup = view.findViewById(R.id.uyelik_radioGroup);
        uye_girisi = view.findViewById(R.id.uye_girisi);
        uye_kayit = view.findViewById(R.id.uye_kayit);
        uye_olmadan_alisveris = view.findViewById(R.id.uye_olmadan_alisveris);
        secilen_form();

        return view;
    }

    private void openFragment(final Fragment fragment) {
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_uyelik, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    public void secilen_form() {
        uye_girisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment(girisFragment);

            }
        });
        uye_kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment(uyeolFragment);

            }
        });
        uye_olmadan_alisveris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFragment(uyeolmadanAlisverisFragment);
            }
        });

    }


}
