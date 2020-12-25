package exercises.list02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {

    static boolean test = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> initialInputs = new ArrayList<>();

        int firstA = 0;
        int firstB = 0;
        int finalA = 0;
        int finalB = 0;

        test = startingInput(scanner, initialInputs);

        if (!test){
            System.out.println("Erro");
            return;
        }

        firstA = initialInputs.get(0);
        firstB = initialInputs.get(1);
        finalA = initialInputs.get(2);
        finalB = initialInputs.get(3);

        minimumSwitch(firstA, firstB, finalA, finalB);
    }
    public static void minimumSwitch (int ia, int ib, int fa, int fb){
        int count = 0;
        if (ia == 0 && ib == 0 && fa == 0 & fb ==0){
            count = 0;
        } else if (ia == 0 & ib == 0 && fa == 0 & fb ==1){
            count = 2;
        } else if (ia == 0 & ib == 0 && fa == 1 & fb ==0){
            count = 1;
        } else if (ia == 0 & ib == 0 && fa == 1 & fb ==1){
            count  = 1;
        } else if (ia == 1 & ib == 0 && fa == 0 & fb ==0){
            count = 1;
        } else if (ia == 1 & ib == 0 && fa == 1 & fb ==0){
            count = 0;
        } else if (ia == 1 & ib == 0 && fa == 0 & fb ==1){
            count = 1;
        } else if (ia == 1 & ib == 0 && fa == 1 & fb ==1){
            count = 2;
        }  else if (ia == 0 & ib == 1 && fa == 0 & fb ==0){
            count = 2;
        } else if (ia == 0 & ib == 1 && fa == 1 & fb ==0){
            count = 1;
        } else if (ia == 0 & ib == 1 && fa == 0 & fb ==1){
            count = 0;
        } else if (ia == 0 & ib == 1 && fa == 1 & fb ==1){
            count = 1;
        } else if (ia == 1 & ib == 1 && fa == 0 & fb ==0){
            count = 1;
        } else if (ia == 1 & ib == 1 && fa == 1 & fb ==0) {
            count = 2;
        } else if (ia == 1 & ib == 1 && fa == 0 & fb ==1) {
            count = 1;
        } else if (ia == 1 & ib == 1 && fa == 1 & fb ==1){
            count = 0;
        }
        System.out.println(count);
    }

    public static boolean startingInput(Scanner scanner, ArrayList<Integer> array) {
        String lineInput = scanner.nextLine();
        String[] switchs = lineInput.split(" ");

        for (int i = 0; i < switchs.length; i++) {
            int interrupter = Integer.parseInt(switchs[i]);

            if (interrupter == 0 || interrupter == 1){
                array.add(interrupter);
            } else {
                return false;
            }
        }
        if(array.size()  != 4){
            return false;
        }
        return true;
    }
}
