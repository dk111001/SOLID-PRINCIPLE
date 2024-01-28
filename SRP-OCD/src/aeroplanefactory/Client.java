package aeroplanefactory;

import aeroplanefactory.facilities.foodmenu.FoodMenu;

public class Client {
    public static void main(String[] args){
        Seat firstSeat = new Seat(SeatClass.BUSINESS);
        SeatFactory seatFactory = firstSeat.crateSeatFactory();
        FoodMenu foodMenu = seatFactory.createFoodMenu();
        foodMenu.print();
    }
}
