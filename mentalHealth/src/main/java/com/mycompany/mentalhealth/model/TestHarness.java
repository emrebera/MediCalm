/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.model;



import java.util.ArrayList;

public class TestHarness {
    public TestHarness(){
        testPersonClass();
        testPatientClass();
        testClassHierarchy();
        testInterface();
    }
    public void testPersonClass(){
        System.out.println("Testing the Person class");
        Person p1 = new Person();
        if (p1 != null){
            System.out.println(p1.getFirstName());
            System.out.println(p1.getGender());
            System.out.println(p1.getLastName());
            System.out.println(p1.getPhoneNumber());
        }
        else
            System.out.println("The Person was not created successfully");
        p1.setGender("male");
        p1.setFirstName("John");
        p1.setLastName("Smith");
        p1.setPhoneNumber(1234567890);

        System.out.println(p1.toString());

        if (p1.getGender() == "male"){
            System.out.println("The change in gender was completed successfully");
        }
        else {
            System.out.println("There was an error while changing the Person instance");
        }

        if (p1.getFirstName() == "John"){
            System.out.println("The change in First Name was completed successfully");
        }
        else {
            System.out.println("There was an error while changing the Person instance");
        }

        if (p1.getLastName() == "Smith"){
            System.out.println("The change in Last Name was completed successfully");
        }
        else {
            System.out.println("There was an error while changing the Person instance");
        }

        if (p1.getPhoneNumber() == 1234567890){
            System.out.println("The change in Phone Number was completed successfully");
        }
        else {
            System.out.println("There was an error while changing the Person instance");
        }

    }


    public void testPatientClass(){
        System.out.println("Testing the Patient class");

        Patient p1 = new Patient();
        if (p1 != null){
            System.out.println(p1.getFirstName());
            System.out.println(p1.getGender());
            System.out.println(p1.getLastName());
            System.out.println(p1.getPhoneNumber());
            System.out.println(p1.getPatientId());
            System.out.println(p1.getAddress());
            System.out.println(p1.getAssignedProfessional());
            System.out.println(p1.getDateOfBirth());
            System.out.println(p1.getHealthCondition());

        }
        else
            System.out.println("The Person was not created successfully");

        p1.setGender("male");
        p1.setFirstName("John");
        p1.setLastName("Smith");
        p1.setPhoneNumber(1234567890);
        p1.setPatientId(1111);
        p1.setAddress("100 nullwood dr");
        p1.setAssignedProfessional("DR. Mike");
        p1.setDateOfBirth("01/01/1945");
        p1.setHealthCondition("Anxiety");

        System.out.println(p1.toString());

        if (p1.getGender() == "male"){
            System.out.println("The change in gender was completed successfully");
        }
        else {
            System.out.println("There was an error while changing the Person instance");
        }

        if (p1.getFirstName() == "John"){
            System.out.println("The change in First Name was completed successfully");
        }
        else {
            System.out.println("There was an error while changing the Person instance");
        }

        if (p1.getLastName() == "Smith"){
            System.out.println("The change in Last Name was completed successfully");
        }
        else {
            System.out.println("There was an error while changing the Person instance");
        }

        if (p1.getPhoneNumber() == 1234567890){
            System.out.println("The change in Phone Number was completed successfully");
        }
        else {
            System.out.println("There was an error while changing the Person instance");
        }

        if (p1.getAddress() == "100 nullwood dr"){
            System.out.println("The change in Address was completed successfully");
        }
        else {
            System.out.println("There was an error while changing the Person instance");
        }

        if (p1.getPatientId() == 1111){
            System.out.println("The change in Patient ID was completed successfully");
        }
        else {
            System.out.println("There was an error while changing the Person instance");
        }

        if (p1.getDateOfBirth() == "01/01/1945"){
            System.out.println("The change in Date Of Birth was completed successfully");
        }
        else {
            System.out.println("There was an error while changing the Person instance");
        }

        if (p1.getAssignedProfessional() == "DR. Mike"){
            System.out.println("The change in Assigned Professional was completed successfully");
        }
        else {
            System.out.println("There was an error while changing the Person instance");
        }

        if (p1.getHealthCondition() == "Anxiety"){
            System.out.println("The change in Health Condition was completed successfully");
        }
        else {
            System.out.println("There was an error while changing the Person instance");
        }

    }

    public void testClassHierarchy(){
        ArrayList<Patient> patients = new ArrayList<>();

        Patient p1 = new Patient("Mike", "Wazky", "Male", 7274353322L, "Jane Doe and John Smith", "09/23/1993", "123 Nullwell dr", "Anxiety", 123);
        Patient p2 = new Patient("Jack", "Wed", "Male", 7274354567L, "John Smith and John Smith", "08/20/1999", "567 Garden dr", "Depression", 567);

        patients.add(p1);
        patients.add(p2);

        MentalHealthProfessional mh1 = new MentalHealthProfessional("Jane", "Doe", "Female", 7173445566L, patients, 7898);
        MentalHealthProfessional mh2 = new MentalHealthProfessional("John", "Smith", "Male", 7173445566L, patients, 9853);

        ArrayList<Person> people = new ArrayList<>();

        people.add(p1);
        people.add(p2);
        people.add(mh1);
        people.add(mh2);

        for (Person i : people){

            System.out.println(i.toString());
            i.status();

        }
    }

    public void testInterface(){

        ArrayList<Patient> patients = new ArrayList<>();

        Patient p1 = new Patient("Mike", "Wazky", "Male", 7274353322L, "Jane Doe and John Smith", "09/23/1993", "123 Nullwell dr", "Anxiety", 123);
        Patient p2 = new Patient("Jack", "Wed", "Male", 7274354567L, "John Smith and John Smith", "08/20/1999", "567 Garden dr", "Depression", 567);

        patients.add(p1);
        patients.add(p2);

        MentalHealthProfessional mh1 = new MentalHealthProfessional("Jane", "Doe", "Female", 7173445566L, patients, 7898);
        MentalHealthProfessional mh2 = new MentalHealthProfessional("John", "Smith", "Male", 7173445566L, patients, 9853);

        ArrayList<String> questions1 = new ArrayList<>();

        questions1.add("Example question 1");
        questions1.add("Example question 2");

        ArrayList<String> questions2 = new ArrayList<>();

        questions2.add("Example question 3");
        questions2.add("Example question 4");

        MoodQuestions q1 = new MoodQuestions("Depression", questions1);
        MoodQuestions q2 = new MoodQuestions("Anxiety", questions2);

        ArrayList<Filter> filteredObjectsQuestions = new ArrayList<>();

        filteredObjectsQuestions.add(q1);
        filteredObjectsQuestions.add(q2);

        for (Filter i: filteredObjectsQuestions){
            i.filterObjects("Example question 1");
            i.printFilteredObjects();
        }

        ArrayList<Filter> filteredObjectsProfessionals = new ArrayList<>();

        filteredObjectsProfessionals.add(mh1);
        filteredObjectsProfessionals.add(mh2);

        for (Filter i: filteredObjectsProfessionals){
            i.filterObjects("Wed");
            i.printFilteredObjects();
        }

    }
}
