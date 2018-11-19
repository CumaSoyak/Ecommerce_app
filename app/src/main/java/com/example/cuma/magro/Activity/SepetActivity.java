package com.example.cuma.magro.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.cuma.magro.Adapter.SepetAdapter;
import com.example.cuma.magro.Class.Sepet;
import com.example.cuma.magro.R;

import java.util.ArrayList;

public class SepetActivity extends AppCompatActivity {
    Button alisveris_tamamla;
    private ArrayList<Sepet> sepetList;
    private RecyclerView recyclerView;
    private SepetAdapter sepetAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sepet);
        recyclerView=findViewById(R.id.recyclerView_sepet);
        sepetList=new ArrayList<Sepet>();
        sepetAdapter=new SepetAdapter(sepetList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(sepetAdapter);
        sepetList.add(new Sepet(R.drawable.kadin,"Beyaz yaka","45","Kırmızı","56"));
        sepetList.add(new Sepet(R.drawable.kadin,"Beyaz yaka","45","Kırmızı","56"));
        sepetList.add(new Sepet(R.drawable.kadin,"Beyaz yaka","45","Kırmızı","56"));
        sepetList.add(new Sepet(R.drawable.kadin,"Beyaz yaka","45","Kırmızı","56"));
        sepetList.add(new Sepet(R.drawable.kadin,"Beyaz yaka","45","Kırmızı","56"));
        sepetList.add(new Sepet(R.drawable.kadin,"Beyaz yaka","45","Kırmızı","56"));

        //todo burda kaldım get context bakman lazım q
        alisveris_tamamla = findViewById(R.id.alisveris_tamamla);
        alisveris_tamamla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ıntent = new Intent(SepetActivity.this, AdresActivity.class);
                startActivity(ıntent);
            }
        });
    }
}
