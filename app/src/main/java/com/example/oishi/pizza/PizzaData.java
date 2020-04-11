package com.example.oishi.pizza;

public class PizzaData {
    private int pizza_brand_img;
    private String pizza_brand_name;
    private String pizza_brand_menu;
    private String pizza_brand_number;

    public PizzaData(int pizza_brand_img, String pizza_brand_name, String pizza_brand_menu, String pizza_brand_number){
        this.pizza_brand_img = pizza_brand_img;
        this.pizza_brand_name = pizza_brand_name;
        this.pizza_brand_menu = pizza_brand_menu;
        this.pizza_brand_number = pizza_brand_number;
    }

    public int getPizza_brand_img() {
        return this.pizza_brand_img;
    }

    public String getPizza_brand_name() {
        return this.pizza_brand_name;
    }

    public String getPizza_brand_menu() {
        return this.pizza_brand_menu;
    }

    public String getPizza_brand_number() {
        return this.pizza_brand_number;
    }
}
