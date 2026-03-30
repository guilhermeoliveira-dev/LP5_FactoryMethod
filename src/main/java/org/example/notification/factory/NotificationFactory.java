package org.example.notification.factory;

import org.example.notification.entity.INotification;

public abstract class NotificationFactory {

    protected abstract INotification createNotification();

    public void processSending(String message){
        INotification n = createNotification();
        n.send(message);
    }

}
