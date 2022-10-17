package com.BankDemoProject;

public final class Address {
    private String counties; // method validation
    private String city; // method validation
    private String street;
    private String number;
    private String building;
    private String entrance;
    private String floor;
    private String apartment;
    private String postalCode; // optional ZIPCode

    // Constructors
    public Address(){

    }

    public Address(String counties, String city, String street, String number) {
        this.counties = counties;
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public Address(String counties, String city, String street, String number, String building, String entrance, String floor, String apartment) {
        this.counties = counties;
        this.city = city;
        this.street = street;
        this.number = number;
        this.building = building;
        this.entrance = entrance;
        this.floor = floor;
        this.apartment = apartment;
    }

    public Address(String counties, String city, String street, String number, String building, String entrance, String floor, String apartment, String postalCode) {
        this.counties = counties;
        this.city = city;
        this.street = street;
        this.number = number;
        this.building = building;
        this.entrance = entrance;
        this.floor = floor;
        this.apartment = apartment;
        this.postalCode = postalCode;
    }





    public String getCounties() {
        return counties;
    }

    public void setCounties(String counties) {
        this.counties = counties;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getEntrance() {
        return entrance;
    }

    public void setEntrance(String entrance) {
        this.entrance = entrance;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
