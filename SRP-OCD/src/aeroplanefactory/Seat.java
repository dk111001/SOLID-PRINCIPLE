package aeroplanefactory;

public class Seat {
    private int seatNo;
    private SeatClass seatClass;

    Seat(SeatClass seatClass){
        this.seatClass = seatClass;
    }

    public SeatFactory crateSeatFactory(){
        return SeatFactoryFactory.createSeatFactory(seatClass);
    }


}
