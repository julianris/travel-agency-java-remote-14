package com.sda.travelagency.entity;

public enum MealType {
    BREAKFAST("eggs, bred, tomato"),
    LUNCH("chicken"),
    DINER(""),
    SNACKS(""),
    DRINKS(""),
    HB(""),
    ALL_INCLUSIVE("");

    private String mealDescription;

    MealType(String mealDescription) {
        this.mealDescription = mealDescription;
    }

    public String getMealDescription() {
        return mealDescription;
    }
}

