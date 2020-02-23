package com.mibu;

import com.mibu.packings.Packing;

public interface Item {
  String name();

  Packing packing();

  float price();
}
