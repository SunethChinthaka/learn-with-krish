package factory;

public class PushNotifications implements INotifications{
    @Override
    public void notifyUser() {
        System.out.println("Sending Push Notifications to the User");

    }
}
