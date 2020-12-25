package EAD.Strings;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        /*
        Dada duas Strings A e B, faça um programa que imprima “Sim” se A e B
        são anagramas e “Nao”, caso contrário. Um anagrama é a transposição de
        letras de palavra ou frase para formar outra palavra ou frase diferente.
        Por exemplo, as palavras “roma” e “amor” são anagramas. Considere como entrada
        apenas palavras com letras minúsculas.
         */

        Scanner scanner = new Scanner(System.in);

        String stringA = scanner.nextLine();
        String stringB = scanner.nextLine();

        String[] lettersA;
        String[] lettersB;

        lettersA = containsLetters(stringA);
        lettersB = containsLetters(stringB);

        int[] numberOfLettersA = numberOfLetters(lettersA, stringA);
        int[] numberOfLettersB = numberOfLetters(lettersA, stringA);

        int indexA;
        int indexB;

        boolean testAnagram = true;

        for (int i = 0; i < lettersA.length; i++) {
            for (int j = 0; j < lettersB.length; j++) {
                if (lettersA[i] == lettersB[j]){
                    indexA = i;
                    indexB = j;

                    if(numberOfLettersA[indexA] != numberOfLettersB[indexB]){
                        testAnagram = false;
                    }
                }
            }
        }

        if (testAnagram) {
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

    }

    public static int[] numberOfLetters(String[] letters, String word){

        int[] countLettersA = new int[26];

        int countA = 0;

        for (int i = 0; i < letters.length; i++) {
            if(letters[i] != null) {
                int count = 0;
                for (int j = 0; j < word.length(); j++) {
                    String stringAux = String.valueOf(word.charAt(j));
                    if(letters[i].equals(stringAux)){
                        count++;
                    }
                }
                countLettersA[countA] = count;
                countA++;
            }
        }

        return countLettersA;
    }


    public static String[] containsLetters(String word){

        String[] letters = new String[26];

        int countLetters = 0;
        boolean verifyLetters = false;

        for (int i = 0; i < word.length(); i++) {

            if (i == 0) {
                String stringAux = String.valueOf(word.charAt(i));
                letters[countLetters] = stringAux;
                countLetters++;
            } else {
                String stringAux = String.valueOf(word.charAt(i));

                for (int j = 0; j < letters.length; j++) {
                    if(letters[j] != null && letters[j].equals(stringAux)){
                        verifyLetters = true;
                    }
                }

                if(!verifyLetters){
                    letters[countLetters] = stringAux;
                    countLetters++;
                }
            }
        }
        return letters;
    }
}
