package exercises.list04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PetShop {

    Map<String, Pessoa> clientes = new HashMap<>();

    public void addPessoa(Pessoa pessoa) {
        clientes.put(pessoa.getCpf(), pessoa);
        System.out.println("Pessoa cadastrada!");
    }

    public void addCachorro(String cpf, Cachorro cachorro) {
        if(clientes.containsKey(cpf)){
            clientes.get(cpf).addMeuCachorro(cachorro);
            System.out.println("Cachorro cadastrado!");
        } else {
            System.out.println("Pessoa não cadastrada!");
        }
    }

    public void listPessoas(){
        for (Map.Entry<String, Pessoa> entry : clientes.entrySet()) {
            System.out.println(entry.getValue().getNome());
        }
    }

    public void listCachorros(String cpf){
        if (clientes.containsKey(cpf)){
            ArrayList<Cachorro> cachorros = clientes.get(cpf).getCachorros();
            for (Cachorro cachorro : cachorros) {
                System.out.println(cachorro.getNome());
            }
        } else {
            System.out.println("Cliente com nenhum cachorro cadastrado!");
        }
    }

    public void removePessoa(String cpf){
        if(clientes.containsKey(cpf)){
            clientes.remove(cpf);
            System.out.println("Cliente removido!");
        } else {
            System.out.println("Nenhum clinete encontrado com esse CPF!");
        }
    }

    public void removeCachorro(String cpf, String nomeCachorro) {
        if(clientes.containsKey(cpf)){
            for (Cachorro cachorro : clientes.get(cpf).getCachorros()) {
                if (nomeCachorro.equals(cachorro.getNome())){
                    System.out.println("O cachorro " + cachorro.getNome() + " foi removido!");
                    clientes.get(cpf).removeCachorro(cachorro);
                    break;
                }
            }
        } else {
            System.out.println("CPF não encontrado!");
        }
    }

    public void listVacinados (boolean isVacinado) {
        for (Map.Entry<String, Pessoa> pessoa : clientes.entrySet()) {
            ArrayList<Cachorro> cachorros = pessoa.getValue().getCachorros();
            for (Cachorro cachorro : cachorros) {
                if (cachorro.isVacinado() == isVacinado) {
                    System.out.println(cachorro.getNome());
                }
            }
        }
    }

    public void listVacinados (boolean isVacinado, String cpf) {
        if(clientes.containsKey(cpf)){
            ArrayList<Cachorro> cachorrosAux = clientes.get(cpf).getCachorros();
            for (Cachorro aux : cachorrosAux) {
                if(aux.isVacinado() == isVacinado){
                    System.out.println(aux.getNome());
                }
            }
        } else {
            System.out.println("CPF não encontrado!");
        }
    }
}
