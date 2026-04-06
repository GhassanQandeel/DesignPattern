package factorymethod.notification;

public class SMSNotification implements Notification {
    @Override
    public void notify(String message){
        System.out.println("SMS Notification : " + message);
    }
}
