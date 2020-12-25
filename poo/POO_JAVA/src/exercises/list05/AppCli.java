//package exercises.list05;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class AppCli {
//
//    private static Scanner scanner = new Scanner(System.in);
//    private static GenericDAO<String, Funcionario> dao = new FuncionarioDAO();
//
//    public static void start() {
//        while(true){
//            int opcao = coletarOpcaoUsuario();
//            switch (opcao){
//                case 1:
//                    inserirUsuario();
//                    break;
//                case 2:
//                    atualizarUsuario();
//                    break;
//                case 3:
//                    removerUsuario();
//                    break;
//                case 4:
//                    listarUsuario();
//                    break;
//                case 5:
//                    listarTodosUsuarios();
//                    break;
//                case 0:
//                    sair();
//                    return;
//                default:
//                    continue;
//            }
//        }
//    }
//
//    private static void inserirUsuario() {
//    }
//
//    private static void atualizarUsuario() {
//    }
//
//    private static void removerUsuario() {
//
//    }
//
////    private static void listarUsuario() {
////        System.out.println("\n");
////        String cpf = scanner.nextLine();
////        Funcionario result
////        dao.findOne();
////    }
////
////    private static void listarTodosUsuarios() {
//////        List<Funcionario> result = dao.findAll();
////        for (Funcionario funcionario : result) {
////            System.out.println(funcionario);
////        }
////        System.out.println("\n");
////    }
//
//    private static void sair() {
//        System.out.println("Bye bye...");
//    }
//
//    private static int coletarOpcaoUsuario(){
//        System.out.println("1 - Adicionanr Funcionário");
//        System.out.println("2 - Atualizar Funcionário");
//        System.out.println("3 - Remover Funcionário");
//        System.out.println("4 - Listar Funcionário");
//        System.out.println("5 - Listar Todos Funcionário");
//        System.out.println("0 - Sair");
//        System.out.println("> ");
//        Integer opcao = Integer.valueOf(scanner.nextLine());
//        return opcao;
//    }
//}
//
//
