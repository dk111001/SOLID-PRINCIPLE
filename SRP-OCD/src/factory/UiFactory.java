package factory;

import factory.components.button.Button;
import factory.components.menu.Menu;

public interface UiFactory {
    Menu createMenu();
    Button createButton();
}
