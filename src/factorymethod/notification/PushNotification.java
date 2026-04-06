package factorymethod.notification;

public class PushNotification implements Notification {
    @Override
    public void notify(String message){
        System.out.println("Push Notification : "+message);
    }
}
