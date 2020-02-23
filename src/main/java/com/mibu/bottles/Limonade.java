package com.mibu.bottles;

public class Limonade extends ColdDrink {

  @Override
  public float price() {
    return 35.0f;
  }

  @Override
  public String name() {
    return "Limonade";
  }
}
