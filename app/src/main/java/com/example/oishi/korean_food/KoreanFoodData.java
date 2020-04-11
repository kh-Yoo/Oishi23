package com.example.oishi.korean_food;

public class KoreanFoodData {
    private int hansik_brand_img;
    private String hansik_brand_name;
    private String hansik_brand_menu;
    private String hansik_brand_number;

    public KoreanFoodData(int hansik_brand_img, String hansik_brand_name, String hansik_brand_menu, String hansik_brand_number){
        this.hansik_brand_img = hansik_brand_img;
        this.hansik_brand_name = hansik_brand_name;
        this.hansik_brand_menu = hansik_brand_menu;
        this.hansik_brand_number = hansik_brand_number;
    }

    public int getHansik_brand_img() {
        return this.hansik_brand_img;
    }

    public String getHansik_brand_name() {
        return this.hansik_brand_name;
    }

    public String getHansik_brand_menu() {
        return this.hansik_brand_menu;
    }

    public String getHansik_brand_number() {
        return this.hansik_brand_number;
    }
}
