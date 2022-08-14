package com.sda.travelagency.entity.enumeration;

public enum MealType {
    BREAKFAST("eggs, bred, tomato"),
    LUNCH("chicken"),
    DINER("burger, fries"),
    SNACKS("chips"),
    DRINKS("cola, water, wine"),
    HB("breakfast and diner"),
    ALL_INCLUSIVE("all food and drinks");

    private String mealDescription;

    MealType(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public String getMealDescription() {
        return mealDescription;
    }
}

