package com.example.oishi.fast_food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oishi.R;

import java.util.ArrayList;

public class FastFoodAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<FastFoodData> fast_food;

    public FastFoodAdapter(Context context, ArrayList<FastFoodData> data) {
        mContext = context;
        fast_food = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return fast_food.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public FastFoodData getItem(int position) {
        return fast_food.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.fragment_fast_food_brand, null);

        ImageView hamburger_brand_img = (ImageView)view.findViewById(R.id.hamburger_brand_img);
        TextView hamburger_brand_name = (TextView)view.findViewById(R.id.hamburger_brand_name);
        TextView hamburger_brand_menu = (TextView)view.findViewById(R.id.hamburger_brand_menu);
        TextView hamburger_brand_number = (TextView)view.findViewById(R.id.hamburger_brand_number);

        hamburger_brand_img.setImageResource(fast_food.get(position).getHamburger_brand_img());
        hamburger_brand_name.setText(fast_food.get(position).getHamburger_brand_name());
        hamburger_brand_menu.setText(fast_food.get(position).getHamburger_brand_menu());
        hamburger_brand_number.setText(fast_food.get(position).getHamburger_brand_number());

        return view;
    }
}
