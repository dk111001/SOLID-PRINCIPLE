package aeroplanefactory;

import aeroplanefactory.facilities.drinkmenu.DrinkMenu;
import aeroplanefactory.facilities.foodmenu.FoodMenu;
import aeroplanefactory.facilities.seatType.SeatType;

public interface SeatFactory {
    DrinkMenu createDrinkMenu();
    SeatType createSeatType();
    FoodMenu createFoodMenu();
}
