package com.example.oishi.chicken;

public class ChickenData {
    private int chicken_brand_img;
    private String chicken_brand_name;
    private String chicken_brand_menu;
    private String chicken_brand_number;

    public ChickenData(int chicken_brand_img, String chicken_brand_name, String chicken_brand_menu, String chicken_brand_number){
        this.chicken_brand_img = chicken_brand_img;
        this.chicken_brand_name = chicken_brand_name;
        this.chicken_brand_menu = chicken_brand_menu;
        this.chicken_brand_number = chicken_brand_number;
    }

    public int getChicken_brand_img() {
        return this.chicken_brand_img;
    }

    public String getChicken_brand_name() {
        return this.chicken_brand_name;
    }

    public String getChicken_brand_menu() {
        return this.chicken_brand_menu;
    }

    public String getChicken_brand_number() {
        return this.chicken_brand_number;
    }
}