package exercises.list03.Ex03;

public class Gato extends Animal{

    public Gato(String nome, double peso, String raca) {
        super(nome, peso, raca);
    }

    @Override
    public double banho() {

        double total = 0;
        double fatorPeso = 5;

        total += fatorPeso*peso;

        return total;
    }

    public double tosa() {
        return 0;
    }
}
