package exercises.list03.Ex04;

public abstract class Funcionario {

    private String cpf;
    private String nome;
    private int idade;
    private boolean sexo;
    private double valorVendido;

    public Funcionario(String cpf, String nome, int idade, boolean sexo, double valorVendido) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorVendido = valorVendido;
    }

    public abstract double calculaComissao();

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }
}
