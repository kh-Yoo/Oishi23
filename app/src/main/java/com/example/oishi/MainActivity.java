package com.example.oishi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.oishi.cafe.CafeActivity;
import com.example.oishi.chicken.ChickenActivity;
import com.example.oishi.chinese_food.ChineseFoodActivity;
import com.example.oishi.fast_food.FastFoodActivity;
import com.example.oishi.korean_food.KoreanFoodActivity;
import com.example.oishi.late_night_food.LateNightFoodActivity;
import com.example.oishi.lunchbox.LunchboxActivity;
import com.example.oishi.pizza.PizzaActivity;
import com.example.oishi.snack_food.SnackFoodActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    TextView present_address_text;
    ImageButton present_address_button;
    ImageButton korean_food_button;
    ImageButton snack_food_button;
    ImageButton cafe_button;
    ImageButton chicken_button;
    ImageButton pizza_button;
    ImageButton fast_food_button;
    ImageButton chinese_food_button;
    ImageButton late_night_food_button;
    ImageButton lunchbox_button;
    EditText search_text;
    ImageButton search_button;
    BottomNavigationView bottomNavigationView;

    private FragmentManager fragmentManager = getSupportFragmentManager();
    private HomeFragment fragment_home = new HomeFragment();
    private WishFragment fragment_wish = new WishFragment();
    private MineFragment fragment_mine = new MineFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        ImageButton korean_food = (ImageButton) findViewById(R.id.korean_food_button);
        ImageButton snack_food = (ImageButton) findViewById(R.id.snack_food_button);
        ImageButton cafe = (ImageButton) findViewById(R.id.cafe_button);
        ImageButton chicken = (ImageButton) findViewById(R.id.chicken_button);
        ImageButton pizza = (ImageButton) findViewById(R.id.pizza_button);
        ImageButton fast_food = (ImageButton) findViewById(R.id.fast_food_button);
        ImageButton chinese_food = (ImageButton) findViewById(R.id.chinese_food_button);
        ImageButton late_night_food = (ImageButton) findViewById(R.id.late_night_food_button);
        ImageButton lunchbox = (ImageButton) findViewById(R.id.lunchbox_button);

        korean_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), KoreanFoodActivity.class);
                startActivity(intent);
            }
        });

        snack_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SnackFoodActivity.class);
                startActivity(intent);
            }
        });

        cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CafeActivity.class);
                startActivity(intent);
            }
        });

        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChickenActivity.class);
                startActivity(intent);
            }
        });

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PizzaActivity.class);
                startActivity(intent);
            }
        });

        fast_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FastFoodActivity.class);
                startActivity(intent);
            }
        });

        chinese_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChineseFoodActivity.class);
                startActivity(intent);
            }
        });

        late_night_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LateNightFoodActivity.class);
                startActivity(intent);
            }
        });

        lunchbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LunchboxActivity.class);
                startActivity(intent);
            }
        });

    }

    class ItemSelectedListener implements BottomNavigationView.OnNavigationItemSelectedListener{
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch(menuItem.getItemId())
            {
                case R.id.home_item:
                    transaction.replace(R.id.frameLayout, fragment_home).commitAllowingStateLoss();

                    break;
                case R.id.heart_item:
                    transaction.replace(R.id.frameLayout, fragment_wish).commitAllowingStateLoss();
                    break;
                case R.id.myuser_item:
                    transaction.replace(R.id.frameLayout, fragment_mine).commitAllowingStateLoss();
                    break;
            }
            return true;
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        return super.onContextItemSelected(item);
    }
}