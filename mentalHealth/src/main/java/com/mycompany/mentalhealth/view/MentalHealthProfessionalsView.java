/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.view;

/**
 *
 * @author emreb
 */


import com.mycompany.mentalhealth.controller.MentalHealthProfessionalsController;
import com.mycompany.mentalhealth.model.MentalHealthProfessional;
import java.util.ArrayList;

import java.util.Scanner;

public class MentalHealthProfessionalsView {
    private MentalHealthProfessionalsController controller;
    private Scanner scanner;

    public MentalHealthProfessionalsView(MentalHealthProfessionalsController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("1. Add a Mental Health Professional");
            System.out.println("2. Remove a Mental Health Professional");
            System.out.println("3. Get a Mental Health Professional");
            System.out.println("4. Exit from the System");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProfessionalUI();
                    break;
                case 2:
                    removeProfessionalUI();
                    break;
                case 3:
                    getProfessionalUI();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please input a value from the given menu");
            }
        }
    }

    private void addProfessionalUI() {
        System.out.println("Input ID:");
        int id = scanner.nextInt();
        System.out.println("Input First Name:");
        String firstName = scanner.next();
        System.out.println("Input Last Name:");
        String lastName = scanner.next();
        System.out.println("Input Gender:");
        String gender = scanner.next();
        System.out.println("Input Phone Number:");
        long phone = scanner.nextLong();
        
        MentalHealthProfessional professional = new MentalHealthProfessional(firstName, lastName, gender, phone, new ArrayList<>(), id);
        controller.addProfessional(professional);
        System.out.println("Mental Health Professional is added");
    }

    private void removeProfessionalUI() {
        System.out.println("Input the ID of the professional to remove from the collection:");
        int id = scanner.nextInt();
        controller.removeProfessional(id);
        System.out.println("Mental Health Professional is removed");
    }

    private void getProfessionalUI() {
        System.out.println("Input the ID of the professional to search:");
        int id = scanner.nextInt();
        MentalHealthProfessional professional = controller.getProfessional(id);
        if (professional != null) {
            System.out.println("Professional Information: " + professional);
        } else {
            System.out.println("The Mental Health Professional is not in the collection");
        }
    }
}



