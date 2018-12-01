package com.example.cuma.magro.Uyelik_Fragment;


import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.cuma.magro.R;

import java.util.Calendar;

public class UyeolFragment extends Fragment {

    /*Uye ol tanımlama*/
    EditText uye_kayit_ad, uye_kayit_soyad, uye_kayit_email, uye_kayit_telefon,
            uye_kayit_parola, uye_kayit_parola_tekrar;
    Button uye_kayit_uye_ol, uye_kayit_facebook_kayit;
    RadioGroup uye_kayit_radio_group_cinsiyet;
    RadioButton uye_kayit_erkek_radiobuton, uye_kayit_kiz_radiobuton;
    CheckBox uye_kayit_kural1, uye_kayit_kural2, uye_kayit_kural3;
    private Button buton_gun, buton_ay, buton_yil;
    private DatePickerDialog.OnDateSetListener dateSetListener;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_uyeol, container, false);

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
        buton_gun = view.findViewById(R.id.buton_gun);
        buton_ay = view.findViewById(R.id.buton_ay);
        buton_yil = view.findViewById(R.id.buton_yıl);


        tarih_sec();

        return view;
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
