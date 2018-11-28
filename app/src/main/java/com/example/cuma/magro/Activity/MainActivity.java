package com.example.cuma.magro.Activity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.example.cuma.magro.Fragment.HomeFragment;
import com.example.cuma.magro.Fragment.SearchFragment;
import com.example.cuma.magro.Fragment.ShopFragment;
import com.example.cuma.magro.Fragment.UserFragment;
import com.example.cuma.magro.R;

public class MainActivity extends AppCompatActivity {

    private ImageView sepet, menu;

    /*Hatalar giderildi*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sepet = findViewById(R.id.sepet);
        menu = findViewById(R.id.menu);
        sepet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ıntent = new Intent(MainActivity.this, SepetActivity.class);
                startActivity(ıntent);
            }
        });

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.main_framelayout, new HomeFragment()).commit();
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_anasayfa:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.navigation_urunler:
                    selectedFragment = new ShopFragment();
                    break;
                case R.id.navigation_arama:
                    selectedFragment = new SearchFragment();
                    break;
                case R.id.navigation_hesap:
                    selectedFragment = new UserFragment();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.main_framelayout, selectedFragment).commit();

            return true;
        }
    };


}
