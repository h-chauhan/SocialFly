package com.himanshu.socialfly.POJO;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Seat implements Serializable {
    private String number;
    @SerializedName("is_booked")
    private boolean isBooked;

    public Seat(String number, boolean isBooked) {
        this.number = number;
        this.isBooked = isBooked;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
