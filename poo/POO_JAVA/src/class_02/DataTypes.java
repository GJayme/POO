package class_02;

import java.util.Scanner;

public class DataTypes {

    static int foraDoEscopo;

    enum Sexo {MASCULINO, FEMININO, NAO_DECLARADO}; //serve pra criar categorias

    public static void main (String[] args){
        /*int i; //declarei variável mas não o valor
        int j = 10; // declarei a variavel e o valor
        i = 10; // agora declarei o valor de i
        j = 11; // alterei o valor de j

        double d = i; // um inteiro cabe dentro de um ponto flutuante
        System.out.println("d = " + d);

        d = 1.56;
        int x = (int) d;

        System.out.println("x = " + x);

        System.out.println(foraDoEscopo);

        char c = 'p';

        System.out.println(c);
        float f = 1f;

        System.out.println("f = " + f);

        f = f/3;
        f = f*3;

        System.out.println("f = " + f);

        final int constante = 10;
        //constante = 11; não pode acontecer

        Sexo meuSexo = Sexo.MASCULINO;

        System.out.println("meuSexo = " + meuSexo);

        int valor = 99;
        System.out.println(valor++); //imprime 99
        System.out.println(--valor); //imprime 99

        valor = - valor; //inverte o sinal
        System.out.println("valor = " + valor);

        System.out.println(!!true);

        double soma = 10 + 10.99;
        System.out.println("soma = " + soma);

        float div = 10/ 3f;
        System.out.println("div = " + div);

        int num = 10;
        num +=10; //jao = jao + 10;
        System.out.println("num = " + num);

        Scanner scanner = new Scanner(System.in); //Inputar texto

        String name = scanner.nextLine();
        int idade = scanner.nextInt();
        double peso = scanner.nextDouble();

        if (idade >= 18) {
            System.out.println(name+ " Pode beber corote.");
        } else  {
            System.out.println(name + " só bebe leite!");
        }

        System.out.println(idade >=18 ? name + " Pode beber coroto" : name + "só bebe leite!");*/

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int otherValue = 0;

        switch (value) {
            case 1:
                otherValue =1;
                break;
            case 2:
                otherValue =2;
                break;
            case 3:
                otherValue =3;
                break;
            case 4:
                otherValue =4;
                break;
            default:
                otherValue = -1;
        }

        System.out.println("otherValue = " + otherValue );
    }
}

