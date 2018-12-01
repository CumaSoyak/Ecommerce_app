package com.example.cuma.magro.Uyelik_Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.cuma.magro.R;

public class GirisFragment extends Fragment {

    /*Uye giris tanımlama*/
    EditText uye_girisi_email, uye_girisi_parola;
    TextView uye_girisi_sifremi_unuttum;
    Button uye_girisi_giris_buton, uye_girisi_facebook_baglan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_giris, container, false);

        /*Uye girisi tanımlama*/
        uye_girisi_email = view.findViewById(R.id.uye_girisi_email);
        uye_girisi_parola = view.findViewById(R.id.uye_girisi_parola);
        uye_girisi_sifremi_unuttum = view.findViewById(R.id.uye_girisi_sifremi_unuttum);
        uye_girisi_giris_buton = view.findViewById(R.id.uye_girisi_giris_buton);
        uye_girisi_facebook_baglan = view.findViewById(R.id.uye_girisi_facebook_baglan);

        return view;
    }

}
