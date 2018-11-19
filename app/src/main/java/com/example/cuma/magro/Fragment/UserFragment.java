package com.example.cuma.magro.Fragment;


import android.app.DatePickerDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.cuma.magro.R;

import java.util.Calendar;


public class UserFragment extends Fragment {


    RadioGroup uyelik_radioGroup;
    RadioButton uye_girisi, uye_kayit, uye_olmadan_alisveris;
    ConstraintLayout uye_giris_layout, uye_kayit_layout, uye_olmadan_alisveris_layout;
    int degisken = 0;
    private DatePickerDialog.OnDateSetListener dateSetListener;
    private Button buton_gun, buton_ay, buton_yil;
    View includedLayout;
    FrameLayout frameLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);


        uyelik_radioGroup = view.findViewById(R.id.uyelik_radioGroup);
        uye_girisi = view.findViewById(R.id.uye_girisi);
        uye_kayit = view.findViewById(R.id.uye_kayit);
        uye_olmadan_alisveris = view.findViewById(R.id.uye_olmadan_alisveris);

        uye_giris_layout = view.findViewById(R.id.uye_girisi_layout);
        uye_kayit_layout = view.findViewById(R.id.uye_kayit_layout);
        uye_olmadan_alisveris_layout = view.findViewById(R.id.uye_olmadan_alisveris_layout);


        buton_gun = view.findViewById(R.id.buton_gun);
        buton_ay = view.findViewById(R.id.buton_ay);
        buton_yil = view.findViewById(R.id.buton_yıl);


        secilen_form();
        tarih_sec();



        return view;
    }



    public void secilen_form() {

        uye_giris_layout.setVisibility(View.VISIBLE);
        uye_kayit_layout.setVisibility(View.GONE);
        uye_olmadan_alisveris_layout.setVisibility(View.GONE);

        uye_girisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uye_giris_layout.setVisibility(View.VISIBLE);
                uye_kayit_layout.setVisibility(View.GONE);
                uye_olmadan_alisveris_layout.setVisibility(View.GONE);

            }
        });
        uye_kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uye_giris_layout.setVisibility(View.GONE);
                uye_kayit_layout.setVisibility(View.VISIBLE);
                uye_olmadan_alisveris_layout.setVisibility(View.GONE);

            }
        });
        uye_olmadan_alisveris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uye_giris_layout.setVisibility(View.GONE);
                uye_kayit_layout.setVisibility(View.GONE);
                uye_olmadan_alisveris_layout.setVisibility(View.VISIBLE);

            }
        });

    }
    private void tarih_sec() {
        buton_ay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int gun = calendar.get(Calendar.DAY_OF_MONTH);
                int ay = calendar.get(Calendar.MONTH);
                int yil = calendar.get(Calendar.YEAR);
                DatePickerDialog dialog = new DatePickerDialog(
                        getActivity(),
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        dateSetListener,
                        yil, ay, gun);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        buton_gun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int gun = calendar.get(Calendar.DAY_OF_MONTH);
                int ay = calendar.get(Calendar.MONTH);
                int yil = calendar.get(Calendar.YEAR);
                DatePickerDialog dialog = new DatePickerDialog(
                        getActivity(),
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        dateSetListener,
                        yil, ay, gun);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        buton_yil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int gun = calendar.get(Calendar.DAY_OF_MONTH);
                int ay = calendar.get(Calendar.MONTH);
                int yil = calendar.get(Calendar.YEAR);
                DatePickerDialog dialog = new DatePickerDialog(
                        getActivity(),
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        dateSetListener,
                        yil, ay, gun);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });
        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {

            }
        };


    }


}
