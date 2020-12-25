package exercises.list03.Ex03;

public class Petshop {

    public static void main(String[] args) {

        Animal [] animais = new Animal[2];

        int countAnimais = 0;


        Gato gato1 = new Gato("Luna", 5, "Vira Lata");
        animais[0] = gato1;

        System.out.println(gato1.banho());
        Cachorro cachorro1 = new Cachorro("Pandora", 23, "Vira Lata");
        animais[1] = cachorro1;

        System.out.println(cachorro1.banho());
        System.out.println(cachorro1.tosa());

        double totalFatura = 0;
        for (Animal animal : animais) {
            if(animal instanceof Gato){
                totalFatura += animal.banho();
            } else {
                totalFatura += animal.banho() + animal.tosa();
            }
        }

        System.out.println("totalFatura = " + totalFatura);





    }
}
