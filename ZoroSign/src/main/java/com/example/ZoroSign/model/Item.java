package com.example.ZoroSign.model;

import org.springframework.stereotype.Component;

@Component
public class Item
{
//  public static final int KING_COCONUT_CARTON_SIZE = 5;
//
//  public static final int APPLE_CARTON_SIZE = 20;
//
//  public static final int KING_COCONUT_SINGLE_PRICE = 165;
//
//  public static final int APPLE_SINGLE_PRICE = 20;
//
//  public static final int KINGCOCONUT_CARTON_PRICE = 825;
//
//  public static final int APPLE_CARTON_PRICE = 400;

  private int  numberOfCarton;
  private int numberOfSingleUnits;
  private int singlePrice;
  private double optimumPrice;

  public double getOptimumPrice()
  {
    return optimumPrice;
  }

  public void setOptimumPrice(double optimumPrice)
  {
    this.optimumPrice = optimumPrice;
  }



  public int getCartonPrice()
  {
    return cartonPrice;
  }

  public void setCartonPrice(int cartonPrice)
  {
    this.cartonPrice = cartonPrice;
  }

  private int cartonPrice;

  public int getNumberOfCarton()
  {
    return numberOfCarton;
  }

  public void setNumberOfCarton(int numberOfCarton)
  {
    this.numberOfCarton = numberOfCarton;
  }

  public int getNumberOfSingleUnits()
  {
    return numberOfSingleUnits;
  }

  public void setNumberOfSingleUnits(int numberOfSingleUnits)
  {
    this.numberOfSingleUnits = numberOfSingleUnits;
  }

  public int getSinglePrice()
  {
    return singlePrice;
  }

  public void setSinglePrice(int singlePrice)
  {
    this.singlePrice = singlePrice;
  }

  public Item()
  {
  }
}

//nandika@zorrosign.com