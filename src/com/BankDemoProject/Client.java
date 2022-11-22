package com.BankDemoProject;

public abstract class Client {
    // To be refactored

    /* Unique ID
  	Name - First name(s) - middle name - Last Name (name class)
    Date of birth // from  Identity Card information Class
    Contact Information Class
    Identity Card information Class
    Personal information
    Date account creation

    * */
    private ClientName name;
    private IdentityCardInformation identityCardInformation;
    private ContactInformation contactInformation;
    private String uniqueID;
    private ClientPersonalInformation clientPersonalInformation;
    private final String dateAccountCreation;





    // Client constructor arguments ->  Client name arguments
    public Client(){
        // Client creation - constructor invocation
     //  this.name = new ClientName();
        this.dateAccountCreation = ""; // to be replaced Class Date

    }

}
