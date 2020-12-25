package exercises.list01;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int ageCount = 0;
        int accumulatedAge = 0;
        int isOlder = 0;
        int isOldMan = 0;

        while (age >= 0) {

            if (age >= 18) {
                isOlder += 1;
            }
            if (age > 75) {
                isOldMan += 1;
            }

            ageCount += 1;
            accumulatedAge += age;

            age = scanner.nextInt();
        }
        double averangeAge = (double)accumulatedAge/ageCount;
        double averangeOldMan = (double)isOldMan/ageCount * 100;
        System.out.printf("%.2f\n", averangeAge);
        System.out.println(isOlder);
        System.out.printf("%.2f", averangeOldMan);
        System.out.println("%");
    }
}
