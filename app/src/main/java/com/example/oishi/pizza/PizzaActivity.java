package com.example.oishi.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.oishi.R;

import java.util.ArrayList;

public class PizzaActivity extends AppCompatActivity {

    private ArrayList<PizzaData> pizzaDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        this.InitializePizzaData();

        ListView listView = (ListView)findViewById(R.id.pizza_listview);

        final PizzaAdapter pizzaAdapter = new PizzaAdapter(this,pizzaDataList);

        listView.setAdapter(pizzaAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Toast.makeText(getApplicationContext(),
                        pizzaAdapter.getItem(position).getPizza_brand_name(),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    public void InitializePizzaData() {
        pizzaDataList = new ArrayList<PizzaData>();

        pizzaDataList.add(new PizzaData(R.drawable.pizza_domino_logo, "도미노피자", "대표메뉴 : 직화 스테이크피자, 포테이토피자", "주문전화 : 1577-3082"));
        pizzaDataList.add(new PizzaData(R.drawable.pizza_pizzahut_logo, "피자헛","대표메뉴 : 치즈판타지피자, 수퍼슈프림피자", "주문전화 : 1588-5588"));
        pizzaDataList.add(new PizzaData(R.drawable.pizza_pizzaschool_logo, "피자스쿨","대표메뉴 : 치킨퀘사디아피자, 까르보네피자", "주문전화 : 02-844-7070"));
        pizzaDataList.add(new PizzaData(R.drawable.pizza_mrpizza_logo, "미스터피자","대표메뉴 : 쉬림프골드피자, 포테이토골드피자", "주문전화 : 1577-0077"));
        pizzaDataList.add(new PizzaData(R.drawable.pizza_pizzamaru_logo, "피자마루","대표메뉴 : 몬스터 피자, 시가코 피자", "주문전화 : 1800-1082"));
    }
}