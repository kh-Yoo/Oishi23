package com.example.oishi.chicken;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.oishi.R;

import java.util.ArrayList;

public class ChickenActivity extends AppCompatActivity {

    private ArrayList<ChickenData> chickenDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);

        this.InitializeChickenData();

        ListView listView = (ListView)findViewById(R.id.chicken_listview);

        final ChickenAdapter chickenAdapter = new ChickenAdapter(this,chickenDataList);

        listView.setAdapter(chickenAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        chickenAdapter.getItem(position).getChicken_brand_name(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void InitializeChickenData() {
        chickenDataList = new ArrayList<ChickenData>();

        chickenDataList.add(new ChickenData(R.drawable.chicken_bbq_logo, "BBQ", "대표메뉴 : 황금올리브치킨, 시크릿양념치킨", "주문전화 : 1588-9282"));
        chickenDataList.add(new ChickenData(R.drawable.chicken_bhc_logo, "BHC","대표메뉴 : 뿌링클, 맛초킹, 후라이드, 마라칸", "주문전화 : 1577-5577"));
        chickenDataList.add(new ChickenData(R.drawable.chicken_kyochon_logo, "교촌 치킨","대표메뉴 : 교촌 후라이드, 교촌 허니콤보", "주문전화 : 1577-1991"));
        chickenDataList.add(new ChickenData(R.drawable.chicken_nene_logo, "네네 치킨","대표메뉴 : 파닭순살, 쇼킹핫, 스노윙치즈", "주문전화 : 1599-4479"));
        chickenDataList.add(new ChickenData(R.drawable.chicken_goobne_logo, "굽네 치킨","대표메뉴 : 굽네 갈비천왕, 굽네 볼케이노", "주문전화 : 1661-9494"));
    }
}
