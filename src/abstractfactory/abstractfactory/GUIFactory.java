package abstractfactory.abstractfactory;

import abstractfactory.abstractcomponent.Button;
import abstractfactory.abstractcomponent.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
