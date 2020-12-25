package exercises.list02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> boxDimension = new ArrayList<>();
        ArrayList<Integer> windowDimension = new ArrayList<>();

        makeArray(3, boxDimension, scanner);
        makeArray(2, windowDimension, scanner);

        checkingDimensions(windowDimension, boxDimension);
    }

    public static void checkingDimensions (ArrayList<Integer> windowDimension, ArrayList<Integer> boxDimension) {
        int count = 0;
        ArrayList<Integer> indexTempBox = new ArrayList<>();

        for (int i = 0; i < windowDimension.size(); i++) {
            int window = windowDimension.get(i);

            for (int j = 0; j < boxDimension.size(); j++) {
                int box = boxDimension.get(j);

                if (box <= window && !indexTempBox.contains(j) ) {
                    count += 1;
                    indexTempBox.add(j);
                }
            }
        }

        if (count >= 2) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }

    public static void makeArray(int amountInput, ArrayList<Integer> array, Scanner scanner){
        for (int i = 0; i < amountInput; i++) {
            int input = scanner.nextInt();
            array.add(input);
        }
    }
}
