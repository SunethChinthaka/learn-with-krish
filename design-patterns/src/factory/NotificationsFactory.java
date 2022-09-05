package factory;

public class NotificationsFactory {
    public INotifications sendNotifications(String notificationType){
        if(notificationType==null){
            return null;
        }
        if(notificationType.equalsIgnoreCase("sms")){
            return new SMSNotifications();
        }else if(notificationType.equalsIgnoreCase("email")){
            return new EmailNotifications();
        }else if(notificationType.equalsIgnoreCase("push")){
            return new PushNotifications();
        }else if(notificationType.equalsIgnoreCase("in app")){
            return new InAppMessageNotifications();
        }else {
            System.out.println("Unknown notification type");
        }

        return null;
    }
}
