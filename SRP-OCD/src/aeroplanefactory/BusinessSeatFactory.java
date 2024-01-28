package aeroplanefactory;

import aeroplanefactory.facilities.drinkmenu.BusinessDrinkMenu;
import aeroplanefactory.facilities.drinkmenu.DrinkMenu;
import aeroplanefactory.facilities.foodmenu.BusinessFoodMenu;
import aeroplanefactory.facilities.foodmenu.FoodMenu;
import aeroplanefactory.facilities.seatType.BusinessSeatType;
import aeroplanefactory.facilities.seatType.SeatType;

public class BusinessSeatFactory implements SeatFactory{
    public FoodMenu createFoodMenu(){
        return new BusinessFoodMenu();
    }

    public DrinkMenu createDrinkMenu(){
        return new BusinessDrinkMenu();
    }

    public SeatType createSeatType(){
        return new BusinessSeatType();
    }
}
