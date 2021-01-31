package com.pluralsight.flight;

public class Flight {
    int passengers;
    int seats;

    public Flight() {
        seats = 150;
        passengers = 0;
    }

    public  void add1Passenger() {
        if (passengers < seats) {
            passengers += 1;
        }
    }

    private void handleTooMany() {

    }
}
