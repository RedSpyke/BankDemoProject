package com.BankDemoProject;

public final class IdentityCardInformation {
    private int numericalPersonalCode;
    private String series;
    private int numberID;
    private String Sex; // Enum !?!
    private String issuedBy;
    private ClientName clientName;
    private String nationality;  // Method validation for nationality
    private String validity;


    public IdentityCardInformation(){


    }





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
}
