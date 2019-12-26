package com.example.alertdialog26112019;

public interface OrderBuilder {

   OrderBuilder orderSandwich(String sandWich);
   OrderBuilder orderMexican(String mexican);
   OrderBuilder orderNurger(String burger);
   OrderBuilder orderCoffee(String coffee);
   OrderBuilder orderFrenchfires(String frenchfires);
   FastFood build();

}
