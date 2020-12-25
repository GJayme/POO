package class_04;


public class Personagem {
    private String nome;
    private int idade;
    private Dublador dublador;


    public Personagem(){}

    public Personagem(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setDublador(Dublador dublador) {
        this.dublador = dublador;
    }

    public Dublador getDublador() {
        return dublador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }


}
