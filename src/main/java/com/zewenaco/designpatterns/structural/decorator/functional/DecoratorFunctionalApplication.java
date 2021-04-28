package com.zewenaco.designpatterns.structural.decorator.functional;

import com.zewenaco.designpatterns.structural.decorator.common.custom.CustomPaintingPackage;
import com.zewenaco.designpatterns.structural.decorator.common.custom.MultiStoryPackage;
import com.zewenaco.designpatterns.structural.decorator.common.house.AtticHouse;
import com.zewenaco.designpatterns.structural.decorator.common.house.IHouse;

public class DecoratorFunctionalApplication {

  public static void main(String[] args) {
    IHouse house =
        new HouseRent(CustomPaintingPackage::new)
            .use(new HouseRent(MultiStoryPackage::new).use(new AtticHouse()));
    System.out.printf("House: %s, Cost: %.1f", house.getDetails(), house.getPrice());
  }
}
