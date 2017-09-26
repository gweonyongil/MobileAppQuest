package com.example.caucse.week5project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ListView lv = (ListView)findViewById(R.id.menu_listview);
        MenuAdapter menuAdapter = new MenuAdapter();
        lv.setAdapter(menuAdapter);
        Intent intent = getIntent();
        if(intent.getExtras().getString("MENU").equals("1")){
            menuAdapter.addItem(new MenuItem("교촌치킨", "ㄱ", "ㄴ", "ㄷ", "01068481916"));
        }
        if(intent.getExtras().getString("MENU").equals("2")){

        }
        if(intent.getExtras().getString("MENU").equals("3")){

        }
        if(intent.getExtras().getString("MENU").equals("4")){

        }
        if(intent.getExtras().getString("MENU").equals("5")){

        }
        if(intent.getExtras().getString("MENU").equals("6")){

        }
    }
}
