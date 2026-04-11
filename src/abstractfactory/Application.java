package abstractfactory;

import abstractfactory.abstractcomponent.Button;
import abstractfactory.abstractcomponent.CheckBox;
import abstractfactory.abstractfactory.GUIFactory;

public class Application {

    private Button button;
    private CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void render() {
        button.paint();
        checkbox.paint();
    }
}