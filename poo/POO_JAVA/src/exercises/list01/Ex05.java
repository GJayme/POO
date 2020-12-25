package exercises.list01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int speedLimit = scanner.nextInt();
        double trafficTicket = scanner.nextDouble();
        double overSpeedLimit = scanner.nextDouble();
        int velocity = scanner.nextInt();

        if (velocity > speedLimit) {
            double total = ((velocity - speedLimit) * overSpeedLimit) + trafficTicket;
            System.out.printf("%.2f", total);

        } else {
            System.out.println("0.00");
        }
    }
}
