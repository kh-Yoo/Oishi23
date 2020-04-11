package com.example.oishi.late_night_food;

public class LateNightFoodData {
    private int yasik_brand_img;
    private String yasik_brand_name;
    private String yasik_brand_menu;
    private String yasik_brand_number;

    public LateNightFoodData(int yasik_brand_img, String yasik_brand_name, String yasik_brand_menu, String yasik_brand_number){
        this.yasik_brand_img = yasik_brand_img;
        this.yasik_brand_name = yasik_brand_name;
        this.yasik_brand_menu = yasik_brand_menu;
        this.yasik_brand_number = yasik_brand_number;
    }

    public int getYasik_brand_img() {
        return this.yasik_brand_img;
    }

    public String getYasik_brand_name() {
        return this.yasik_brand_name;
    }

    public String getYasik_brand_menu() {
        return this.yasik_brand_menu;
    }

    public String getYasik_brand_number() {
        return this.yasik_brand_number;
    }
}
