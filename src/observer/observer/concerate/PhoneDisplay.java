package observer.observer.concerate;

import observer.observer.Observer;

public class PhoneDisplay implements Observer{
    @Override
    public void update(float temperature) {
        System.out.println("temperature from Phone : " + temperature);

    }
}
