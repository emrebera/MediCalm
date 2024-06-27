/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.model;

import java.io.Serializable;


public class Patient extends Person implements Serializable{
    private String assignedProfessional, dateOfBirth, address, healthCondition;
    private int patientId;


    public Patient(String firstName, String lastName, String gender, long phoneNumber, String assignedProfessional, String dateOfBirth, String address, String healthCondition, int patientId) {
        super(firstName, lastName, gender, phoneNumber);
        this.assignedProfessional = assignedProfessional;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.healthCondition = healthCondition;
        this.patientId = patientId;
    }

    public Patient() {
        super();
        this.assignedProfessional = "None";
        this.dateOfBirth = "00/00/0000";
        this.address = "None";
        this.healthCondition = "None";
        this.patientId = 0;
    }

    public String getAssignedProfessional() {
        return assignedProfessional;
    }

    public void setAssignedProfessional(String assignedProfessional) {
        this.assignedProfessional = assignedProfessional;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Override
    public void status(){
        System.out.println("Receiver");
    }


    @Override
    public String toString() {
        return "Patient{" +
                "assignedProfessional='" + assignedProfessional + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                ", healthCondition='" + healthCondition + '\'' +
                ", patientId=" + patientId +
                '}';
    }
}
