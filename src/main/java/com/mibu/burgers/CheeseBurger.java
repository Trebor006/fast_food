package com.mibu.burgers;

public class CheeseBurger extends Burger {

  @Override
  public float price() {
    return 22.0f;
  }

  @Override
  public String name() {
    return "Cheese Burger";
  }
}
