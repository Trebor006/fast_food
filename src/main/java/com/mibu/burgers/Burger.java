package com.mibu.burgers;

import com.mibu.Item;
import com.mibu.packings.Packing;
import com.mibu.packings.Wrapper;

public abstract class Burger implements Item {

  @Override
  public Packing packing() {
    return new Wrapper();
  }

  @Override
  public abstract float price();
}
