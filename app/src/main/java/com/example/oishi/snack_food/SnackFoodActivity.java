package com.example.oishi.snack_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.oishi.R;

import java.util.ArrayList;

public class SnackFoodActivity extends AppCompatActivity {

    private ArrayList<SnackFoodData> snack_food_DataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_food);

        this.InitializeSnackFoodData();

        ListView listView = (ListView)findViewById(R.id.snack_food_listview);

        final SnackFoodAdapter snackfoodAdapter = new SnackFoodAdapter(this,snack_food_DataList);

        listView.setAdapter(snackfoodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        snackfoodAdapter.getItem(position).getBunsik_brand_name(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void InitializeSnackFoodData() {
        snack_food_DataList = new ArrayList<SnackFoodData>();

        snack_food_DataList.add(new SnackFoodData(R.drawable.snack_food_yupdduck_logo, "동대문 엽기 떡볶이", "대표메뉴 : 엽기 떡볶이, 엽기 닭볶음탕", "주문전화 : 1661-8514"));
        snack_food_DataList.add(new SnackFoodData(R.drawable.snack_food_sinjeon_logo, "신전 떡볶이","대표메뉴 : 떡볶이, 스팸마요컵밥, 튀김오뎅", "주문전화 : 053-423-6339"));
        snack_food_DataList.add(new SnackFoodData(R.drawable.snack_food_youngdabang_logo, "청년 다방","대표메뉴 : 차돌떡볶이, 통닭떡볶이, 찰순대", "주문전화 : 1666-4693"));
        snack_food_DataList.add(new SnackFoodData(R.drawable.snack_food_kukde_logo, "국대 떡볶이","대표메뉴 : 떡볶이, 참치마요컵밥, 냉쫄우동", "주문전화 : 02-598-8869"));
        snack_food_DataList.add(new SnackFoodData(R.drawable.snack_food_jaws_logo, "죠스 떡볶이","대표메뉴 : 죠스 떡볶이, 죠스 찰순대", "주문전화 : 02-927-1525"));
    }
}