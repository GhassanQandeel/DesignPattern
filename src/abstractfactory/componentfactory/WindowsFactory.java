package abstractfactory.componentfactory;

import abstractfactory.abstractcomponent.Button;
import abstractfactory.abstractcomponent.CheckBox;
import abstractfactory.abstractfactory.GUIFactory;
import abstractfactory.component.WindowsButton;
import abstractfactory.component.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
