package com.zewenaco.designpatterns.structural.decorator.common.custom;

import com.zewenaco.designpatterns.structural.decorator.common.house.IHouse;

public class CustomPaintingPackage extends HouseAccessories {

  public CustomPaintingPackage(IHouse house) {
    super(house);
  }

  @Override
  public String getDetails() {
    return super.getDetails() + " + Custom Painting Package";
  }

  @Override
  public double getPrice() {
    return super.getPrice() + 1000;
  }
}
