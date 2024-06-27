/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.model;

public class Person {
    private String firstName, lastName, gender;
    private long phoneNumber;


    public Person(String firstName, String lastName, String gender, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
        this.firstName = "None";
        this.lastName = "None";
        this.gender = "None";
        this.phoneNumber = 0000000000;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void status(){}

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
