package com.example.latihanpengkodean2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button latihan1,latihan2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_menu);
        latihan1 = findViewById (R.id.Latihan1);
        latihan1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Menu.this , Latihan1.class);
                startActivity (intent);
            }
        });

        latihan2 = findViewById (R.id.Latihan2);
        latihan2.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent (Menu.this , Latihan2.class);
                startActivity (intent2);
            }
        });

    }
}
