package com.example.cuma.magro.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cuma.magro.Class.Sepet;
import com.example.cuma.magro.R;

public class GosterActivity extends AppCompatActivity {
    private Spinner goster_adet_spinner, goster_renk_spinner, goster_beden_spinner;
    private ArrayAdapter<String> dataAdapterForAdet, dataAdapterForRenk, dataAdapterForBeden;
    private String[] adet = {"1", "2", "3"};
    private String[] renk = {"kırmızı", "mavi"};
    private String[] beden = {"32", "33"};
    private Button goster_sepete_ekle;
    /*Tanımlamalar*/
    ImageView goster_resim;
    TextView goster_isim,goster_fiyat;
    Button goster_urun_detay,goster_urun_hakkinda,goster_urun_teslimat;
    ListView urun_ozellik_listview;
    Button goster_sapete_ekle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goster);
        /*Tanımlamalar*/
        goster_resim=findViewById(R.id.goster_resim);
        goster_isim=findViewById(R.id.goster_isim);
        goster_fiyat=findViewById(R.id.goster_fiyat);
        goster_urun_detay=findViewById(R.id.goster_urun_detay);
        goster_urun_hakkinda=findViewById(R.id.goster_urun_hakkinda);
        goster_urun_teslimat=findViewById(R.id.goster_urun_teslimat);
        urun_ozellik_listview=findViewById(R.id.urun_ozellik_listview);
        goster_sapete_ekle=findViewById(R.id.goster_sepete_ekle);
        /*********************/
        spinnerlar();
        goster_sepete_ekle=findViewById(R.id.goster_sepete_ekle);
        goster_sepete_ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ıntent=new Intent(GosterActivity.this,SepetActivity.class);
                startActivity(ıntent);
            }
        });

    }

    public void spinnerlar() {
        goster_adet_spinner=findViewById(R.id.goster_adet_spinner);
        goster_renk_spinner=findViewById(R.id.goster_renk_spinner);
        goster_beden_spinner=findViewById(R.id.goster_beden_spinner);
        dataAdapterForAdet = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, adet);
        dataAdapterForRenk = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, renk);
        dataAdapterForBeden = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, beden);

        dataAdapterForAdet.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterForRenk.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapterForBeden.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        goster_adet_spinner.setAdapter(dataAdapterForAdet);
        goster_renk_spinner.setAdapter(dataAdapterForRenk);
        goster_beden_spinner.setAdapter(dataAdapterForBeden);

    }
}
