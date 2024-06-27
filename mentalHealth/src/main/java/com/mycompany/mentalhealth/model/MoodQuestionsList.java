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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MoodQuestionsList {
    private Set<MoodQuestions> questionsSet;

    public MoodQuestionsList() {
        questionsSet = new HashSet<>();
        buildTestData(); 
    }

    public void addQuestion(MoodQuestions question) {
        questionsSet.add(question);
    }

    public boolean removeQuestion(MoodQuestions question) {
        return questionsSet.remove(question);
    }

    public Set<MoodQuestions> getAllQuestions() {
        return new HashSet<>(questionsSet); 
    }

    private void buildTestData() {
        addQuestion(new MoodQuestions("Anxiety", new ArrayList<>(Arrays.asList("How was today?", "Are you anxious?"))));
        addQuestion(new MoodQuestions("Depression", new ArrayList<>(Arrays.asList("Are you sad?", "Are you still interested in your activities?"))));
    }
}
