package com.example.oishi.snack_food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oishi.R;

import java.util.ArrayList;

public class SnackFoodAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<SnackFoodData> snack_food;

    public SnackFoodAdapter(Context context, ArrayList<SnackFoodData> data) {
        mContext = context;
        snack_food = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return snack_food.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public SnackFoodData getItem(int position) {
        return snack_food.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.fragment_snack_food_brand, null);

        ImageView bunsik_brand_img = (ImageView)view.findViewById(R.id.bunsik_brand_img);
        TextView bunsik_brand_name = (TextView)view.findViewById(R.id.bunsik_brand_name);
        TextView bunsik_brand_menu = (TextView)view.findViewById(R.id.bunsik_brand_menu);
        TextView bunsik_brand_number = (TextView)view.findViewById(R.id.bunsik_brand_number);

        bunsik_brand_img.setImageResource(snack_food.get(position).getBunsik_brand_img());
        bunsik_brand_name.setText(snack_food.get(position).getBunsik_brand_name());
        bunsik_brand_menu.setText(snack_food.get(position).getBunsik_brand_menu());
        bunsik_brand_number.setText(snack_food.get(position).getBunsik_brand_number());

        return view;
    }
}
