package parkinglot.models;

import java.util.List;
import java.util.Map;

public class ParkingLot {
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private int id;
    private String name;
    private String address;
    private Map<VehicleType,Integer> baseRate;

}
