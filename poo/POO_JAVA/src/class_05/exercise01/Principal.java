package class_05.exercise01;

public class Principal {

    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(0,0,3.0, 4.0, 5.0);
        Circulo c1 = new Circulo(0, 0, 3.0);
        Retangulo r1 = new Retangulo(0,0, 10.0, 20.0);

        System.out.println(t1);
        System.out.println("Circulo: " + c1.getArea());
        System.out.println("Retangulo: " + r1.getArea());

    }
}
