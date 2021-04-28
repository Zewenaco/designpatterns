package com.zewenaco.designpatterns.structural.decorator.common;

import com.zewenaco.designpatterns.structural.decorator.common.custom.CustomPaintingPackage;
import com.zewenaco.designpatterns.structural.decorator.common.custom.HouseAccessories;
import com.zewenaco.designpatterns.structural.decorator.common.custom.MultiStoryPackage;
import com.zewenaco.designpatterns.structural.decorator.common.house.AtticHouse;
import com.zewenaco.designpatterns.structural.decorator.common.house.IHouse;

public class DecoratorCommonApplication {

  public static void main(String[] args) {
    IHouse basicHouse = new AtticHouse();
    HouseAccessories upgraded = new MultiStoryPackage(basicHouse);
    upgraded = new CustomPaintingPackage(upgraded);

    System.out.printf("House: %s, Cost: %.1f", upgraded.getDetails(), upgraded.getPrice());
  }
}
