package factorymethod;

import factorymethod.factory.EmailNotificationFactory;
import factorymethod.factory.NotificationFactory;
import factorymethod.factory.PushNotificationFactory;
import factorymethod.factory.SMSNotificationFactory;
import factorymethod.notification.Notification;

//here we're doing open/close principle

public class Main {
    public static void main(String[] args) {
        // that change on demand (config/api)
        sendNotification(new SMSNotificationFactory());
        sendNotification(new EmailNotificationFactory());
        // if we want to add another notification just create another class and factory
        sendNotification(new PushNotificationFactory());
    }
    public static  void sendNotification(NotificationFactory notificationFactory) {
        Notification notification = notificationFactory.createNotification();
        notification.notify("Hello World");

    }
}
