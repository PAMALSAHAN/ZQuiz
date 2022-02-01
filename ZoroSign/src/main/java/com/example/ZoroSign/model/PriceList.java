package com.example.ZoroSign.model;

import org.springframework.stereotype.Component;

@Component
public class PriceList
{
//  private int appleSinglePrice;
//  private int kingCoconutPrice;
  private String name;
  private int price;

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public int getPrice()
  {
    return price;
  }

  public void setPrice(int price)
  {
    this.price = price;
  }

  public PriceList()
  {
  }

//  public PriceList(int appleSinglePrice, int kingCoconutPrice)
//  {
//    this.appleSinglePrice = appleSinglePrice;
//    this.kingCoconutPrice = kingCoconutPrice;
//  }

  public PriceList(String name, int price)
  {
    this.name = name;
    this.price = price;
  }

//  public int getAppleSinglePrice()
//  {
//    return appleSinglePrice;
//  }

//  //public void setAppleSinglePrice(int appleSinglePrice)
//  {
//    this.appleSinglePrice = appleSinglePrice;
//  }

//  public int getKingCoconutPrice()
//  {
//    return kingCoconutPrice;
//  }

//  public void setKingCoconutPrice(int kingCoconutPrice)
//  {
//    this.kingCoconutPrice = kingCoconutPrice;
//  }
}
