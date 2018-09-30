package com.himanshu.socialfly.POJO;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable {
    private String ticketNumber;
    private ArrayList<String> passengers;
    private ArrayList<String> interests;

    public Customer(String ticketNumber, ArrayList<String> passengers, ArrayList<String> interests) {
        this.ticketNumber = ticketNumber;
        this.passengers = passengers;
        this.interests = interests;
    }

    public ArrayList<String> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<String> passengers) {
        this.passengers = passengers;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}
