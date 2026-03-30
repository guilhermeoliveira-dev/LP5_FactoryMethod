package org.example.notification.factory;

import org.example.notification.entity.INotification;
import org.example.notification.entity.SMSNotification;

public class SMSFactory extends NotificationFactory{
    @Override
    protected INotification createNotification() {
        return new SMSNotification();
    }
}
