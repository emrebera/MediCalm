/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mentalhealth;



import com.mycompany.mentalhealth.controller.MentalHealthProfessionalsController;
import com.mycompany.mentalhealth.controller.PatientCntl;
import java.util.LinkedList;
import java.util.ListIterator;
import com.mycompany.mentalhealth.model.PatientsInOrder;
import com.mycompany.mentalhealth.view.MentalHealthProfessionalsView;
import com.mycompany.mentalhealth.controller.MoodQuestionsController;
import com.mycompany.mentalhealth.view.MoodQuestionsView;
public class Main {
    public static void main(String[] args) {
        MoodQuestionsController controller = new MoodQuestionsController();
        MoodQuestionsView view = new MoodQuestionsView(controller);
        view.start();
    }
}
