package factory;

import factory.components.button.Button;
import factory.components.button.IosButton;
import factory.components.menu.IosMenu;
import factory.components.menu.Menu;

public class IosFactory implements UiFactory{
    public Menu createMenu(){
        return new IosMenu();
    }

    public Button createButton(){
        return new IosButton();
    }
}
