package com.zewenaco.designpatterns.structural.decorator.common.house;

public class AtticHouse implements IHouse {

  public double getPrice() {
    return 30000;
  }

  public String getDetails() {
    return "House with attic";
  }
}
