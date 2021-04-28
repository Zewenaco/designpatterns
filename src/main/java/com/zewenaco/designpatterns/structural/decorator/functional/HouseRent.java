package com.zewenaco.designpatterns.structural.decorator.functional;

import com.zewenaco.designpatterns.structural.decorator.common.house.IHouse;
import java.util.function.Function;

public class HouseRent {

  Function<IHouse, IHouse> decoration;

  public HouseRent(Function<IHouse, IHouse> decoration) {
    this.decoration = decoration;
  }

  public IHouse use(IHouse baseIHouse) {
    return decoration.apply(baseIHouse);
  }
}
