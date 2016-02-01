package com.training.domains;

import com.training.ifaces.Automobileable;

public class LuxuryCar implements Automobileable {

  @Override
 public String getColor() {
    // TODO Auto-generated method stub
    return "Silver";
  }

  @Override
public double getPrice() {
    // TODO Auto-generated method stub
    return 100000000;
  }

  @Override
public String getModel() {
    // TODO Auto-generated method stub
    return "Phantom";
  }

}
