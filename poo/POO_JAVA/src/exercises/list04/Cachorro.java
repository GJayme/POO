package exercises.list04;

import java.util.Objects;

public class Cachorro {

    private String nome;
    private String raca;
    private boolean vacinado;

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cachorro cachorro = (Cachorro) o;
        return vacinado == cachorro.vacinado &&
                Objects.equals(nome, cachorro.nome) &&
                Objects.equals(raca, cachorro.raca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, raca, vacinado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }
}
