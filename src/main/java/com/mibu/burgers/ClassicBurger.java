package com.mibu.burgers;

public class ClassicBurger extends Burger {

  @Override
  public float price() {
    return 20.0f;
  }

  @Override
  public String name() {
    return "Classic Burger";
  }
}
