package exercises.list02;

import java.util.Scanner;

public class Ex02 {
    static boolean test = true;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arrayA = makeArray(scanner);
        int[] arrayB = makeArray(scanner);
        int[] result = new int [5];

        if(test) {
            sumArrayElement(arrayA, arrayB, result);
            printArray(result);
        } else {
            System.out.println("Erro");
        }
    }

    public static int[] makeArray (Scanner scanner) {
        int [] array = new int[5];

        if (!scanner.hasNext()){
            test = false;
            return new int[5];
        }

        String[] numbersLine = scanner.nextLine().split(" ");

        for (int i = 0; i < numbersLine.length; i++) {

            int number = Integer.parseInt(numbersLine[i]);

            if (number < 2147483647 && number > -2147483647 ) {
                array[i] = number;
            } else {
                test = false;
            }
        }
        return array;
    }

    public static void sumArrayElement(int[] arrayA, int[] arrayB, int[] result) {

        for (int i = 0; i < arrayA.length; i++) {
            result[i] = arrayA[i] + arrayB[i];
        }
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            if (i != array.length -1) {
                System.out.print(", ");
            }
        }
    }
}
