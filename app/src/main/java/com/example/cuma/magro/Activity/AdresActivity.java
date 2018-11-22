package com.example.cuma.magro.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.cuma.magro.R;

public class AdresActivity extends AppCompatActivity {
    RadioGroup adres_radioGroup;
    RadioButton adrese_teslimat,bi_tik_magazada;
    Button odemeye_gec;
    EditText adres_gir_edittext;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adres);

        /*Tanımlamalar*/
        adres_radioGroup=findViewById(R.id.adres_radioGroup);
        adrese_teslimat=findViewById(R.id.adrese_teslimat);
        bi_tik_magazada=findViewById(R.id.bi_tik_magazada);
        odemeye_gec=findViewById(R.id.odemeye_gec);
        adres_gir_edittext=findViewById(R.id.adres_gir_edittext);


    }
}
