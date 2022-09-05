package factory;

public class InAppMessageNotifications implements INotifications{
    @Override
    public void notifyUser() {
        System.out.println("Sending In App Message Notifications to the User");

    }
}
