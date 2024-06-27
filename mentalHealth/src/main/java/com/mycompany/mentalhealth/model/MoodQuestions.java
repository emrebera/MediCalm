/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.model;

import com.mycompany.mentalhealth.model.Filter;

import java.util.ArrayList;

public class MoodQuestions implements Filter {
    private String questionType;
    private ArrayList<String> questions;

    private  ArrayList<String> filteredQuestionsArray = new ArrayList<>();

    public MoodQuestions(String questionType, ArrayList<String> questions) {
        this.questionType = questionType;
        this.questions = questions;
    }

    public MoodQuestions() {
        this.questionType = "empty";
        this.questions = new ArrayList<>();
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }

    @Override
    public void filterObjects(String filter){

        System.out.println("Filtering the questions");

        ArrayList<String> filteredArray = new ArrayList<>();
        for (String i: questions){
            if (i.equals(filter)){
                filteredArray.add(i);
            }
        }
        filteredQuestionsArray = filteredArray;
    }

    @Override
    public void printFilteredObjects() {
        System.out.println("The filtered questions:");

        for (String i: filteredQuestionsArray){
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "MoodQuestions{" +
                "questionText='" + questionType + '\'' +
                ", questions=" + questions +
                '}';
    }
}
