package com.example.oishi.fast_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.oishi.R;

import java.util.ArrayList;

public class FastFoodActivity extends AppCompatActivity {

    private ArrayList<FastFoodData> fast_food_DataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);

        this.InitializeFastFoodData();

        ListView listView = (ListView)findViewById(R.id.fast_food_listview);

        final FastFoodAdapter fastFoodAdapter = new FastFoodAdapter(this,fast_food_DataList);

        listView.setAdapter(fastFoodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        fastFoodAdapter.getItem(position).getHamburger_brand_name(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void InitializeFastFoodData() {
        fast_food_DataList = new ArrayList<FastFoodData>();

        fast_food_DataList.add(new FastFoodData(R.drawable.fast_food_mac_logo, "맥도날드", "대표메뉴 : 빅맥, 상하이 치킨버거, 1955버거", "주문전화 : 1600-5252"));
        fast_food_DataList.add(new FastFoodData(R.drawable.fast_food_lotteria_logo, "롯데리아","대표메뉴 : 불고기버거, AZ버거, 새우버거", "주문전화 : 02-709-1114"));
        fast_food_DataList.add(new FastFoodData(R.drawable.fast_food_momstouch_logo, "맘스터치","대표메뉴 : 싸이버거, 화이트 갈릭버거", "주문전화 : 1661-4205"));
        fast_food_DataList.add(new FastFoodData(R.drawable.fast_food_kfc_logo, "KFC","대표메뉴 : 징거버거, 핫 크리스피 치킨", "주문전화 : 1599-8484"));
        fast_food_DataList.add(new FastFoodData(R.drawable.fast_food_burgerking_logo, "버거킹","대표메뉴 : 콰트로 치즈 와퍼, 주니어 와퍼", "주문전화 : 1599-0505"));
    }
}