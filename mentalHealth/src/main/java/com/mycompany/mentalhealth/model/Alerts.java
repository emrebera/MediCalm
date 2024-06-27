/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mentalhealth.model;


public class Alerts {
    private boolean trigger;
    private int severity;

    public Alerts(boolean trigger, int severity) {
        this.trigger = trigger;
        this.severity = severity;
    }


    public Alerts() {
        this.trigger = false;
        this.severity = 0;
    }
    public boolean isTrigger() {
        return trigger;
    }

    public void setTrigger(boolean trigger) {
        this.trigger = trigger;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Alerts{" +
                "trigger=" + trigger +
                ", severity=" + severity +
                '}';
    }


}

