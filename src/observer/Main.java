package observer;

import observer.observer.Observer;
import observer.observer.concerate.PhoneDisplay;
import observer.observer.concerate.TVDisplay;
import observer.subject.WeatherStation;

public class Main {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer tv = new TVDisplay();

        station.addObserver(phone);
        station.addObserver(tv);

        station.setTemperature(25);
        station.setTemperature(30);

        station.removeObserver(tv);
        station.setTemperature(40);
    }
}