package com.example.caucse.week5project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kyi42 on 2017-09-26.
 */

public class MenuChoiceAdapter extends BaseAdapter{
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

        TextView menu_tv = (TextView)view.findViewById(R.id.menu_tv);
        TextView price_tv = (TextView)view.findViewById(R.id.price_tv);

        final MenuItem menuItem = arrayList.get(i);

        return view;
    }
    public void addItem(MenuItem menuItem){
        arrayList.add(menuItem);
    }
}
