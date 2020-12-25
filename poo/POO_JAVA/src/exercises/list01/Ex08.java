package exercises.list01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lemonNumber = scanner.nextInt();
        int lemonValue = scanner.nextInt();
        int temp = 0;
        int totalCoast = 0;

        while (temp < lemonNumber){
            totalCoast += lemonValue;
            if (lemonValue == 1) {
                lemonValue = 1;
            } else {
                lemonValue--;
            }
            temp++;
        }

        System.out.println(totalCoast);
    }
}
