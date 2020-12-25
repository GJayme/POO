package exercises.list02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {

    static boolean test = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberElement = scanner.nextInt();
        int doubleNumberElement = 2*numberElement;

        ArrayList<Integer> arrayA = new ArrayList<>();
        ArrayList<Integer> arrayB = new ArrayList<>();
        ArrayList<Integer> arrayIntercalary = new ArrayList<>();

        inputArrayNumber(scanner, arrayA, numberElement);
        inputArrayNumber(scanner, arrayB, numberElement);

        if (test){
            makeIntercalaryArray(arrayA, arrayB, arrayIntercalary, doubleNumberElement);
            printArray(arrayIntercalary);
        } else {
            System.out.println("Erro");
        }
    }

    public static void printArray (ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }

    public static void makeIntercalaryArray (ArrayList<Integer> arrayA, ArrayList<Integer> arrayB, ArrayList<Integer> arrayIntercalary, int doubleNumberElement){
        int countA = 0;
        int countB = 0;

        int element = 0;

        for (int i = 0; i < doubleNumberElement; i++) {
             if (i == 0 || i % 2 == 0){
                 element = arrayA.get(countA);
                 arrayIntercalary.add(element);
                 countA += 1;
             } else {
                 element = arrayB.get(countB);
                 arrayIntercalary.add(element);
                 countB += 1;
             }
        }
    }

    public static void inputArrayNumber (Scanner scanner, ArrayList<Integer> array, int numberElement) {

        for (int i = 0; i < numberElement; i++) {
            int number = scanner.nextInt();

            array.add(number);
        }

        if(array.size() != numberElement) {
            test = false;
        }
        test = true;
    }
}
