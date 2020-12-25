package exercises.list01;

import java.util.Scanner;

public class Ex02 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Erro");
            return;
        }

        if ((sideA+sideB > sideC) && (sideB+sideC > sideA) && (sideA+sideC > sideB)){
            if ((sideA == sideB && sideB == sideC)){
                System.out.println("Equilatero");
            } else if ((sideA == sideB) || (sideA == sideC) || (sideB == sideC)) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("Nao forma triangulo");
        }
    }
}
