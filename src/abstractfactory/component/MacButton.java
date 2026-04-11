package abstractfactory.component;

import abstractfactory.abstractcomponent.Button;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("MacOS Button");
    }
}
