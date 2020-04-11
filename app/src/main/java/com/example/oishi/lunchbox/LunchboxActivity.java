package com.example.oishi.lunchbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.oishi.R;

import java.util.ArrayList;

public class LunchboxActivity extends AppCompatActivity {
    private ArrayList<LunchboxData> lunchboxDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunchbox);

        this.InitializeLunchboxData();

        ListView listView = (ListView)findViewById(R.id.lunchbox_listview);

        final LunchboxAdapter lunchboxAdapter = new LunchboxAdapter(this,lunchboxDataList);

        listView.setAdapter(lunchboxAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        lunchboxAdapter.getItem(position).getDosirak_brand_name(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void InitializeLunchboxData() {
        lunchboxDataList = new ArrayList<LunchboxData>();

        lunchboxDataList.add(new LunchboxData(R.drawable.lunchbox_hansot_logo, "한솥 도시락", "대표메뉴 : 돈까스덮밥, 동백도시락", "주문전화 : 02-585-1114"));
        lunchboxDataList.add(new LunchboxData(R.drawable.lunchbox_tomato_logo, "토마토 도시락","대표메뉴 : 떡닭갈비도시락, 순살치킨타코", "주문전화 : 1670-4547"));
        lunchboxDataList.add(new LunchboxData(R.drawable.lunchbox_bon_logo, "본 도시락","대표메뉴 : 제육쌈밥, 차돌박이강된장쌈밥", "주문전화 : 1644-6288"));
        lunchboxDataList.add(new LunchboxData(R.drawable.lunchbox_obong_logo, "오봉 도시락","대표메뉴 : 일품도시락, 부산도시락", "주문전화 : 031-906-0040"));
        lunchboxDataList.add(new LunchboxData(R.drawable.lunchbox_dosiraklab_logo, "도시락 연구소","대표메뉴 : 제육불고기 도시락, 야채볶음밥", "주문전화 : 02-1234-5678"));
    }
}