package exercises.list06;

public class Revendedor extends Funcionario{

    public Revendedor(String cpf, String nome, Integer idade, Boolean sexo, Double valorVendido, Consultor responsavel) {
        super(cpf, nome, idade, sexo, valorVendido, responsavel);

    }

    @Override
    public Double calculaComissao() {
        return getValorVendido()*0.15;
    }
}
