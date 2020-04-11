package com.example.oishi.chicken;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oishi.R;

import java.util.ArrayList;

public class ChickenAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<ChickenData> chicken;

    public ChickenAdapter(Context context, ArrayList<ChickenData> data) {
        mContext = context;
        chicken = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return chicken.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public ChickenData getItem(int position) {
        return chicken.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.fragment_chicken_brand, null);

        ImageView chicken_brand_img = (ImageView)view.findViewById(R.id.chicken_brand_img);
        TextView chicken_brand_name = (TextView)view.findViewById(R.id.chicken_brand_name);
        TextView chicken_brand_menu = (TextView)view.findViewById(R.id.chicken_brand_menu);
        TextView chicken_brand_number = (TextView)view.findViewById(R.id.chicken_brand_number);

        chicken_brand_img.setImageResource(chicken.get(position).getChicken_brand_img());
        chicken_brand_name.setText(chicken.get(position).getChicken_brand_name());
        chicken_brand_menu.setText(chicken.get(position).getChicken_brand_menu());
        chicken_brand_number.setText(chicken.get(position).getChicken_brand_number());

        return view;
    }
}
