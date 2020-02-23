package com.mibu.extras;

import com.mibu.Item;
import com.mibu.packings.Box;
import com.mibu.packings.Packing;

public abstract class Extra implements Item {

  @Override
  public Packing packing() {
    return new Box();
  }

  @Override
  public abstract float price();
}
