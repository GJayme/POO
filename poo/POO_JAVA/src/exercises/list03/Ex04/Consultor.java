package exercises.list03.Ex04;

public class Consultor extends Funcionario {

    Funcionario[] subordinados = new Funcionario[7];
    private int countSubordinados = 0;

    public Consultor(String cpf, String nome, int idade, boolean sexo, double valorVendido, Consultor patrao) {
        super(cpf, nome, idade, sexo, valorVendido);
    }

    public void addFuncionario(Funcionario funcionario){
        subordinados[countSubordinados] = funcionario;
        countSubordinados++;
    }

    public int numSubordinados(){
        return countSubordinados;
    }

    @Override
    public double calculaComissao() {
        double comissao;

        comissao = getValorVendido()*0.15;

        for (Funcionario subordinado : subordinados) {
            if(subordinado != null) {
                comissao += subordinado.calculaComissao()*0.3;
            }
        }

        return comissao;
    }
}
