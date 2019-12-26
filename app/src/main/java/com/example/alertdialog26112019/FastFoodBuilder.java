package com.example.alertdialog26112019;

public class FastFoodBuilder implements OrderBuilder{
    private String sandwich;
    private String mexican;
    private String burger;
    private String coffee;
    private String frenchfires;

    @Override
    public OrderBuilder orderSandwich(String sandWich) {
        this.sandwich = sandWich;
        return this;
    }

    @Override
    public OrderBuilder orderMexican(String mexican) {
        this.mexican = mexican;
        return this;
    }

    @Override
    public OrderBuilder orderNurger(String burger) {
        this.burger = burger;
        return this;
    }

    @Override
    public OrderBuilder orderCoffee(String coffee) {
        this.coffee = coffee;
        return this;
    }

    @Override
    public OrderBuilder orderFrenchfires(String frenchfires) {
        this.frenchfires = frenchfires;
        return this;
    }

    @Override
    public FastFood build() {
        return new FastFood(sandwich,burger,mexican,coffee,frenchfires);
    }
}
