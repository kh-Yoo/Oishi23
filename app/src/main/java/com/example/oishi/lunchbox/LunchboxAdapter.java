package com.example.oishi.lunchbox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oishi.R;

import java.util.ArrayList;

public class LunchboxAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<LunchboxData> lunchbox;

    public LunchboxAdapter(Context context, ArrayList<LunchboxData> data) {
        mContext = context;
        lunchbox = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return lunchbox.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public LunchboxData getItem(int position) {
        return lunchbox.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.fragment_lunchbox_brand, null);

        ImageView dosirak_brand_img = (ImageView)view.findViewById(R.id.dosirak_brand_img);
        TextView dosirak_brand_name = (TextView)view.findViewById(R.id.dosirak_brand_name);
        TextView dosirak_brand_menu = (TextView)view.findViewById(R.id.dosirak_brand_menu);
        TextView dosirak_brand_number = (TextView)view.findViewById(R.id.dosirak_brand_number);

        dosirak_brand_img.setImageResource(lunchbox.get(position).getDosirak_brand_img());
        dosirak_brand_name.setText(lunchbox.get(position).getDosirak_brand_name());
        dosirak_brand_menu.setText(lunchbox.get(position).getDosirak_brand_menu());
        dosirak_brand_number.setText(lunchbox.get(position).getDosirak_brand_number());

        return view;
    }
}