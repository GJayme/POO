package exercises.list01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distance1 = scanner.nextDouble();
        double cost1 = scanner.nextDouble();
        double cost2 = scanner.nextDouble();
        double travel = scanner.nextDouble();

        if (travel <= distance1) {
            double totalCost = travel*cost1;
            System.out.printf("%.2f", totalCost);
        } else {
            double totalCost = travel*cost2;
            System.out.printf("%.2f", totalCost);
        }
    }
}
