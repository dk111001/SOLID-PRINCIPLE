package parkinglot.models;

import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private LocalDateTime entryTime;
    private Vehicle vehicle;
    private Gate gate;
    private String operatorName;
    private ParkingSpot parkingSpot;
}
