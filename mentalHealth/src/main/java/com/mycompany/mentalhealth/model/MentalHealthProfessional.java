/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.model;



import java.util.ArrayList;

public class MentalHealthProfessional extends Person implements Filter {

    private ArrayList<Patient> patients;
    private int professionalId;
    ArrayList<Patient> filteredPatientsArray = new ArrayList<>();

    public MentalHealthProfessional(String firstName, String lastName, String gender, long phoneNumber, ArrayList<Patient> patients, int professionalId) {
        super(firstName, lastName, gender, phoneNumber);
        this.patients = patients;
        this.professionalId = professionalId;
    }

    public MentalHealthProfessional() {
        super();
        this.patients = new ArrayList<>();
        this.professionalId = 0;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public int getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(int professionalId) {
        this.professionalId = professionalId;
    }

    @Override
    public void status(){
        System.out.println("Provider");
    }

    public void filterObjects(String filter){

        System.out.println("Filtering the Patient by their last names");

        ArrayList<Patient> filteredArray = new ArrayList<>();
        for (Patient i: patients){
            if (i.getLastName().equals(filter) ){
                filteredArray.add(i);
            }
        }
        filteredPatientsArray = filteredArray;
    }

    public void printFilteredObjects() {
        System.out.println("The filtered patients:");

        for (Patient i: filteredPatientsArray){
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "MentalHealthProfessional{" +
                "patients=" + patients +
                ", professionalId=" + professionalId +
                ", name= " + getFirstName() + " " + getLastName() +
                ", phone number= " + getPhoneNumber() +
                '}';
    }
}
