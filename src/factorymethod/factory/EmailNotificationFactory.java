package factorymethod.factory;

import factorymethod.notification.EmailNotification;
import factorymethod.notification.Notification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
