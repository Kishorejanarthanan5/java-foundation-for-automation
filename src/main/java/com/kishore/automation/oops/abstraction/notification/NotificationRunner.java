package com.kishore.automation.oops.abstraction.notification;

public class NotificationRunner {
    public static void main(String[] args) {

        NotificationService notification;

        notification = new EmailNotification();
        notification.send("jk@gmail.com", "Welcome! JK");

        notification = new SmsNotification();
        notification.send("9876543210", "Your OTP is 123456");
    }
}

//Notification implementation
    class EmailNotification implements NotificationService {
    @Override
    public void send(String recipient, String message) {
        System.out.println(
                "Sending EMAIL to " + recipient + " with message: " + message);
        }
    }
    class SmsNotification implements NotificationService {
    @Override
        public void send(String recipient, String message) {
        System.out.println(
                "Sending SMS to " + recipient + " with message: " + message);
        }
    }
