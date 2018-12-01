package com.example.cuma.magro.Uyelik_Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.cuma.magro.R;


public class UyeolmadanAlisverisFragment extends Fragment {


    /*Uye olmadan alısveris*/
    EditText uye_olmadan_alisveris_email;
    CheckBox uye_olmadan_alisveris_checxbox;
    Button uye_olmadan_alisveris_alisveris_yap;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_uyeolmadan_alisveris, container, false);

        /*Uye olmadan alısveris yap*/
        uye_olmadan_alisveris_email = view.findViewById(R.id.uye_olmadan_alisveris_email);
        uye_olmadan_alisveris_checxbox = view.findViewById(R.id.uye_olmadan_alisveris_checxbox);
        uye_olmadan_alisveris_alisveris_yap = view.findViewById(R.id.uye_olmadan_alisveris_alisveris_yap);


        return view;
    }

}
