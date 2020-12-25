package class_04;


public class Desenho {
    public static void main(String[] args) {
        Personagem meuPersonagem = new Personagem("Gabriel", 29);
        Dublador dubladorDoMeuPersonagem = new Dublador();

        meuPersonagem.setDublador(dubladorDoMeuPersonagem);

        dubladorDoMeuPersonagem.setPersonagemDublado(meuPersonagem);
        System.out.println(meuPersonagem.getDublador().getPersonagemDublado().getNome());
    }
}
