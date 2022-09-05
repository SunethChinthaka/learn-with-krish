package factory;

public class EmailNotifications implements INotifications{
    @Override
    public void notifyUser() {
        System.out.println("Sending Email Notifications to the User");
    }
}
