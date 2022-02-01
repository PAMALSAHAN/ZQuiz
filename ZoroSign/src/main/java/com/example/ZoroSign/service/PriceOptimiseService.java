package com.example.ZoroSign.service;

import com.example.ZoroSign.model.Item;
import com.example.ZoroSign.model.PriceList;
import java.util.List;

public interface PriceOptimiseService
{
  public Item getOptimisePrice(String item , int quantity);

  public List<PriceList> getPriceList();
}
