package com.zewenaco.designpatterns.structural.decorator.common.house;

public class FlatRoofHouse implements IHouse {

  public double getPrice() {
    return 20000;
  }

  public String getDetails() {
    return "House with flat roof";
  }
}
