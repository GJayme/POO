//package exercises.list05;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class Principal {
//
//    public static void main(String[] args) {
//
//        FuncionarioDAO dbFuncionario = new FuncionarioDAO();
//
//        Consultor c1 = new Consultor("12312312312", "David A. Huffman", 74, false, 7000.00, null);
//        Consultor c2 = new Consultor("32132132131", "Augusta Ada Byron", 36, true, 3000.00, c1);
//        Consultor c3 = new Consultor("21321321313", "Edsger Dijkstra", 72, false, 1520.00, c1);
//        Consultor c4 = new Consultor(
//
//
//        dbFuncionario.insert(c1);
//        dbFuncionario.insert(c2);
//        dbFuncionario.insert(c3);
//        dbFuncionario.insert(c4);
//        dbFuncionario.insert(r1);
//        dbFuncionario.insert(r2);
//        dbFuncionario.insert(r3);
//
//        Scanner scanner = new Scanner(System.in);
//
//        boolean openMenu = true;
//
//        while(openMenu){
//            Menu.showmenu();
//            int choice = scanner.nextInt();
//            switch (choice){
//                case 1:
//                    System.out.println("Add funcionário");
//                    System.out.println("Nome: ");
//                    String nome = scanner.next();
//                    System.out.println("CPF: ");
//                    String cpf = scanner.next();
//                    System.out.println("Idade: ");
//                    Integer idade = scanner.nextInt();
//                    System.out.println("Sexo (F/M): ");
//                    boolean sexo = scanner.nextBoolean();
//                    System.out.println("Valor vendido: ");
//                    double valorVendido = scanner.nextDouble();
//                    System.out.println("Consultor: ");
//                    String cpfConsultor = scanner.next();
//
//                    Funcionario patrao = dbFuncionario.findOne(cpfConsultor);
//
//                    Revendedor x1;
//
//                    if(patrao instanceof Consultor){
//                        x1 = new Revendedor(cpf,nome,idade,sexo,valorVendido,(Consultor) patrao);
//                    } else {
//                        x1 = new Revendedor(cpf,nome,idade,sexo,valorVendido,null);
//                    }
//
//                    dbFuncionario.insert(x1);
//                    System.out.println("Funcionário Cadastrado!");
//                    break;
//                case 2:
//                    System.out.println("Remove funcionário: ");
//
//                    System.out.println("CPF: ");
//                    String cpfRemove = scanner.next();
//
//                    if (dbFuncionario.remove(cpfRemove)) {
//                        System.out.println("Funcionário removido!");
//                    } else {
//                        System.out.println("Funcionário não localizado!");
//                    }
//
//                    break;
//                case 3:
//                    System.out.println("Editar funcionário: ");
//
//                    System.out.println("Nome: ");
//                    String nomeUpdate = scanner.next();
//                    System.out.println("CPF: ");
//                    String cpfUpdate = scanner.next();
//                    System.out.println("Idade: ");
//                    Integer idadeUpdate = scanner.nextInt();
//                    System.out.println("Sexo: ");
//                    boolean sexoUpdate = scanner.nextBoolean();
//                    System.out.println("Valor vendido: ");
//                    double valorVendidoUpdate = scanner.nextDouble();
//                    System.out.println("Consultor: ");
//                    String cpfConsultorUpdate = scanner.next();
//
//                    Funcionario patraoUpdate  = dbFuncionario.findOne(cpfConsultorUpdate );
//
//                    Revendedor r1Update ;
//
//                    if(patraoUpdate  instanceof Consultor){
//                        r1Update  = new Revendedor(cpfUpdate ,nomeUpdate ,idadeUpdate ,sexoUpdate ,valorVendidoUpdate ,(Consultor) patraoUpdate );
//                    } else {
//                        r1Update  = new Revendedor(cpfUpdate ,nomeUpdate ,idadeUpdate ,sexoUpdate ,valorVendidoUpdate ,null);
//                    }
//
//                    if(dbFuncionario.update(r1Update)) {
//                        System.out.println("Funcionário Removido!!");
//                    } else {
//                        System.out.println("Funcionário não localizado!");
//                    }
//
//                    break;
//                case 4:
//                    System.out.println("CPF: ");
//                    String cpfPrint = scanner.next();
//
//                    Funcionario funcionarioPrint = dbFuncionario.findOne(cpfPrint);
//                    System.out.println(funcionarioPrint);
//
//                    break;
//                case 5:
//                    List<Funcionario> allF = dbFuncionario.findAll();
//                    for (Funcionario funcionario : allF) {
//                        System.out.println(funcionario + " recebeu: " + funcionario.calculaComissao());
//                    }
//                    break;
//                case 0:
//                    System.out.println("Saindo do programa..");
//                    openMenu = false;
//                    break;
//            }
//        }
//
//    }
//}
