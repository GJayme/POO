package class_05.exercise03;

public class Leao extends Animal {

    public void correr() {
        System.out.println("O leão esta correndo...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Rrrrwarrr!");
    }
}
