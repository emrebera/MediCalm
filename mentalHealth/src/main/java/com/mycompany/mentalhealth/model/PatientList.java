/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.model;

import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author emreb
 */
public class PatientList {
    
    private Patient patient;
    private ArrayList<Patient> listOfPatients = new ArrayList<>();
    private final String listOfPatientsFileName = "listOfPatients.txt";
    
    public PatientList() {
//        this.readPatientListFile();
        if (listOfPatients.isEmpty() || listOfPatients == null) {
//            this.createTestPatientList();
//            this.writePatientListFile();
            this.readPatientListFile();
        }
//        this.printPatientList();
    }
    
    public ArrayList<Patient> getListOfPatients(){
        return listOfPatients;
   }
    
    public void setListOfPatients(ArrayList<Patient> listOfPatients){
        this.listOfPatients = listOfPatients;
   }
    
//    public PatientList(){
//        if(listOfPatients.size() == 0){
//            createPatientList();
//        }
//    }
    
     private void readPatientListFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(listOfPatientsFileName))) {
            listOfPatients = (ArrayList<Patient>) in.readObject();
            if (!listOfPatients.isEmpty()) {
                System.out.println("There are patients in the patient list.");
            }
            in.close();
        } catch (FileNotFoundException fne) {
            System.out.println("File was not found, a new one will be created.");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
     
     public void writePatientListFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(listOfPatientsFileName))) {
            out.writeObject(listOfPatients);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

     

   
//    public void createTestPatientList(){
//        for (int i = 1; i <= 6; i++){
//            patient = new Patient("Test Patient" + i, "Smith", "Female", 1234567890, "Jane Smith", "01/01/1999", "123 nullwood ln", "Anxiety", 12345 + i);
//            listOfPatients.add(patient);
//        }
//        for (int i = 1; i <= 6; i++){
//            patient = new Patient("Patient Test" + i, "Doe", "Male", 1234554321, "Joe Smith", "01/01/2001", "543 nullwood ln", "Depression", 34567 + i);
//            listOfPatients.add(patient);
//        }
//    }
//    public void printPatientList(){
//        for (Patient listOfPatient : listOfPatients){
//            System.out.println(listOfPatient);
//        
//        }
//    
//    
//    }
    
    public void updatePatient(Patient updatedPatient, int index) {
    listOfPatients.set(index, updatedPatient);
    writePatientListFile();
}
    
     public void addPatient(Patient patient) {
        listOfPatients.add(patient);
        writePatientListFile();
    }

    // Updates a patient's information in the list at the given index, then writes the updated list to file
    public void updatePatient(int index, Patient updatedPatient) {
        if(index >= 0 && index < listOfPatients.size()) {
            listOfPatients.set(index, updatedPatient);
            writePatientListFile();
        } else {
            System.out.println("Invalid patient index.");
        }
    }

    // Deletes a patient from the list at the given index, then writes the updated list to file
    public void deletePatient(int index) {
        if(index >= 0 && index < listOfPatients.size()) {
            listOfPatients.remove(index);
            writePatientListFile();
        } else {
            System.out.println("Invalid patient index.");
        }
    }
    
}
