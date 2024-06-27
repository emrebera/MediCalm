/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.controller;

/**
 *
 * @author emreb
 */

import com.mycompany.mentalhealth.model.MoodQuestions;
import com.mycompany.mentalhealth.model.MoodQuestionsList;
import java.util.Set;

public class MoodQuestionsController {
    private MoodQuestionsList questionsList;

    public MoodQuestionsController() {
        questionsList = new MoodQuestionsList();
    }

    public void addQuestion(MoodQuestions question) {
        questionsList.addQuestion(question);
    }

    public boolean removeQuestion(MoodQuestions question) {
        return questionsList.removeQuestion(question);
    }

    public Set<MoodQuestions> getAllQuestions() {
        return questionsList.getAllQuestions();
    }
}
