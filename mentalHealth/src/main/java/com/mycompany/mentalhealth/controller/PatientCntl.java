/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.controller;

import com.mycompany.mentalhealth.model.Patient;
import com.mycompany.mentalhealth.model.PatientList;
import com.mycompany.mentalhealth.model.PatientTableModel;
import com.mycompany.mentalhealth.view.PatientUIDetail;
import com.mycompany.mentalhealth.view.PatientUIList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author emreb
 */
public class PatientCntl implements ActionListener{
    private Patient patient;
    private PatientList patientList;
    private PatientUIDetail patientUIDetail;
    private PatientUIList patientUIList;
    private int currentPatient;
    private PatientTableModel thePatientTableModel;
    
    public PatientCntl(){
        patientList = new PatientList();
        thePatientTableModel = new PatientTableModel (patientList.getListOfPatients());
        patientUIDetail = new PatientUIDetail(this);
        patientUIList = new PatientUIList (this);
        patientUIList.actualtablePatients.setModel(thePatientTableModel);
        addALButtons();
        patientUIDetail.setVisible(true);
        
    } 
    public void addALButtons(){
        patientUIDetail.btnAdd.addActionListener(this);
        patientUIDetail.btnPrevious.addActionListener(this);
        patientUIDetail.btnUpdate.addActionListener(this);
        patientUIDetail.btnDelete.addActionListener(this);
        patientUIDetail.btnNext.addActionListener(this);
        patientUIDetail.btnQuit.addActionListener(this);
        patientUIDetail.btnBacktoList.addActionListener(this);
        patientUIList.btnShowDetail.addActionListener(this);
        patientUIList.btnNew.addActionListener(this);
        patientUIList.btnQuit.addActionListener(this);
        patientUIList.btnDelete.addActionListener(this);

        
        
    }
    public ArrayList<Patient> getListOfPatients(){
        return patientList.getListOfPatients();
    }
    
    public PatientTableModel getInstrumentTableModel(){
        return thePatientTableModel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object obj = e.getSource();
        
        if (obj == patientUIDetail.btnNext) {
            currentPatient = patientUIDetail.getCurrentPatient();
            if (currentPatient == patientList.getListOfPatients().size() - 1)
                currentPatient = 0;
            else
                currentPatient++;
            patientUIDetail.setCurrentPatient(currentPatient);
            patientUIDetail.parsePatient(patientList.getListOfPatients().get(currentPatient));
      } 
        else if (obj == patientUIDetail.btnPrevious) {
                currentPatient = patientUIDetail.getCurrentPatient();
            if (currentPatient == 0)
                currentPatient = patientList.getListOfPatients().size() - 1;
            else
                currentPatient--;
            patientUIDetail.setCurrentPatient(currentPatient);
            patientUIDetail.parsePatient(patientList.getListOfPatients().get(currentPatient));
        }
        
        else if (obj == patientUIDetail.btnAdd){
            Patient genericPatient = new Patient();
            
            patientList.getListOfPatients().add(genericPatient);
            patientUIDetail.parsePatient(genericPatient);
        }
        
        else if (obj == patientUIDetail.btnDelete){
            patientList.getListOfPatients().remove(currentPatient);
            patientUIDetail.parsePatient(patientList.getListOfPatients().get(currentPatient));
            
        }
        else if (obj == patientUIDetail.btnUpdate){
            Patient patientToUpdate = patientList.getListOfPatients().get(currentPatient);
        
            patientToUpdate.setFirstName(patientUIDetail.getFirstName());
            patientToUpdate.setLastName(patientUIDetail.getLastName());
            patientToUpdate.setGender(patientUIDetail.getGender());
            long phoneNumber = Long.parseLong(patientUIDetail.getPhoneNumber());
            patientToUpdate.setPhoneNumber(phoneNumber);
            int patientId = Integer.parseInt(patientUIDetail.getPatientID());
            patientToUpdate.setPatientId(patientId);
            patientToUpdate.setAssignedProfessional(patientUIDetail.getAssignedProfessional());
            patientToUpdate.setDateOfBirth(patientUIDetail.getDateOfBirth());
            patientToUpdate.setAddress(patientUIDetail.getAddress());
            patientToUpdate.setHealthCondition(patientUIDetail.getPatientCondition());
            // Assuming patientID is an integer or long and should not be changed directly by UI update

            // Refresh UI to reflect updated information
            patientUIDetail.parsePatient(patientToUpdate);
        }
        else if (obj == patientUIDetail.btnQuit){
             System.exit(0);
        } else if (obj == patientUIDetail.btnBacktoList)
        {
             patientUIDetail.setVisible(false);
             patientUIList.setVisible(true);
        } else if (obj == patientUIList.btnShowDetail){
             currentPatient = patientUIList.actualtablePatients.getSelectedRow();
             patientUIDetail.parsePatient(patientList.getListOfPatients().get(currentPatient));
             patientUIList.setVisible(false);
             patientUIDetail.setVisible(true);
        
        }  else if (obj == patientUIList.btnNew){
          Patient newPatient = new Patient();
        // Add this patient to the table model
        thePatientTableModel.addPatient(newPatient);
    }
        else if (obj == patientUIList.btnQuit){
            patientList.setListOfPatients(patientUIDetail.getPatientList());
            patientList.writePatientListFile();
            System.out.println(patientList.getListOfPatients());
            System.exit(0);
        
        }else if (obj == patientUIList.btnDelete){
            
            int selectedRow = patientUIList.actualtablePatients.getSelectedRow();
            if (selectedRow >= 0) {
                // Remove the patient from the patientList and the table model
                patientList.getListOfPatients().remove(selectedRow);
                thePatientTableModel.removePatientAt(selectedRow);
            } 

            patientUIList.actualtablePatients.revalidate();
            patientUIList.actualtablePatients.repaint();
        
        
        }
      
      }
    
    public Patient getPatientByIndex(int index) {
    // Directly access the model (patientList) to get the patient at the specified index
    return this.patientList.getListOfPatients().get(index);
}
    
    public PatientList getPatientList() {
        return this.patientList;
    }
  }

