package decorator;

import decorator.component.Coffee;
import decorator.concrete_component.SimpleCoffee;
import decorator.concrete_decorator.MilkDecorator;
import decorator.concrete_decorator.SugarDecorator;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();

        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.cost());
    }
}
