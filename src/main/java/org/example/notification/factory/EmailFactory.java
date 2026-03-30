package org.example.notification.factory;

import org.example.notification.entity.EmailNotification;
import org.example.notification.entity.INotification;

public class EmailFactory extends NotificationFactory{
    @Override
    protected INotification createNotification() {
        return new EmailNotification();
    }
}
