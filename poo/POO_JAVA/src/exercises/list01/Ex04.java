package exercises.list01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        int price = scanner.nextInt();
        int discount = scanner.nextInt();

        int choco = (money / price);
        int freeChoco = (choco / discount);

        System.out.println(choco + freeChoco);
    }
}
