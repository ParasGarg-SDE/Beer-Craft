package com.example.beercraft;

public class Beers {
    private String BeerName;
    private double abv;
    private int ibu;
    private int id;
    private String BeerStyle;
    private int ounces;

    public Beers (String BeerName, double abv, int ibu, int id, String BeerStyle, int ounces) {
        this.BeerName = BeerName;
        this.abv = abv;
        this.ibu = ibu;
        this.id = id;
        this.BeerStyle = BeerStyle;
        this.ounces = ounces;
    }

    public String getBeerName() {
        return BeerName;
    }

    public void setBeerName(String beerName) {
        BeerName = beerName;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }

    public int getIbu() {
        return ibu;
    }

    public void setIbu(int ibu) {
        this.ibu = ibu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBeerStyle() {
        return BeerStyle;
    }

    public void setBeerStyle(String beerStyle) {
        BeerStyle = beerStyle;
    }

    public int getOunces() {
        return ounces;
    }

    public void setOunces(int ounces) {
        this.ounces = ounces;
    }
}
