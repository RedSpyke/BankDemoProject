package com.BankDemoProject;

public final class IdentityCardInformation {
    private int numericalPersonalCode;
    private String series;
    private int numberID;
    private String sex; // Enum !?!
    private String issuedBy;
    private ClientName clientName;
    private String nationality;  // Method validation for nationality
    private String validity;
    private Address address;

    // Arguments for constructor
    // Address object
    Address addressObj = createAddress();


    public IdentityCardInformation(int numericalPersonalCode, String series, int numberID, String sex, String issuedBy, ClientName clientName, String nationality, String validity, Address addressObj) {
        this.numericalPersonalCode = numericalPersonalCode;
        this.series = series;
        this.numberID = numberID;
        this.sex = sex;
        this.issuedBy = issuedBy;
        this.clientName = clientName;
        this.nationality = nationality;
        this.validity = validity;
        this.address = addressObj;
    }

    // Getters methods

    public int getNumericalPersonalCode() {
        return numericalPersonalCode;
    }

    public String getSeries() {
        return series;
    }

    public int getNumberID() {
        return numberID;
    }

    public String getSex() {
        return sex;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public ClientName getClientName() {
        return clientName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getValidity() {
        return validity;
    }

    public Address getAddress() {
        return address;
    }



    // Validation methods
    public boolean numericalPersonalCodeValidation (){
        boolean result = false;
        // ...
     return result;
    }

    public boolean nationalityValidation(){
        boolean result = false;
        // ...
        return result;
    }

    public Address createAddress(){
        // TO DO - add arguments and validation
        return new Address();
    }
}
