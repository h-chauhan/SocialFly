package com.himanshu.socialfly.POJO;

import java.util.ArrayList;

public class RequestBody {
    private ArrayList<String> interests;
    private int number_of_seats;

    public RequestBody(ArrayList<String> interests, int number_of_seats) {
        this.interests = interests;
        this.number_of_seats = number_of_seats;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    public void setInterests(ArrayList<String> interests) {
        this.interests = interests;
    }

    public int getNumber_of_seats() {
        return number_of_seats;
    }

    public void setNumber_of_seats(int number_of_seats) {
        this.number_of_seats = number_of_seats;
    }
}
