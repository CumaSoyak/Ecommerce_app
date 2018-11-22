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
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
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
    /*Uye giris tanımlama*/
    EditText uye_girisi_email, uye_girisi_parola;
    TextView uye_girisi_sifremi_unuttum;
    Button uye_girisi_giris_buton, uye_girisi_facebook_baglan;
    /*Uye ol tanımlama*/
    EditText uye_kayit_ad, uye_kayit_soyad, uye_kayit_email, uye_kayit_telefon,
            uye_kayit_parola, uye_kayit_parola_tekrar;
    Button uye_kayit_uye_ol, uye_kayit_facebook_kayit;
    RadioGroup uye_kayit_radio_group_cinsiyet;
    RadioButton uye_kayit_erkek_radiobuton, uye_kayit_kiz_radiobuton;
    CheckBox uye_kayit_kural1, uye_kayit_kural2, uye_kayit_kural3;
    /*Uye olmadan alısveris*/
    EditText uye_olmadan_alisveris_email;
    CheckBox uye_olmadan_alisveris_checxbox;
    Button uye_olmadan_alisveris_alisveris_yap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        /*Uye girisi tanımlama*/
        uye_girisi_email = view.findViewById(R.id.uye_girisi_email);
        uye_girisi_parola = view.findViewById(R.id.uye_girisi_parola);
        uye_girisi_sifremi_unuttum = view.findViewById(R.id.uye_girisi_sifremi_unuttum);
        uye_girisi_giris_buton = view.findViewById(R.id.uye_girisi_giris_buton);
        uye_girisi_facebook_baglan = view.findViewById(R.id.uye_girisi_facebook_baglan);

        /*Uye kayıt tanımlama*/
        uye_kayit_ad = view.findViewById(R.id.uye_kayit_ad);
        uye_kayit_soyad = view.findViewById(R.id.uye_kayit_soyad);
        uye_kayit_email = view.findViewById(R.id.uye_kayit_email);
        uye_kayit_telefon = view.findViewById(R.id.uye_kayit_telefon);
        uye_kayit_parola = view.findViewById(R.id.uye_kayit_parola);
        uye_kayit_parola_tekrar = view.findViewById(R.id.uye_kayit_parola_tekrar);
        uye_kayit_uye_ol = view.findViewById(R.id.uye_kayit_uye_ol);
        uye_kayit_facebook_kayit = view.findViewById(R.id.uye_kayit_facebook_kayit);
        uye_kayit_radio_group_cinsiyet = view.findViewById(R.id.uye_kayit_radio_group_cinsiyet);
        uye_kayit_erkek_radiobuton = view.findViewById(R.id.uye_kayit_erkek_radiobuton);
        uye_kayit_kiz_radiobuton = view.findViewById(R.id.uye_kayit_kiz_radiobuton);
        uye_kayit_kural1 = view.findViewById(R.id.uye_kayit_kural1);
        uye_kayit_kural2 = view.findViewById(R.id.uye_kayit_kural2);
        uye_kayit_kural3 = view.findViewById(R.id.uye_kayit_kural3);

        /*Uye olmadan alısveris yap*/
        uye_olmadan_alisveris_email = view.findViewById(R.id.uye_olmadan_alisveris_email);
        uye_olmadan_alisveris_checxbox = view.findViewById(R.id.uye_olmadan_alisveris_checxbox);
        uye_olmadan_alisveris_alisveris_yap = view.findViewById(R.id.uye_olmadan_alisveris_alisveris_yap);


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
