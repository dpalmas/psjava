package com.pluralsight.flight;

public class Flight {
    int passengers;
    int seats;

    Flight() {
        seats = 150;
        passengers = 0;
    }

    private void add1Passenger() {
        if (passengers < seats) {
            passengers += 1;
        }
    }
}
