package com.zewenaco.designpatterns.structural.decorator.common.custom;

import com.zewenaco.designpatterns.structural.decorator.common.house.IHouse;

public class MultiStoryPackage extends HouseAccessories {

  public MultiStoryPackage(IHouse house) {
    super(house);
  }

  @Override
  public String getDetails() {
    return super.getDetails() + " + Multi Story Package";
  }

  @Override
  public double getPrice() {
    return super.getPrice() + 5000;
  }
}
