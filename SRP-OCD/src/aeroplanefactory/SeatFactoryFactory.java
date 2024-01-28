package aeroplanefactory;

public class SeatFactoryFactory {
    public static SeatFactory createSeatFactory(SeatClass seatClass){
        return switch (seatClass){
            case ECONOMY -> new EconomySeatFactory();
            case BUSINESS -> new BusinessSeatFactory();
            default -> null;
        };
    }
}
