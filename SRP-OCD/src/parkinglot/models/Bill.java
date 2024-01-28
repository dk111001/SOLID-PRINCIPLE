package parkinglot.models;

import java.time.LocalDateTime;
import java.util.List;

public class Bill {
    private int id;
    private boolean billStatus;
    private Ticket ticket;
    private LocalDateTime exitTime;
    private Gate exitGate;
    private String operatorName;
    private double amount;
    private List<Payment> payments;

}
