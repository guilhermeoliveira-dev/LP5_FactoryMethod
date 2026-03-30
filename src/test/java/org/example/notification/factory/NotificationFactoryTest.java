package org.example.notification.factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NotificationFactoryTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void testEmailFactoryFlow() {
        NotificationFactory factory = new EmailFactory();
        String message = "Test Email Content";

        factory.processSending(message);

        assertTrue(outputStreamCaptor.toString().contains("Sending email:"));
        assertTrue(outputStreamCaptor.toString().contains(message));
    }

    @Test
    void testSMSFactoryFlow() {
        NotificationFactory factory = new SMSFactory();
        String message = "Test SMS Content";

        factory.processSending(message);

        assertTrue(outputStreamCaptor.toString().contains("Sending SMS:"));
        assertTrue(outputStreamCaptor.toString().contains(message));
    }
}