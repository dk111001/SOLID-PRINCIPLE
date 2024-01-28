package aeroplanefactory;

import aeroplanefactory.facilities.drinkmenu.DrinkMenu;
import aeroplanefactory.facilities.drinkmenu.EconomyDrinkMenu;
import aeroplanefactory.facilities.foodmenu.EconomyFoodMenu;
import aeroplanefactory.facilities.foodmenu.FoodMenu;
import aeroplanefactory.facilities.seatType.EconomySeatType;
import aeroplanefactory.facilities.seatType.SeatType;

public class EconomySeatFactory implements SeatFactory{
    public FoodMenu createFoodMenu(){
        return new EconomyFoodMenu();
    }

    public DrinkMenu createDrinkMenu(){
        return new EconomyDrinkMenu();
    }

    public SeatType createSeatType(){
        return new EconomySeatType();
    }
}
