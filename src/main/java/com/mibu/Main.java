package com.mibu;

import com.mibu.bottles.Limonade;
import com.mibu.burgers.ClassicBurger;
import com.mibu.extras.ChunkyFries;
import com.mibu.meals.Meal;
import com.mibu.meals.MealBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    MealBuilder mealBuilder = new MealBuilder();

    Meal cheeseCombo = mealBuilder.prepareCheeseCombo();
    System.out.println("Cheese Combo");
    cheeseCombo.showItems();
    System.out.println("Total: " + cheeseCombo.getCost());

    Meal chickenCombo = mealBuilder.prepareChickenCombo();
    System.out.println("Chicken Combo");
    chickenCombo.showItems();
    System.out.println("Total: " + chickenCombo.getCost());

    List<Item> customItems = new ArrayList<>();
    customItems.add(new ClassicBurger());
    customItems.add(new ChunkyFries());
    customItems.add(new Limonade());

    Meal prepareCustomCombo = mealBuilder.prepareCustomCombo(customItems);
    System.out.println("Chicken Combo");
    prepareCustomCombo.showItems();
    System.out.println("Total Cost: " + prepareCustomCombo.getCost());
  }
}
