package com.witarget.keepfit;


import java.util.HashMap;
import java.util.Map;

public class CaloriesMap {
    public static final Map<String, Double> CALORIESMAP;

    static {
        CALORIESMAP = new HashMap<String, Double>();
        CALORIESMAP.put("non-food", 0.0);
        CALORIESMAP.put("navel orange", 47.0);
        CALORIESMAP.put("tomato", 18.0);
        CALORIESMAP.put("kung pao dish", 129.0);
    }



}
