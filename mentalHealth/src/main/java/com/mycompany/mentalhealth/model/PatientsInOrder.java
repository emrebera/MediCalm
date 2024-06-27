/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.model;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author emreb
 */
public class PatientsInOrder {
    private LinkedList<Patient> patients;

    public PatientsInOrder() {
        patients = new LinkedList<>();
        buildTestData();
        printPatients();
    }

    public void addItem(Patient newPatient) {
        ListIterator<Patient> iterator = patients.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getLastName().compareToIgnoreCase(newPatient.getLastName()) > 0) {
                iterator.previous(); // Move cursor back to previous
                iterator.add(newPatient);
                return;
            }
        }
        // If the patient's last name comes after all others in the list or the list is empty
        patients.add(newPatient);
    }

    public void removeItem(Patient patientToRemove) {
        patients.removeIf(patient -> patient.getPatientId() == patientToRemove.getPatientId());
    }

    public Patient getItem(String searchTerm) {
        for (Patient patient : patients) {
            if (patient.getLastName().equalsIgnoreCase(searchTerm)) {
                return patient;
            }
        }
        return null;
    }

    private void buildTestData() {
        // Use the full constructor of your Patient class
        addItem(new Patient("John", "Doe", "Male", 1234567890L, "Dr. Smith", "01/01/1984", "123 Main St", "Depression", 11111));
        addItem(new Patient("Jane", "Smith", "Female", 1234567891L, "Dr. Doe", "02/02/1982", "456 Main St", "Anxiety", 22222));
        addItem(new Patient("Joe", "Bekir", "Male", 1234567877L, "Dr. Doe", "03/03/1999", "567 Main St", "Anxiety", 3333));
    }

    public void printPatients() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }
}