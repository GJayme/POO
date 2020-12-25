package exercises.list01;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numBooks = scanner.nextInt();

        if (numBooks <= 0) {
            System.out.println("Erro");
            return;
        }

        double criterionA = 0.25 * numBooks + 7.5;
        double criterionB = 0.50 * numBooks + 2.5;

        if (criterionA < criterionB) {
            System.out.println("Criterio A");
        }
        else if (criterionB < criterionA) {
            System.out.println("Criterio B");
        } else {
            System.out.println("Indiferente");
        }
    }
}
