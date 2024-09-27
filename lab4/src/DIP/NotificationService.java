package DIP;

public class NotificationService {
    private IMessageSender messageSender;

    public NotificationService(IMessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.sendMessage(message);
    }
}
