package com.mibu.meals;

import com.mibu.Item;
import com.mibu.bottles.Coke;
import com.mibu.bottles.Limonade;
import com.mibu.burgers.CheeseBurger;
import com.mibu.burgers.ChickenBurger;
import com.mibu.extras.ClassicFries;
import com.mibu.extras.YukaFrita;

import java.util.List;

public class MealBuilder {

  public Meal prepareCheeseCombo() {
    Meal meal = new Meal();
    meal.addItem(new CheeseBurger());
    meal.addItem(new Coke());
    meal.addItem(new ClassicFries());
    meal.setDiscount(5f);
    return meal;
  }

  public Meal prepareChickenCombo() {
    Meal meal = new Meal();
    meal.addItem(new ChickenBurger());
    meal.addItem(new Limonade());
    meal.addItem(new YukaFrita());
    meal.setDiscount(3f);
    return meal;
  }

  public Meal prepareCustomCombo(List<Item> items) {
    Meal meal = new Meal();
    for (Item item : items) {
      meal.addItem(item);
    }
    return meal;
  }
}
