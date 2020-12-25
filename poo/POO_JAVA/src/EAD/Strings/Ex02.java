package EAD.Strings;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

    /*
    Faça um programa que, dada uma String, encontra a primeira e a última substrings de tamanho K
    de acordo com a ordem alfabética. Por exemplo, para a String “welcometojava” e K = 3;
    A substring “ava” é a primeira substring de tamanho 3 e “wel” é a última, considerando a
    ordem alfabética (saída: "ava wel"). Para dados de entrada inválidos, o programa deverá
    imprimir uma string vazia.
     */

        Scanner scanner = new Scanner(System.in);

        String initialString = scanner.nextLine();

        String firstSubstring = "";
        String lastSubstring= "";

        int lengthSubstring = scanner.nextInt();

        if(lengthSubstring > initialString.length() ) {
            System.out.println();
            return;
        }

        firstSubstring = firstSubstringInAlphabeticalOrder(initialString, firstSubstring, lengthSubstring);
        lastSubstring = lastSSubstringInAlphabeticalOrder(initialString, lastSubstring, lengthSubstring);
        System.out.println(firstSubstring + " " + lastSubstring);

    }

    public static String lastSSubstringInAlphabeticalOrder(String inputString, String lastSubString, int lengthSubString) {
        for (int j = 0; j < inputString.length(); j++) {

            String tempString;

            if(j == 0){
                tempString = inputString.substring(j, lengthSubString);
                lastSubString = tempString;
            } else if (lengthSubString <= inputString.length() ) {
                tempString = inputString.substring(j, lengthSubString);

                if (tempString.compareTo(lastSubString) > 0) {
                    lastSubString = tempString;
                }
            }
            lengthSubString++;
        }
        return lastSubString;
    }

    public static String firstSubstringInAlphabeticalOrder(String inputString, String firstSubString, int lengthSubString) {
        for (int i = 0; i < inputString.length(); i++) {

            String tempString;

            if(i == 0){
                tempString = inputString.substring(i, lengthSubString);
                firstSubString = tempString;
            } else if (lengthSubString <= inputString.length() ) {
                tempString = inputString.substring(i, lengthSubString);

                if (tempString.compareTo(firstSubString) < 0) {
                    firstSubString = tempString;
                }
            }
            lengthSubString++;
        }

        return firstSubString;
    }
}
