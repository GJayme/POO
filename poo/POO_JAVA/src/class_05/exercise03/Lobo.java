package class_05.exercise03;

public class Lobo extends Animal{

    public void correr() {
        System.out.println("O lobo está correndo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuu Auuuuuu!");
    }
}
