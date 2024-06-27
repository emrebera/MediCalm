/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.model;

import java.util.ArrayList;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author emreb
 */
public class PatientTableModel extends AbstractTableModel{
    
    
    
 

    private String[] columnNames = {"Patient ID", "First Name", "Last Name", "Phone Number", "Gender", "Assigned Professional", "Date of Birth", "Address", "Health Condition",};
    private ArrayList<Patient> patientList;
    
    public PatientTableModel(ArrayList<Patient> newPatientList){

        patientList = newPatientList;
    }

    public String[] getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public int getRowCount() {
    return patientList.size();
}

public Object getValueAt(int row, int col) {
    switch(col){
        case 0: return (Object) patientList.get(row).getPatientId();
        case 1: return (Object) patientList.get(row).getFirstName();
        case 2: return (Object) patientList.get(row).getLastName();
        case 3: return (Object) patientList.get(row).getPhoneNumber();
        case 4: return (Object) patientList.get(row).getGender();
        case 5: return (Object) patientList.get(row).getAssignedProfessional();
        case 6: return (Object) patientList.get(row).getDateOfBirth();
        case 7: return (Object) patientList.get(row).getAddress();
        case 8: return (Object) patientList.get(row).getHealthCondition();
        
        default: return null;
    }
}

    @Override
    public int getColumnCount() {
       return columnNames.length;
    }
    
     @Override
    public String getColumnName(int col){
        return columnNames[col];
    }
    
    public Patient getPatientAt(int rowIndex) {
    return patientList.get(rowIndex);
}
    
    public void addPatient(Patient patient) {
        patientList.add(patient);
        fireTableRowsInserted(patientList.size() - 1, patientList.size() - 1);
    }
    
    public void removePatientAt(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < patientList.size()) {
            patientList.remove(rowIndex);
            fireTableRowsDeleted(rowIndex, rowIndex);
        }
    }
}
    

