package org.example;

import org.example.notification.factory.EmailFactory;
import org.example.notification.factory.NotificationFactory;
import org.example.notification.factory.SMSFactory;

public class Main {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("From: user@example.com\n");
        builder.append("To: otheruser@example.com\n");
        builder.append("Subject: Good news\n");
        builder.append("\nHello sir, good morning! Have you read the news? Great things have been discovered at Georgia.\n");

        String message = builder.toString();

        NotificationFactory factory = new EmailFactory();
        factory.processSending(message);

        factory = new SMSFactory();
        factory.processSending("Your recovery code is 1234");

    }
}