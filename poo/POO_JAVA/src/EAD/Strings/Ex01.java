package EAD.Strings;

import java.util.Scanner;

public class Ex01 {
    /*
    Implemente um programa que gere senhas provisórias a partir do nome do usuário,
    seguindo o mesmo padrão dos exemplos a seguir:

        EXEMPLO 1 Entrada: Java | Saída: J*Ja*Jav*Jav*Ja* J
        EXEMPLO 2 Entrada: POOS3 | Saída: P*PO*POO*POOS*POOS*POO*PO*P
        EXEMPLO 3 Entrada: KO | Saída: K*K
        EXEMPLO 4 Entrada: O | Saída: Invalido
        EXEMPLO 5 Entrada: | Saída: InvalidoImplemente um programa que gere senhas provisórias
            a partir do nome do usuário, seguindo o mesmo padrão dos exemplos a seguir:
        EXEMPLO 1 Entrada: Java | Saída: J*Ja*Jav*Jav*Ja* J
        EXEMPLO 2 Entrada: POOS3 | Saída: P*PO*POO*POOS*POOS*POO*PO*P
        EXEMPLO 3 Entrada: KO | Saída: K*K
        EXEMPLO 4 Entrada: O | Saída: Invalido
        EXEMPLO 5 Entrada: | Saída: Invalido
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        StringBuilder finalPW = new StringBuilder();

        if(checkingLengthName(userName)) {
            makeStartMiddlePassword(userName, finalPW);
            makeMiddleEndPassword(userName, finalPW);
            System.out.println(finalPW);
        } else {
            System.out.println("Invalido");
        }

    }
    public static void makeMiddleEndPassword(String name, StringBuilder finalName)  {
        for (int i = name.length() -1; i > 0; i--) {
            String tempString = "";
            if ( i != 1) {
                tempString += name.substring(0, i);
                finalName.append(tempString).append("*");
            } else {
                tempString += name.substring(0, 1);
                finalName.append(tempString);
            }
        }
    }

    public static void makeStartMiddlePassword(String name, StringBuilder finalName) {
        for (int i = 0; i < name.length(); i++) {
            String tempString = "";
            if ( i != 0) {
                tempString += name.substring(0, i);
                finalName.append(tempString).append("*");
            }
        }
    }

    public static boolean checkingLengthName(String name){
        if (name.length() > 1) {
            return true;
        }
        return false;
    }
}
