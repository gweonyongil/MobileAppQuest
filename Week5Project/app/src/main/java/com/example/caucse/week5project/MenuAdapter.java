package com.example.caucse.week5project;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by caucse on 2017-09-25.
 */

public class MenuAdapter extends BaseAdapter {
    private ArrayList<MenuItem> arrayList = new ArrayList<MenuItem>();

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final int pos = i;
        final Context context = viewGroup.getContext();

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.menu_itemview, viewGroup, false);
        }

        ImageView imageView = (ImageView)view.findViewById(R.id.item_img);
        TextView title_tv = (TextView)view.findViewById(R.id.title_tv);
        TextView where_tv = (TextView)view.findViewById(R.id.where_tv);
        TextView open_tv = (TextView)view.findViewById(R.id.open_tv);
        TextView ride_tv = (TextView)view.findViewById(R.id.ride_tv);
        Button call_btn = (Button)view.findViewById(R.id.call_btn);
        Button pay_btn = (Button)view.findViewById(R.id.pay_btn);

        final MenuItem menuItem = arrayList.get(i);
        title_tv.setText(menuItem.getTitle());
        where_tv.setText(menuItem.getWhere());
        open_tv.setText(menuItem.getOpen());
        ride_tv.setText(menuItem.getRide());
        call_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tel = "tel:"+menuItem.getCall().toString();
                context.startActivity(new Intent("android.intent.action.CALL", Uri.parse(tel)));
            }
        });
        pay_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), PayActivity.class);
                intent.putExtra("title", menuItem.getTitle().toString())
                        .putExtra("where", menuItem.getWhere().toString())
                        .putExtra("open", menuItem.getOpen().toString())
                        .putExtra("ride", menuItem.getRide().toString());
                context.startActivity(intent);
            }
        });
        return view;
    }
    public void addItem(MenuItem menuItem){
        arrayList.add(menuItem);
    }
}
