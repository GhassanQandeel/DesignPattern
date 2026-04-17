package observer.observer.concerate;

import observer.observer.Observer;

public class TVDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("temperature from TV : " + temperature);
    }
}
