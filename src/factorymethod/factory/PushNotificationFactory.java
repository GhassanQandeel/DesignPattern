package factorymethod.factory;

import factorymethod.notification.Notification;
import factorymethod.notification.PushNotification;

public class PushNotificationFactory extends NotificationFactory {
    public Notification createNotification() {
        return new PushNotification();
    }
}
