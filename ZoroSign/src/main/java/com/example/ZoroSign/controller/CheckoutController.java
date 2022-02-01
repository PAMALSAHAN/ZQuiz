package com.example.ZoroSign.controller;

import com.example.ZoroSign.model.Item;
import com.example.ZoroSign.model.PriceList;
import com.example.ZoroSign.service.PriceOptimiseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200/")
@RestController
@RequestMapping("shop/")
public class CheckoutController
{
  @Autowired
  private PriceOptimiseService priceOptimiseService;

  @GetMapping("/{item}/{quantity}")
  public Item getOptimisePrice(@PathVariable String item, @PathVariable int quantity)
  {
    return priceOptimiseService.getOptimisePrice(item,quantity);
  }

  @GetMapping("priceList")
  public List<PriceList> getPriceList()
  {
    return priceOptimiseService.getPriceList();
  }


}
