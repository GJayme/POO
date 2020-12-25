package exercises.list03.Ex03;

abstract class Animal {

    String nome;
    double peso;
    String raca;

    public Animal(String nome, double peso, String raca) {
        this.nome = nome;
        this.peso = peso;
        this.raca = raca;
    }

    public abstract double banho ();

    public abstract double tosa ();

}
