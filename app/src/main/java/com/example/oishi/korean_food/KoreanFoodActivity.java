package com.example.oishi.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.oishi.R;

import java.util.ArrayList;

public class KoreanFoodActivity extends AppCompatActivity {

    private ArrayList<KoreanFoodData> korean_food_DataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean_food);

        this.InitializeKoreanFoodData();

        ListView listView = (ListView)findViewById(R.id.korean_food_listview);

        final KoreanFoodAdapter koreanFoodAdapter = new KoreanFoodAdapter(this,korean_food_DataList);

        listView.setAdapter(koreanFoodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        koreanFoodAdapter.getItem(position).getHansik_brand_name(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void InitializeKoreanFoodData() {
        korean_food_DataList = new ArrayList<KoreanFoodData>();

        korean_food_DataList.add(new KoreanFoodData(R.drawable.korean_food_wonbossam_logo, "원할머니 보쌈.족발", "대표메뉴 : 의성마늘 떡 보쌈, 매운 족발", "주문전화 : 1599-5353"));
        korean_food_DataList.add(new KoreanFoodData(R.drawable.korean_food_nolbu_logo, "놀부 부대찌개","대표메뉴 : 놀부부대세트, 쭈꾸미 삼겹철판", "주문전화 : 1577-6877"));
        korean_food_DataList.add(new KoreanFoodData(R.drawable.korean_food_paik_logo, "백철판0410","대표메뉴 : 치즈매운철판닭갈비, 냄비떡볶이", "주문전화 : 1544-2360"));
        korean_food_DataList.add(new KoreanFoodData(R.drawable.korean_food_galtongsam_logo, "갈통삼","대표메뉴 : 삼겹목살구이, 등심스테이크", "주문전화 : 1661-1758"));
        korean_food_DataList.add(new KoreanFoodData(R.drawable.korean_food_yooganae_logo, "유가네 닭갈비","대표메뉴 : 유가네 닭갈비, 사천마라닭갈비", "주문전화 : 1661-9922"));
    }
}