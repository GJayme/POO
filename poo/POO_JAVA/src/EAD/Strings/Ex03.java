package EAD.Strings;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

    /*
    Dada uma String arbitrária, faça um programa que imprima “Sim” se essa for palíndromo e “Nao”,
    caso contrário. Palíndromo é uma frase ou palavra que pode ser lida, indiferentemente, da esquerda para
    a direita ou vice-versa. Por exemplo, “arara” é um palíndromo. Considere como entrada apenas palavras
    com letras minúsculas.
     */

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        string.toLowerCase();

        int lengthString = string.length();

        String endToInitial = "";
        String initialToEnd = "";

        for (int i = 0; i < lengthString; i++) {
            initialToEnd += string.substring(i, i+1);
        }

        for (int i = lengthString; i > 0; i--) {
            endToInitial += string.substring(i-1,i);
        }


        if (initialToEnd.equals(endToInitial.toString())) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }
    }
}
