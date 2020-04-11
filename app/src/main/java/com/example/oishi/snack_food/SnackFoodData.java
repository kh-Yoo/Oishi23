package com.example.oishi.snack_food;

public class SnackFoodData {
    private int bunsik_brand_img;
    private String bunsik_brand_name;
    private String bunsik_brand_menu;
    private String bunsik_brand_number;

    public SnackFoodData(int bunsik_brand_img, String bunsik_brand_name, String bunsik_brand_menu, String bunsik_brand_number){
        this.bunsik_brand_img = bunsik_brand_img;
        this.bunsik_brand_name = bunsik_brand_name;
        this.bunsik_brand_menu = bunsik_brand_menu;
        this.bunsik_brand_number = bunsik_brand_number;
    }

    public int getBunsik_brand_img() {
        return this.bunsik_brand_img;
    }

    public String getBunsik_brand_name() {
        return this.bunsik_brand_name;
    }

    public String getBunsik_brand_menu() {
        return this.bunsik_brand_menu;
    }

    public String getBunsik_brand_number() {
        return this.bunsik_brand_number;
    }
}