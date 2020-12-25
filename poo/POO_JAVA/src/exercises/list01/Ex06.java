package exercises.list01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double widthWall = scanner.nextDouble();
        double heightWall = scanner.nextDouble();
        double inkPrice = scanner.nextDouble();
        double yieldInk = scanner.nextDouble();

        double sizeWall = widthWall*heightWall;
        double cansInk = Math.ceil(sizeWall/yieldInk);
        double cost = inkPrice*cansInk;

        System.out.printf("%.0f\n",cansInk);
        System.out.printf("%.2f",cost);

    }
}
