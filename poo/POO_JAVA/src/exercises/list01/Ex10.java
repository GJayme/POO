package exercises.list01;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingPosition1 = scanner.nextInt();
        int velocity1 = scanner.nextInt();
        int startingPosition2 = scanner.nextInt();
        int velocity2 = scanner.nextInt();

        if (startingPosition1 > startingPosition2 && velocity1 > velocity2 || startingPosition2 > startingPosition1 && velocity2 > velocity1 || startingPosition1 > startingPosition2 && velocity1 == velocity2 || startingPosition2 > startingPosition1 && velocity2 == velocity1 || (startingPosition1 - startingPosition2) % (velocity1 - velocity2) != 0) {
            System.out.println("NAO");
        } else {
            System.out.println("SIM");
        }

    }
}
