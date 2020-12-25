package exercises.list03.Ex04;

public class Revendedor extends Funcionario{

    public Revendedor(String cpf, String nome, int idade, boolean sexo, double valorVendido, Consultor patrao) {
        super(cpf, nome, idade, sexo, valorVendido);
        patrao.addFuncionario(this);
    }

    @Override
    public double calculaComissao() {
        double comissao;

        comissao = getValorVendido()*0.15;

        return comissao;
    }
}
