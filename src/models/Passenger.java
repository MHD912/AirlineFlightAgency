/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author husse
 */
public class Passenger {
    private String fullName;
    private String password;
    private float balance;
    private String passportID;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public Passenger() {
        this.fullName = "";
        this.password = "";
        this.balance = 0;
        this.passportID = "";
    }

    public Passenger(Passenger passenger) {
        this.fullName = passenger.fullName;
        this.password = passenger.password;
        this.balance = passenger.balance;
        this.passportID = passenger.passportID;
    }

    public Passenger(String fullName, String password, float balance, String passportID) {
        this.fullName = fullName;
        this.password = password;
        this.balance = balance;
        this.passportID = passportID;
    }

}
