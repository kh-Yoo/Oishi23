package com.example.oishi.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.oishi.R;

import java.util.ArrayList;

public class CafeActivity extends AppCompatActivity {

    private ArrayList<CafeData> cafeDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);

        this.InitializeCafeData();

        ListView listView = (ListView)findViewById(R.id.cafe_listview);

        final CafeAdapter cafeAdapter = new CafeAdapter(this,cafeDataList);

        listView.setAdapter(cafeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        cafeAdapter.getItem(position).getCafe_brand_name(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void InitializeCafeData() {
        cafeDataList = new ArrayList<CafeData>();

        cafeDataList.add(new CafeData(R.drawable.cafe_starbucks_logo, "스타벅스", "대표메뉴 : 황금올리브치킨, 시크릿양념치킨", "주문전화 : 1588-9282"));
        cafeDataList.add(new CafeData(R.drawable.cafe_ediya_logo, "이디야 커피","대표메뉴 : 뿌링클, 맛초킹, 후라이드, 마라칸", "주문전화 : 1577-5577"));
        cafeDataList.add(new CafeData(R.drawable.cafe_paik_logo, "빽다방","대표메뉴 : 교촌 후라이드, 교촌 허니콤보", "주문전화 : 1577-1991"));
        cafeDataList.add(new CafeData(R.drawable.cafe_twosome_logo, "투썸플레이스","대표메뉴 : 파닭순살, 쇼킹핫, 스노윙치즈", "주문전화 : 1599-4479"));
        cafeDataList.add(new CafeData(R.drawable.cafe_mega_logo, "메가 커피","대표메뉴 : 굽네 갈비천왕, 굽네 볼케이노", "주문전화 : 1661-9494"));
    }
}