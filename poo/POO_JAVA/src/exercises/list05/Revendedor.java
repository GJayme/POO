package exercises.list05;

public class Revendedor extends Funcionario {

    public Revendedor(String cpf, String nome, Integer idade, boolean sexo, Double valorVendido, Consultor resposavel) {
        super(cpf, nome, idade, sexo, valorVendido, resposavel);
//        if(resposavel != null) {
//            resposavel.addSubordinado(this);
//        }
    }

    @Override
    public double calculaComissao() {
        return getValorVendido()*0.15;
    }

}
