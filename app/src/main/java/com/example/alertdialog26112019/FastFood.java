package com.example.alertdialog26112019;

public class FastFood {
   private String sandwich;
   private String mexican;
   private String burger;
   private String coffee;
   private String frenchfires;

    public FastFood(String sandwich, String mexican, String burger, String coffee, String frenchfires) {
        this.sandwich = sandwich;
        this.mexican = mexican;
        this.burger = burger;
        this.coffee = coffee;
        this.frenchfires = frenchfires;
    }

    public String getSandwich() {
        return sandwich;
    }

    public void setSandwich(String sandwich) {
        this.sandwich = sandwich;
    }

    public String getMexican() {
        return mexican;
    }

    public void setMexican(String mexican) {
        this.mexican = mexican;
    }

    public String getBurger() {
        return burger;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public String getCoffee() {
        return coffee;
    }

    public void setCoffee(String coffee) {
        this.coffee = coffee;
    }

    public String getFrenchfires() {
        return frenchfires;
    }

    public void setFrenchfires(String frenchfires) {
        this.frenchfires = frenchfires;
    }
}
