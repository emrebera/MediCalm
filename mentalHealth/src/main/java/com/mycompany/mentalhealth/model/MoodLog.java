/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.model;


import java.util.ArrayList;

public class MoodLog {
    private int patientId, professionalId;
    private String date;
    private ArrayList<Integer> ratings;

    public MoodLog(int patientId, int professionalId, String date, ArrayList<Integer> ratings) {
        this.patientId = patientId;
        this.professionalId = professionalId;
        this.date = date;
        this.ratings = ratings;
    }

    public MoodLog() {
        this.patientId = 0;
        this.professionalId = 0;
        this.date = "not available";
        this.ratings = new ArrayList<>();
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(int professionalId) {
        this.professionalId = professionalId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<Integer> getRatings() {
        return ratings;
    }

    public void setRatings(ArrayList<Integer> ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "MoodLog{" +
                "patientId=" + patientId +
                ", professionalId=" + professionalId +
                ", date='" + date + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
