package abstractfactory;

import abstractfactory.abstractfactory.GUIFactory;
import abstractfactory.componentfactory.MacFactory;
import abstractfactory.componentfactory.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        String os = "Mac"; // can come from config

        if (os.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.render();
    }
}
