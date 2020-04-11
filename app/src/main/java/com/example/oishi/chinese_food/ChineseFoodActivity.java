package com.example.oishi.chinese_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.oishi.R;

import java.util.ArrayList;

public class ChineseFoodActivity extends AppCompatActivity {

    private ArrayList<ChineseFoodData> chinese_food_DataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_food);

        this.InitializeChineseFoodData();

        ListView listView = (ListView)findViewById(R.id.chinese_food_listview);

        final ChineseFoodAdapter chineseFoodAdapter = new ChineseFoodAdapter(this,chinese_food_DataList);

        listView.setAdapter(chineseFoodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        chineseFoodAdapter.getItem(position).getChinese_brand_name(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void InitializeChineseFoodData() {
        chinese_food_DataList = new ArrayList<ChineseFoodData>();

        chinese_food_DataList.add(new ChineseFoodData(R.drawable.chinese_food_hong_logo, "홍짜장", "대표메뉴 : 해물쟁반짜장, 홍탕수육", "주문전화 : 1688-7785"));
        chinese_food_DataList.add(new ChineseFoodData(R.drawable.chinese_food_hongkong_logo, "홍콩반점0410","대표메뉴 : 고추짬뽕, 볶음짬뽕, 깐풍기", "주문전화 : 1577-5577"));
        chinese_food_DataList.add(new ChineseFoodData(R.drawable.chinese_food_lahwakungbu_logo, "라화쿵부","대표메뉴 : 마라향궈, 꿔바로우, 운남쌀국수", "주문전화 : 1588-1912"));
        chinese_food_DataList.add(new ChineseFoodData(R.drawable.chinese_food_chakhan_logo, "착한 쭝식","대표메뉴 : 옛날짜장면, 탕수육, 크림새우", "주문전화 : 1800-3234"));
        chinese_food_DataList.add(new ChineseFoodData(R.drawable.chinese_food_kyoddong_logo, "교동짬뽕","대표메뉴 : 짬뽕, 탕수육, 군만두", "주문전화 : 033-651-3378"));
    }
}