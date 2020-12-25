package exercises.list06;

import java.util.Objects;

public abstract class Funcionario {
    private String cpf;
    private String nome;
    private Integer idade;
    private Boolean sexo;
    private Double valorVendido;
    private Consultor responsavel;

    public Funcionario(String cpf, String nome, Integer idade, Boolean sexo, Double valorVendido, Consultor responsavel) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorVendido = valorVendido;
        if (responsavel != null) {
            this.responsavel = responsavel;
            this.responsavel.addSubordinado(this);
        }
    }

    public abstract Double calculaComissao();

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

    public boolean getSexo() {
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

    public Consultor getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Consultor responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        Funcionario that = (Funcionario) o;
        return cpf.equals(that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Tipo:" + getClass().getSimpleName()
                + " | CPF: " + cpf
                + " | Nome: " + nome
                + " | Idade: " + idade
                + " | Sexo: " + (sexo ? "F" : "M")
                + " | Valor Vendido: " + valorVendido
                + " | Comissão: " + calculaComissao()
                + " | Responsável " + (responsavel != null ? responsavel.getNome() : "--")
                + " |";
    }
}
