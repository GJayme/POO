package exercises.list04;

import java.util.ArrayList;
import java.util.Objects;

public class Pessoa {

    private String nome;
    private String cpf;

    private final ArrayList<Cachorro> cachorros = new ArrayList<>();

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void addMeuCachorro(Cachorro cachorro){
        cachorros.add(cachorro);
    }

    public void removeCachorro(Cachorro cachorro){
        cachorros.remove(cachorro);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) &&
                Objects.equals(cpf, pessoa.cpf) &&
                Objects.equals(cachorros, pessoa.cachorros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, cachorros);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Cachorro> getCachorros() {
        return cachorros;
    }

}
