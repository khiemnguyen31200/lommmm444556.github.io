package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Employee {
    @JsonIgnore
    private int id;
    private String firstName;
    private String lastName;
    private String emailId;
    private String passportNumber;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    public String getFullName() {
        return lastName + " " + firstName;
    }
    
    public boolean matchWithKeyWord(String keyword) {
        String lowerName = getFullName().toLowerCase();
        String lowerEmail = emailId.toLowerCase();
        String lowerKeyWord = keyword.toLowerCase();
        return lowerName.contains(lowerKeyWord) || lowerEmail.contains(lowerKeyWord);
    }
}
