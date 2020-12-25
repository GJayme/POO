package exercises.list03.Ex06;

public class Zoologico {

    public static void main(String[] args) {

        Animal[] zoo = new Animal[10];

        Leao leao = new Leao();
        Coruja coruja = new Coruja();
        Lobo lobo = new Lobo();

        zoo[0] = leao;
        zoo[1] = coruja;
        zoo[2] = lobo;
        zoo[3] = coruja;
        zoo[4] = lobo;
        zoo[5] = lobo;
        zoo[6] = leao;
        zoo[7] = leao;
        zoo[8] = coruja;
        zoo[9] = coruja;

        for (int i = 0; i < 10; i ++) {
            if (zoo[i] instanceof Coruja) {
                coruja.emitirSom();
            } else if (zoo[i] instanceof Leao) {
                leao.emitirSom();
                leao.correr();
            } else {
                lobo.emitirSom();
                lobo.correr();
            }
        }
    }
}
