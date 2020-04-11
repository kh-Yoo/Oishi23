package com.example.oishi.cafe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oishi.R;

import java.util.ArrayList;

public class CafeAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<CafeData> cafe;

    public CafeAdapter(Context context, ArrayList<CafeData> data) {
        mContext = context;
        cafe = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return cafe.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public CafeData getItem(int position) {
        return cafe.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.fragment_cafe_brand, null);

        ImageView cafe_brand_img = (ImageView)view.findViewById(R.id.cafe_brand_img);
        TextView cafe_brand_name = (TextView)view.findViewById(R.id.cafe_brand_name);
        TextView cafe_brand_menu = (TextView)view.findViewById(R.id.cafe_brand_menu);
        TextView cafe_brand_number = (TextView)view.findViewById(R.id.cafe_brand_number);

        cafe_brand_img.setImageResource(cafe.get(position).getCafe_brand_img());
        cafe_brand_name.setText(cafe.get(position).getCafe_brand_name());
        cafe_brand_menu.setText(cafe.get(position).getCafe_brand_menu());
        cafe_brand_number.setText(cafe.get(position).getCafe_brand_number());

        return view;
    }
}