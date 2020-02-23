package com.mibu.bottles;

import com.mibu.Item;
import com.mibu.packings.Bottle;
import com.mibu.packings.Packing;

public abstract class ColdDrink implements Item {

  @Override
  public Packing packing() {
    return new Bottle();
  }

  @Override
  public abstract float price();
}
