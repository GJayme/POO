package exercises.list06;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AppCli {

    private static Scanner scanner = new Scanner(System.in);
    private static GenericDAO<String, Funcionario> dao = new FuncionarioDAO();

    public static void start(){
        while (true){
            int opcao = coletarOpcaoUsuario();
            switch (opcao){
                case 1:
                    inserirUsuario();
                    break;
                case 2:
                    atualizarUsuario();
                    break;
                case 3:
                    removerUsuario();
                    break;
                case 4:
                    listarUsuario();
                    break;
                case 5:
                    listarTodosUsuarios();
                    break;
                case 0:
                    sair();
                    return;
                default:
                    continue;
            }
        }
    }

    private static void inserirUsuario() {
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        Funcionario result = dao.findOne(cpf);

        if(result != null) {
            System.out.println("Usuário CPF " + cpf + " já esta cadastrado!");
            System.out.println("\n");
            return;
        }

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        Integer idade = Integer.valueOf(scanner.nextLine());
        System.out.print("Sexo [F, M]: ");
        String sexo = scanner.nextLine();
        System.out.print("Valor Vendido: ");
        Double valorVendido = Double.valueOf(scanner.nextLine());
        System.out.print("Superior [CPF]: ");
        String cpfSuperior = scanner.nextLine();

        if(cpfSuperior == null) {
            System.out.println("CPF do superior (" + cpf + ") não encontrado!");
            System.out.println("\n");
            return;
        }

        Funcionario superior = dao.findOne(cpfSuperior);
        if(superior instanceof Revendedor){
            superior = promoverSuperior((Revendedor) superior);
        }

        boolean boolSexo = sexo.toUpperCase().equals("F") ? true : false;
        Funcionario novoFuncionario = new Revendedor(cpf, nome, idade, boolSexo, valorVendido,(Consultor) superior);

        dao.insert(novoFuncionario);
    }

    private static void atualizarUsuario() {
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        Funcionario result = dao.findOne(cpf);

        if(result == null) {
            System.out.println("Usuário CPF " + cpf + " não encontrado!");
            System.out.println("\n");
            return;
        }

        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        Integer idade = Integer.valueOf(scanner.nextLine());
        System.out.print("Sexo [F, M]: ");
        String sexo = scanner.nextLine();
        System.out.print("Valor Vendido: ");
        Double valorVendido = Double.valueOf(scanner.nextLine());
        System.out.print("Superior [CPF]: ");
        String cpfSuperior = scanner.nextLine();

        if(cpfSuperior == null) {
            System.out.println("CPF do superior (" + cpf + ") não encontrado!");
            System.out.println("\n");
            return;
        }

        Funcionario superior = dao.findOne(cpfSuperior);
        if(superior instanceof Revendedor){
            superior = promoverSuperior((Revendedor) superior);
        }

        result.setNome(nome);
        result.setIdade(idade);
        result.setSexo(sexo.toUpperCase().equals("F")? true : false);
        result.setValorVendido(valorVendido);
        result.setResponsavel((Consultor) superior);

        dao.update(result);
    }

    private static Funcionario promoverSuperior(Revendedor revendedor) {
        Consultor promovido = new Consultor(revendedor);
        dao.update(promovido);
        return promovido;
    }

    private static void removerUsuario() {
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        Funcionario result = dao.findOne(cpf);

        if(result == null) {
            System.out.println("Usuário CPF " + cpf + " não encontrado!");
            System.out.println("\n");
            return;
        }

        if(result instanceof Consultor) {
            promoverSubordinados((Consultor) result);
        }
        dao.remove(cpf);
        System.out.println("Usuário CPF: " + cpf + " removido!");

        System.out.println("\n");
    }

    private static void promoverSubordinados(Consultor consultor) {
        Iterator<Funcionario> it = consultor.iterator();
        while (it.hasNext()){
            Funcionario subordinado = it.next();
            Consultor responsavel = consultor.getResponsavel();

            subordinado.setResponsavel(responsavel);
            if(responsavel != null) {
                responsavel.addSubordinado(subordinado);
            }
        }
    }

    private static void listarUsuario() {
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        Funcionario result = dao.findOne(cpf);
        if(result != null) {
            System.out.println(result);
        }
        System.out.println("\n");
    }

    private static void listarTodosUsuarios() {
        List<Funcionario> result = dao.findAll();
        for (Funcionario funcionario : result) {
            System.out.println(funcionario);

        }
        System.out.println("\n");
    }

    private static void sair() {
        System.out.println("Bye bye..");
    }

    private static int coletarOpcaoUsuario() {
        System.out.println("1 - Adicionar Funcionário");
        System.out.println("2 - Atualizar Funcionário");
        System.out.println("3 - Remover Funcionário");
        System.out.println("4 - Listar Funcionário");
        System.out.println("5 - Listar Todos Funcionário");
        System.out.println("0 - Sair");
        System.out.println("> ");

        Integer opcao = Integer.valueOf(scanner.nextLine());
        return opcao;
    }
}