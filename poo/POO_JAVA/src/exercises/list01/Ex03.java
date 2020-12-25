package exercises.list01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if ((year % 4 == 0) && (year % 100 !=0)) {
            System.out.println("Ano bissexto");
        } else if (year % 400 == 0) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Ano nao bissexto");
        }
    }
}
