package exercises.list02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> initialInputs = new ArrayList<>();

        initialInputs = makeArray(scanner, initialInputs);

        chekingCandleHeight(initialInputs);
    }

    public static void chekingCandleHeight (ArrayList<Integer> array) {
        int maximumHeigth = 0;

        for (int i = 0; i < array.size(); i++) {
             if (array.get(i) >= maximumHeigth){
                 maximumHeigth = array.get(i);
             }
        }

        int countCandle = 0;

        for (int i = 0; i < array.size(); i++) {
             if (array.get(i) == maximumHeigth) {
                 countCandle += 1;
             }
        }

        System.out.println(countCandle);
    }

    public static ArrayList<Integer> makeArray(Scanner scanner, ArrayList<Integer> array) {
        int age = scanner.nextInt();

        for (int i = 0; i < age; i++) {
             int candleHeight  = scanner.nextInt();
             array.add(candleHeight);
        }
        return array;
    }
}
