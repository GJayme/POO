package class_05.exercise02;

public class Principal {

    public static void main(String[] args) {

        Figura[] figuras = new Figura[150];
        int countFigures = 0;

        for (double i = 1; i <= 50; i++) {
            Circulo circulo = new Circulo(0, 0, i);
            figuras[countFigures] = circulo;
            countFigures++;

            Retangulo retangulo = new Retangulo(0,0, i, i);
            figuras[countFigures] = retangulo;
            countFigures++;

            Triangulo triangulo = new Triangulo(0, 0, i, i, i);
            figuras[countFigures] = triangulo;
            countFigures++;

        }

        double areaTotal = 0;
        for (Figura figura : figuras) {
            areaTotal += figura.getArea();
        }


        System.out.println("areaTotal = " + areaTotal);
    }

}
