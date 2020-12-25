package class_05.exercise03;

public class Coruja extends Animal{

    public void voar() {
        System.out.println("A coruja está voando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Pruuu Pruuuu");
    }
}
