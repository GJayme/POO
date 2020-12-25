package exercises.list02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {

    static boolean test = true;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numArray = new ArrayList<>();

        test = inputFirstArrayNumber(scanner, numArray);

        if (!test) {
            System.out.println("Erro");
            return;
        }

        printArray(numArray);
        while (scanner.hasNext() && numArray.size() > 0 && numArray.size() <= 10){
            int number = scanner.nextInt();

            int index = numArray.indexOf(number);

            if (index >= 0) {
                numArray.remove(index);
            } else {
                numArray.add(number);
            }
            printArray(numArray);
        }
    }

    public static void printArray (ArrayList<Integer> array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        if(array.size() > 0) {
            System.out.println();
        }
    }

    public static boolean inputFirstArrayNumber (Scanner scanner, ArrayList<Integer> array) {

        if (!scanner.hasNext()){
            return false;
        }

        String line = scanner.nextLine();
        String[] numbersLine = line.split(" ");

        for (int i = 0; i < numbersLine.length; i++) {
            int number = Integer.parseInt(numbersLine[i]);

            if(array.contains(number)){
                return false;
            }
            array.add(number);
        }

        if(array.size() != 5) {
            return false;
        }

        return true;
    }

}
