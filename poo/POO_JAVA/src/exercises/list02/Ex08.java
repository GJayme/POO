package exercises.list02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex08 {

    static boolean outWeight = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int giftNumbers = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();

        makeArray(giftNumbers, array, scanner);

        checkingWeight(array);
    }

    public static void checkingWeight(ArrayList<Integer> array){
        int weight;
        int rightWeight = 0;
        int leftWeight = 0;

        for (int i = 0; i < array.size(); i++) {

            weight = array.get(i);

            if (i == 0 && weight > 5) {
                outWeight = true;
                break;
            }

            if (rightWeight == 0 || (((leftWeight - (rightWeight + weight)) <= 5) && ((leftWeight - (rightWeight + weight)) >= -5))) {
                rightWeight += weight;
            } else if (((rightWeight - (leftWeight + weight)) <= 5) && ((rightWeight - (leftWeight + weight)) >= -5)) {
                leftWeight += weight;
            } else {
                outWeight = true;
                break;
            }
        }

        if (!outWeight) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }

    public static void makeArray(int giftNumbers, ArrayList<Integer> array, Scanner scanner){
        for (int i = 0; i < giftNumbers; i++) {
             int giftWeight = scanner.nextInt();
             array.add(giftWeight);
        }
    }
}
