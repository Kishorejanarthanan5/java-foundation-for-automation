package com.kishore.automation.oops.abstraction.notification;
// Abstraction for sending notifications. Defines WHAT to send, not HOW it is sent.

public interface NotificationService {

    void send(String recipient, String message);
}