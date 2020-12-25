package exercises.list03.Ex03;

public class Cachorro extends Animal{

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso, raca);
    }

    @Override
    public double banho() {

        double total = 0;
        double fatorPeso = 0.8;

        total += fatorPeso*peso;

        return total;
    }

    @Override
    public double tosa() {

        double total = 0;
        double fatorPeso = 1;

        total += fatorPeso*peso;

        return total;
    }
}
