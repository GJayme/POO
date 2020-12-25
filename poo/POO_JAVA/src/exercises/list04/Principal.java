package exercises.list04;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        PetShop petshop = new PetShop();

        Scanner scanner = new Scanner(System.in);

        boolean openMenu = true;

        while(openMenu){
            Menu.showMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.next();
                    System.out.print("CPF: ");
                    String cpfNovaPessoa = scanner.next();
                    Pessoa pessoa = new Pessoa(nome, cpfNovaPessoa);
                    petshop.addPessoa(pessoa);
                    break;
                case 2:
                    System.out.print("CPF: ");
                    String cpfExiste = scanner.next();
                    System.out.print("Nome Cachorro: ");
                    String nomeCao = scanner.next();
                    System.out.print("Raça: ");
                    String racaCao = scanner.next();

                    Cachorro novoCao = new Cachorro(nomeCao, racaCao);

                    petshop.addCachorro(cpfExiste, novoCao);
                    break;
                case 3:
                    petshop.listPessoas();
                    break;
                case 4:
                    System.out.print("CPF: ");
                    String cpfBuscaCao = scanner.next();
                    petshop.listCachorros(cpfBuscaCao);
                    break;
                case 5:
                    System.out.print("CPF: ");
                    String cpfParaRemover = scanner.next();
                    petshop.removePessoa(cpfParaRemover);
                    break;
                case 6:
                    System.out.print("CPF: ");
                    String cpfParaRemoverCao = scanner.next();
                    System.out.print("Nome do Cachorro: ");
                    String nomeCachorroARemover = scanner.next();
                    petshop.removeCachorro(cpfParaRemoverCao, nomeCachorroARemover);
                    break;
                case 7:
                    boolean vacinado = false;
                    System.out.print("Buscar por vacinados (s) ou não vacinados (n)? ");
                    String ehVacinado = scanner.next();

                    if (ehVacinado.equals("s")) {
                        vacinado = true;
                    }

                    petshop.listVacinados(vacinado);
                    break;
                case 8:
                    boolean vacinadoPorCpf = false;
                    System.out.print("CPF: ");
                    String cpfListarVacinados = scanner.next();
                    System.out.print("Buscar por vacinados (s) ou não vacinados (n)? ");
                    String ehVacinadoPorCpf = scanner.next();

                    if (ehVacinadoPorCpf.equals("s")) {
                        vacinadoPorCpf = true;
                    }

                    petshop.listVacinados(vacinadoPorCpf, cpfListarVacinados);
                    break;
                case 9:
                    openMenu = false;
                    System.out.println("Saindo do sistema.");
                    break;
            }
        }
    }
}
