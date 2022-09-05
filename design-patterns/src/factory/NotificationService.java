package factory;

import java.util.Scanner;

public class NotificationService {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter NotificationService Type: ");

        NotificationsFactory notificationFactory = new NotificationsFactory();
        INotifications iNotifications=notificationFactory.sendNotifications(inputScanner.nextLine());
        iNotifications.notifyUser();

    }
}
