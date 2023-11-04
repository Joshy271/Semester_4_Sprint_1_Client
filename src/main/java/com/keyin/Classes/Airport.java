package com.keyin.Classes;

import java.util.List;
public class Airport {
    private int id;
    private String name;
    private String code;

    //Basic Airport Constructor
    public Airport() {}

    // Getter for Airport ID
    public int getId() {
        return id;
    }
    // Setter for Airport ID
    public void setId(int id) {
        this.id = id;
    }
    // Getter for Airport area code
    public String getCode() {
        return code;
    }
    // Setter for Airport area code
    public void setCode(String code) {
        this.code = code;
    }
    // Getter for Airport name
    public String getName() {
        return name;
    }
    // Setter for Airport name
    public void setName(String name) {
        this.name = name;
    }
}

