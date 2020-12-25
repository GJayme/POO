package exercises.list05;

import java.util.Objects;

public abstract class Funcionario {

    private String cpf;
    private String nome;
    private Integer idade;
    private boolean sexo;
    private Double valorVendido;

    private Consultor responsavel;

    public abstract double calculaComissao();

    public Funcionario(String cpf, String nome, Integer idade, boolean sexo, Double valorVendido, Consultor responsavel) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorVendido = valorVendido;

        if(responsavel != null) {
            this.responsavel = responsavel;
            this.responsavel.addSubordinado(this);
        }
    }

    @Override
    public String toString() {
        return "Tipo:" + getClass().getSimpleName()
                + " | CPF: " + cpf
                + " | Nome: " + nome
                + " | Idade: " + idade
                + " | Sexo: " + (sexo ? "F" : "M")
                + " | Valor Vendido: " + valorVendido
                + " | Comissão" + calculaComissao()
                + " | Responsável " + (responsavel != null ? responsavel.getNome() : "--")
                + " |";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        Funcionario that = (Funcionario) o;
        return getCpf().equals(that.getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }

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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(Double valorVendido) {
        this.valorVendido = valorVendido;
    }
}
