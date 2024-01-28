package factory;

import factory.components.button.AndroidButton;
import factory.components.button.Button;
import factory.components.menu.AndroidMenu;
import factory.components.menu.IosMenu;
import factory.components.menu.Menu;

public class AndroidFactory implements UiFactory{
    public Menu createMenu(){
        return new AndroidMenu();
    }

    public Button createButton(){
        return new AndroidButton();
    }
}
