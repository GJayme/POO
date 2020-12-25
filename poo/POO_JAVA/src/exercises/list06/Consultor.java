package exercises.list06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Consultor extends Funcionario{

    private List<Funcionario> subordinados = new ArrayList<>();

    public Consultor(String cpf, String nome, Integer idade, Boolean sexo, Double valorVendido, Consultor responsavel) {
        super(cpf, nome, idade, sexo, valorVendido, responsavel);
    }

    public Consultor(Revendedor revendedor) {
        this(revendedor.getCpf(),
                revendedor.getNome(),
                revendedor.getIdade(),
                revendedor.getSexo(),
                revendedor.getValorVendido(),
                revendedor.getResponsavel());
    }

    @Override
    public Double calculaComissao() {
        double comissao = getValorVendido() * 0.15;
        for (Funcionario subordinado : subordinados) {
            comissao += subordinado.calculaComissao() * 0.30;
        }
        return comissao;
    }

    public void addSubordinado(Funcionario f){
        subordinados.add(f);
    }

    public int numDeSubordinados(){
        return subordinados.size();
    }

    public Iterator<Funcionario> iterator(){
        return subordinados.iterator();
    }

    @Override
    public String toString() {
        return super.toString()
                + " Subordinados: " + numDeSubordinados();
    }
}
