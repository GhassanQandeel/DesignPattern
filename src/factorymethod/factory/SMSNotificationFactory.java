package factorymethod.factory;

import factorymethod.notification.Notification;
import factorymethod.notification.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
