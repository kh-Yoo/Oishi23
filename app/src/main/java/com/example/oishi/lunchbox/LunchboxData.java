package com.example.oishi.lunchbox;

public class LunchboxData {
    private int dosirak_brand_img;
    private String dosirak_brand_name;
    private String dosirak_brand_menu;
    private String dosirak_brand_number;

    public LunchboxData(int dosirak_brand_img, String dosirak_brand_name, String dosirak_brand_menu, String dosirak_brand_number){
        this.dosirak_brand_img = dosirak_brand_img;
        this.dosirak_brand_name = dosirak_brand_name;
        this.dosirak_brand_menu = dosirak_brand_menu;
        this.dosirak_brand_number = dosirak_brand_number;
    }

    public int getDosirak_brand_img() {
        return this.dosirak_brand_img;
    }

    public String getDosirak_brand_name() {
        return this.dosirak_brand_name;
    }

    public String getDosirak_brand_menu() {
        return this.dosirak_brand_menu;
    }

    public String getDosirak_brand_number() {
        return this.dosirak_brand_number;
    }
}