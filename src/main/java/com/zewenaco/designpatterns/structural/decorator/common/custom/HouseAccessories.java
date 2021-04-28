package com.zewenaco.designpatterns.structural.decorator.common.custom;

import com.zewenaco.designpatterns.structural.decorator.common.house.IHouse;

public abstract class HouseAccessories implements IHouse {

  private IHouse house;

  public HouseAccessories(IHouse house) {
    this.house = house;
  }

  public double getPrice() {
    return house.getPrice();
  }

  public String getDetails() {
    return house.getDetails();
  }
}
