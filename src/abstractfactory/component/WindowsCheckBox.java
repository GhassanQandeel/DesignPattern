package abstractfactory.component;

import abstractfactory.abstractcomponent.CheckBox;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Windows CheckBox");
    }
}
