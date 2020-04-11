package com.example.oishi.korean_food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oishi.R;

import java.util.ArrayList;

public class KoreanFoodAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<KoreanFoodData> korean_food;

    public KoreanFoodAdapter(Context context, ArrayList<KoreanFoodData> data) {
        mContext = context;
        korean_food = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return korean_food.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public KoreanFoodData getItem(int position) {
        return korean_food.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.fragment_korean_food_brand, null);

        ImageView hansik_brand_img = (ImageView)view.findViewById(R.id.hansik_brand_img);
        TextView hansik_brand_name = (TextView)view.findViewById(R.id.hansik_brand_name);
        TextView hansik_brand_menu = (TextView)view.findViewById(R.id.hansik_brand_menu);
        TextView hansik_brand_number = (TextView)view.findViewById(R.id.hansik_brand_number);

        hansik_brand_img.setImageResource(korean_food.get(position).getHansik_brand_img());
        hansik_brand_name.setText(korean_food.get(position).getHansik_brand_name());
        hansik_brand_menu.setText(korean_food.get(position).getHansik_brand_menu());
        hansik_brand_number.setText(korean_food.get(position).getHansik_brand_number());

        return view;
    }
}
