package com.devstromo.patterns.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String type = bufferedReader.readLine();
        bufferedReader.close();
        FoodFactory foodFactory = new FoodFactory();
        System.out.println(foodFactory.getFood(type));
    }
}

class FoodFactory {
    public String getFood(String order) {
        return switch (order) {
            case "cake" -> "The factory returned class Cake\nSomeone ordered a Dessert!";
            case "pizza" -> "The factory returned class Pizza\n" + "Someone ordered a Fast Food!";
            default -> null;
        };
    }
}