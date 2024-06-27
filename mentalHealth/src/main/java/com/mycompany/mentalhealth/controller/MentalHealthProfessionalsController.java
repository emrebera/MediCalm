/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.controller;

/**
 *
 * @author emreb
 */


import com.mycompany.mentalhealth.model.MentalHealthProfessional;
import com.mycompany.mentalhealth.model.MentalHealthProfessionalsList;
import java.util.Map;

public class MentalHealthProfessionalsController {
    private MentalHealthProfessionalsList professionalsList;

    public MentalHealthProfessionalsController() {
        professionalsList = new MentalHealthProfessionalsList();
    }

    public MentalHealthProfessional getProfessional(int id) {
        return professionalsList.getProfessional(id);
    }

    public void addProfessional(MentalHealthProfessional professional) {
        professionalsList.addProfessional(professional);
    }

    public void removeProfessional(int id) {
        professionalsList.removeProfessional(id);
    }

    public Map<Integer, MentalHealthProfessional> getAllProfessionalsMap() {
        return professionalsList.getAllProfessionals();
    }
}
