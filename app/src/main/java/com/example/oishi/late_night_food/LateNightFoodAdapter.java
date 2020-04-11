package com.example.oishi.late_night_food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oishi.R;

import java.util.ArrayList;

public class LateNightFoodAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<LateNightFoodData> late_night_food;

    public LateNightFoodAdapter(Context context, ArrayList<LateNightFoodData> data) {
        mContext = context;
        late_night_food = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return late_night_food.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public LateNightFoodData getItem(int position) {
        return late_night_food.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.fragment_late_night_food_brand, null);

        ImageView yasik_brand_img = (ImageView)view.findViewById(R.id.yasik_brand_img);
        TextView yasik_brand_name = (TextView)view.findViewById(R.id.yasik_brand_name);
        TextView yasik_brand_menu = (TextView)view.findViewById(R.id.yasik_brand_menu);
        TextView yasik_brand_number = (TextView)view.findViewById(R.id.yasik_brand_number);

        yasik_brand_img.setImageResource(late_night_food.get(position).getYasik_brand_img());
        yasik_brand_name.setText(late_night_food.get(position).getYasik_brand_name());
        yasik_brand_menu.setText(late_night_food.get(position).getYasik_brand_menu());
        yasik_brand_number.setText(late_night_food.get(position).getYasik_brand_number());

        return view;
    }
}
