package com.example.oishi.fast_food;

public class FastFoodData {
    private int hamburger_brand_img;
    private String hamburger_brand_name;
    private String hamburger_brand_menu;
    private String hamburger_brand_number;

    public FastFoodData(int hamburger_brand_img, String hamburger_brand_name, String hamburger_brand_menu, String hamburger_brand_number){
        this.hamburger_brand_img = hamburger_brand_img;
        this.hamburger_brand_name = hamburger_brand_name;
        this.hamburger_brand_menu = hamburger_brand_menu;
        this.hamburger_brand_number = hamburger_brand_number;
    }

    public int getHamburger_brand_img() {
        return this.hamburger_brand_img;
    }

    public String getHamburger_brand_name() {
        return this.hamburger_brand_name;
    }

    public String getHamburger_brand_menu() {
        return this.hamburger_brand_menu;
    }

    public String getHamburger_brand_number() {
        return this.hamburger_brand_number;
    }
}
