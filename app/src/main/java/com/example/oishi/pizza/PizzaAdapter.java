package com.example.oishi.pizza;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.oishi.R;

import java.util.ArrayList;

public class PizzaAdapter extends BaseAdapter {
    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<PizzaData> pizza;

    public PizzaAdapter(Context context, ArrayList<PizzaData> data) {
        mContext = context;
        pizza = data;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return pizza.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public PizzaData getItem(int position) {
        return pizza.get(position);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View view = mLayoutInflater.inflate(R.layout.fragment_pizza_brand, null);

        ImageView pizza_brand_img = (ImageView)view.findViewById(R.id.pizza_brand_img);
        TextView pizza_brand_name = (TextView)view.findViewById(R.id.pizza_brand_name);
        TextView pizza_brand_menu = (TextView)view.findViewById(R.id.pizza_brand_menu);
        TextView pizza_brand_number = (TextView)view.findViewById(R.id.pizza_brand_number);

        pizza_brand_img.setImageResource(pizza.get(position).getPizza_brand_img());
        pizza_brand_name.setText(pizza.get(position).getPizza_brand_name());
        pizza_brand_menu.setText(pizza.get(position).getPizza_brand_menu());
        pizza_brand_number.setText(pizza.get(position).getPizza_brand_number());

        return view;
    }
}
