package com.keyin.Classes;

import java.util.ArrayList;
import java.util.List;

public class Passenger {
    private int passengerID;
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private int cityId;
    private List<Integer> aircraftIds; // List to store aircraft IDs
    private List<Integer> airportIds; // List to store airport IDs

    // Default constructor
    public Passenger() {

    }

    // Parameterized constructor
    public Passenger(int passengerID, String firstName, String lastName, int phoneNumber, int cityId) {
        this.passengerID = passengerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.cityId = cityId;
        this.aircraftIds = new ArrayList<>(); // Initialize the aircraft list
        this.airportIds = new ArrayList<>(); // Initialize the airport list
    }



    // Getters and setters
    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

