package com.example.oishi.cafe;

public class CafeData {
    private int cafe_brand_img;
    private String cafe_brand_name;
    private String cafe_brand_menu;
    private String cafe_brand_number;

    public CafeData(int cafe_brand_img, String cafe_brand_name, String cafe_brand_menu, String cafe_brand_number){
        this.cafe_brand_img = cafe_brand_img;
        this.cafe_brand_name = cafe_brand_name;
        this.cafe_brand_menu = cafe_brand_menu;
        this.cafe_brand_number = cafe_brand_number;
    }

    public int getCafe_brand_img() {
        return this.cafe_brand_img;
    }

    public String getCafe_brand_name() {
        return this.cafe_brand_name;
    }

    public String getCafe_brand_menu() {
        return this.cafe_brand_menu;
    }

    public String getCafe_brand_number() {
        return this.cafe_brand_number;
    }
}