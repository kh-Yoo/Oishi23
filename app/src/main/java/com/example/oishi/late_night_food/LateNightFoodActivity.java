package com.example.oishi.late_night_food;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.oishi.R;

import java.util.ArrayList;

public class LateNightFoodActivity extends AppCompatActivity {
    private ArrayList<LateNightFoodData> late_night_food_DataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_late_night_food);

        this.InitializeLateNightFoodData();

        ListView listView = (ListView)findViewById(R.id.late_night_food_listview);

        final LateNightFoodAdapter lateNightFoodAdapter = new LateNightFoodAdapter(this,late_night_food_DataList);

        listView.setAdapter(lateNightFoodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        lateNightFoodAdapter.getItem(position).getYasik_brand_name(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void InitializeLateNightFoodData() {
        late_night_food_DataList = new ArrayList<LateNightFoodData>();

        late_night_food_DataList.add(new LateNightFoodData(R.drawable.late_night_food_hansin_logo, "한신포차", "대표메뉴 : 한신닭발, 한신통닭, 감바스", "주문전화 : 1544-2360"));
        late_night_food_DataList.add(new LateNightFoodData(R.drawable.late_night_food_tudari_logo, "투다리","대표메뉴 : 투다리꼬치세트, 얼얼마라홍탕", "주문전화 : 1644-9271"));
        late_night_food_DataList.add(new LateNightFoodData(R.drawable.late_night_food_newyork_logo, "뉴욕야시장","대표메뉴 : 뉴욕채끝스테이크, 사천순살치킨", "주문전화 : 02-326-3187"));
        late_night_food_DataList.add(new LateNightFoodData(R.drawable.late_night_food_misoolkwan_logo, "미술관","대표메뉴 : 해물파전, 꼬막찜, 생연어사시미", "주문전화 : 1899-6096"));
        late_night_food_DataList.add(new LateNightFoodData(R.drawable.late_night_food_dailybeer_logo, "생활맥주","대표메뉴 : 인생맥주, 미미네 생활 떡볶이", "주문전화 : 02-783-9663"));
    }
}