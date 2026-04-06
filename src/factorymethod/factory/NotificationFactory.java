package factorymethod.factory;

import factorymethod.notification.Notification;

abstract public class NotificationFactory {
    public abstract Notification createNotification();
}
