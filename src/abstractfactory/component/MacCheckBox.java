package abstractfactory.component;

import abstractfactory.abstractcomponent.CheckBox;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("MacOS CheckBox");
    }
}
