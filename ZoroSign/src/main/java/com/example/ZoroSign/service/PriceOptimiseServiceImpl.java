package com.example.ZoroSign.service;

import com.example.ZoroSign.Constants.ItemConstants;
import com.example.ZoroSign.model.Item;
import com.example.ZoroSign.model.PriceList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceOptimiseServiceImpl implements PriceOptimiseService
{
  @Autowired
  private Item item;

  @Autowired
  private PriceList priceList;

  @Autowired
  private ItemConstants itemConstants;

  public static final String KINGCOCONUT = "KingCoconut";

  public static final String APPLE = "Apple";

  @Override
  public Item getOptimisePrice(String item, int quantity)
  {

    if (item.equalsIgnoreCase(KINGCOCONUT)){
      return getKingCoconutOptimisePrice(quantity);
    }

    else if (item.equalsIgnoreCase(APPLE)){
      return getAppleOptimisePrice(quantity);
  }
    else {
      throw  new RuntimeException("null");
    }

  }

  @Override
  public List<PriceList> getPriceList()
  {
    //return " Apple single Price :" + itemConstants.APPLE_SINGLE_PRICE + " King Coconut Price : " + itemConstants.KING_COCONUT_SINGLE_PRICE;
//    priceList.setAppleSinglePrice(itemConstants.APPLE_SINGLE_PRICE);
//    priceList.setKingCoconutPrice(itemConstants.KING_COCONUT_SINGLE_PRICE);
    List<PriceList> priceListItems= Arrays.asList(
        new PriceList(APPLE,itemConstants.APPLE_SINGLE_PRICE),
        new PriceList(KINGCOCONUT,itemConstants.KING_COCONUT_SINGLE_PRICE)
    );
    return priceListItems;
  }

  private Item getAppleOptimisePrice(int quantity)
  {
    item.setNumberOfCarton(quantity/itemConstants.APPLE_CARTON_SIZE);
    item.setNumberOfSingleUnits(quantity%itemConstants.APPLE_CARTON_SIZE);
    item.setSinglePrice(itemConstants.APPLE_SINGLE_PRICE);
    item.setCartonPrice(itemConstants.APPLE_CARTON_PRICE);
    item.setOptimumPrice(getPrice(item));
    //return "Cartons : "+ item.getNumberOfCarton() +" Single Units : " + item.getNumberOfSingleUnits() + " Price :" + getPrice(item);
    return item;
  }

  private Item getKingCoconutOptimisePrice(int quantity)
  {
      item.setNumberOfCarton(quantity/itemConstants.KING_COCONUT_CARTON_SIZE);
      item.setNumberOfSingleUnits(quantity % itemConstants.KING_COCONUT_CARTON_SIZE);
      item.setSinglePrice(itemConstants.KING_COCONUT_SINGLE_PRICE);
      item.setCartonPrice(itemConstants.KINGCOCONUT_CARTON_PRICE);

      item.setOptimumPrice(getPrice(item));

     //return "Cartons :" +item.getNumberOfCarton() + " Single Units :"+item.getNumberOfSingleUnits()+ " Price :" + getPrice(item);
      return item;
  }

  private double getPrice(Item item)
  {
    if (item.getNumberOfCarton()>=2){
      return  (((item.getSinglePrice()*1.2) *item.getNumberOfSingleUnits())+
          ((item.getCartonPrice()*item.getNumberOfCarton())* 0.8));

    }
    return  (((item.getSinglePrice()*1.2) *item.getNumberOfSingleUnits())+(item.getCartonPrice()*item.getNumberOfCarton()));

  }
}
