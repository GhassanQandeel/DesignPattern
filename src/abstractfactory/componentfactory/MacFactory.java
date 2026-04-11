package abstractfactory.componentfactory;

import abstractfactory.abstractcomponent.Button;
import abstractfactory.abstractcomponent.CheckBox;
import abstractfactory.abstractfactory.GUIFactory;
import abstractfactory.component.MacButton;
import abstractfactory.component.MacCheckBox;

public class MacFactory implements GUIFactory {
    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
