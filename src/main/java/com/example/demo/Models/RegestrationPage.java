package com.example.demo.Models;


import javax.persistence.*;

@Entity
@Table(name = "RegestrationTable")
public class RegestrationPage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String FirstName;
    private String LastName;
    private String UserName;
    private String Email;
    private String Adress;
    private String SecondAdress;
    private String Country;
    private String State;
    private String Zip;
    private String NameOfCard;
    private int CreditCardNumber;
    private int Expiration;
    private int CVV;


    public  RegestrationPage(){}
    public RegestrationPage(String firstName, String lastName, String userName, String email, String adress, String secondAdress, String country, String state, String zip, String nameOfCard, int creditCardNumber, int expiration, int CVV) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        UserName = userName;
        Email = email;
        Adress = adress;
        SecondAdress = secondAdress;
        Country = country;
        State = state;
        Zip = zip;
        NameOfCard = nameOfCard;
        CreditCardNumber = creditCardNumber;
        Expiration = expiration;
        this.CVV = CVV;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public String getSecondAdress() {
        return SecondAdress;
    }

    public void setSecondAdress(String secondAdress) {
        SecondAdress = secondAdress;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public String getNameOfCard() {
        return NameOfCard;
    }

    public void setNameOfCard(String nameOfCard) {
        NameOfCard = nameOfCard;
    }

    public int getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        CreditCardNumber = creditCardNumber;
    }

    public int getExpiration() {
        return Expiration;
    }

    public void setExpiration(int expiration) {
        Expiration = expiration;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }
}
