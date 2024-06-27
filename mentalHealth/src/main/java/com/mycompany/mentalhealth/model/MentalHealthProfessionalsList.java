/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.model;

/**
 *
 * @author emreb
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MentalHealthProfessionalsList {
    private Map<Integer, MentalHealthProfessional> professionals;

    public MentalHealthProfessionalsList() {
        professionals = new HashMap<>();
        buildTestData(); 
    }

    public void addProfessional(MentalHealthProfessional professional) {
        professionals.put(professional.getProfessionalId(), professional);
    }

    public MentalHealthProfessional getProfessional(int id) {
        return professionals.get(id);
    }

    public void removeProfessional(int id) {
        professionals.remove(id);
    }

    public Map<Integer, MentalHealthProfessional> getAllProfessionals() {
        return professionals;
    }

    private void buildTestData() {
        addProfessional(new MentalHealthProfessional("Danila", "Smither", "Female", 1234567890L, new ArrayList<>(), 1111));
        addProfessional(new MentalHealthProfessional("danny", "kin", "Male", 2223334455L, new ArrayList<>(), 2222));
    }
}
