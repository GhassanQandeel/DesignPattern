package decorator.concrete_component;

import decorator.component.Coffee;

public class  SimpleCoffee implements Coffee {

    public String getDescription() {
        return "Simple Coffee";
    }

    public double cost() {
        return 5.0;
    }
}
