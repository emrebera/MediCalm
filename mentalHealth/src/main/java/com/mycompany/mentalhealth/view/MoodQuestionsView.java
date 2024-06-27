/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.view;

/**
 *
 * @author emreb
 */


import com.mycompany.mentalhealth.controller.MoodQuestionsController;
import com.mycompany.mentalhealth.model.MoodQuestions;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;
import java.util.Set;

public class MoodQuestionsView {
    private MoodQuestionsController controller;
    private Scanner scanner;

    public MoodQuestionsView(MoodQuestionsController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("1. Add a Question");
            System.out.println("2. Delete a Question");
            System.out.println("3. Show All Questions");
            System.out.println("4. Exit System");

            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    addQuestionUI();
                    break;
                case 2:
                    removeQuestionUI();
                    break;
                case 3:
                    showAllQuestionsUI();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("select a choice from the menu");
            }
        }
    }

    private void addQuestionUI() {
        System.out.println("Input Question Type:");
        String type = scanner.nextLine();
        System.out.println("Input Questions to add");
        String questions = scanner.nextLine();
        MoodQuestions newQuestion = new MoodQuestions(type, new ArrayList<>(Arrays.asList(questions.split(","))));
        controller.addQuestion(newQuestion);
        System.out.println("Question is added");
    }

    private void removeQuestionUI() {
        System.out.println("Input the question type that you want to delete");
        String type = scanner.nextLine();
        MoodQuestions question = new MoodQuestions(type, null); 
        if (controller.removeQuestion(question)) {
            System.out.println("Question is removed ");
        } else {
            System.out.println("Couldn't delete the quesdtion");
        }
    }

    private void showAllQuestionsUI() {
        Set<MoodQuestions> questions = controller.getAllQuestions();
        if (questions.isEmpty()) {
            System.out.println("No questions found");
        } else {
            questions.forEach(System.out::println);
        }
    }
}
