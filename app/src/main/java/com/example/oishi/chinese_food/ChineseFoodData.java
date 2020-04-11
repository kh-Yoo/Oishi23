package com.example.oishi.chinese_food;

public class ChineseFoodData {
    private int chinese_brand_img;
    private String chinese_brand_name;
    private String chinese_brand_menu;
    private String chinese_brand_number;

    public ChineseFoodData(int chinese_brand_img, String chinese_brand_name, String chinese_brand_menu, String chinese_brand_number){
        this.chinese_brand_img = chinese_brand_img;
        this.chinese_brand_name = chinese_brand_name;
        this.chinese_brand_menu = chinese_brand_menu;
        this.chinese_brand_number = chinese_brand_number;
    }

    public int getChinese_brand_img() {
        return this.chinese_brand_img;
    }

    public String getChinese_brand_name() {
        return this.chinese_brand_name;
    }

    public String getChinese_brand_menu() {
        return this.chinese_brand_menu;
    }

    public String getChinese_brand_number() {
        return this.chinese_brand_number;
    }
}