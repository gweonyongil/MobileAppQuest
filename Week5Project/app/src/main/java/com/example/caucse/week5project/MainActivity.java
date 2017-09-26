package com.example.caucse.week5project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img1, img2, img3, img4, img5, img6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageView)findViewById(R.id.menu1_img);
        img2 = (ImageView)findViewById(R.id.menu2_img);
        img3 = (ImageView)findViewById(R.id.menu3_img);
        img4 = (ImageView)findViewById(R.id.menu4_img);
        img5 = (ImageView)findViewById(R.id.menu5_img);
        img6 = (ImageView)findViewById(R.id.menu6_img);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("MENU", "1");
                startActivity(intent);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("MENU", "2");
                startActivity(intent);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("MENU", "3");
                startActivity(intent);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("MENU", "4");
                startActivity(intent);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("MENU", "5");
                startActivity(intent);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("MENU", "6");
                startActivity(intent);
            }
        });
    }
}
