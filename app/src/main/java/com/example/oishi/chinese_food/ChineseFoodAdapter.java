package com.example.oishi.chinese_food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oishi.R;

import java.util.ArrayList;

public class ChineseFoodAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<ChineseFoodData> chinese_food;

    public ChineseFoodAdapter(Context context, ArrayList<ChineseFoodData> data) {
        mContext = context;
        chinese_food = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return chinese_food.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public ChineseFoodData getItem(int position) {
        return chinese_food.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.fragment_chinese_food_brand, null);

        ImageView chinese_brand_img = (ImageView)view.findViewById(R.id.chinese_brand_img);
        TextView chinese_brand_name = (TextView)view.findViewById(R.id.chinese_brand_name);
        TextView chinese_brand_menu = (TextView)view.findViewById(R.id.chinese_brand_menu);
        TextView chinese_brand_number = (TextView)view.findViewById(R.id.chinese_brand_number);

        chinese_brand_img.setImageResource(chinese_food.get(position).getChinese_brand_img());
        chinese_brand_name.setText(chinese_food.get(position).getChinese_brand_name());
        chinese_brand_menu.setText(chinese_food.get(position).getChinese_brand_menu());
        chinese_brand_number.setText(chinese_food.get(position).getChinese_brand_number());

        return view;
    }
}
