package com.BankDemoProject;

public class ClientName {
    private String preferredName;
    private String firstNameS;
    private String middleName;
    private String LastName;

    public ClientName(String firstNameS, String lastName) {
        this.firstNameS = firstNameS;
        LastName = lastName;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getFirstNameS() {
        return firstNameS;
    }

    public void setFirstNameS(String firstNameS) {
        this.firstNameS = firstNameS;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
