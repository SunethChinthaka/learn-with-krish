package factory;

public class SMSNotifications implements INotifications{
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS Notifications to the User");
    }
}
