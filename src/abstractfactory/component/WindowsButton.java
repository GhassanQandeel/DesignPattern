package abstractfactory.component;

import abstractfactory.abstractcomponent.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}
