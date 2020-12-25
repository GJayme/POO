package exercises.list06;

public class Main {
    public static void main(String[] args) {
        popularBanco();
        GenericDAO<String, Funcionario> dao = new FuncionarioDAO();
        AppCli.start();
    }

    private static void popularBanco() {
        GenericDAO<String, Funcionario> dao = new FuncionarioDAO();

        Consultor huffman = new Consultor("12312312312", "David A. Huffman", 74, false, 7000.00, null);
        Consultor ada = new Consultor("32132132131", "Augusta Ada Byron", 36, true, 3000.00, huffman);
        Consultor dijkstra = new Consultor("21321321313", "Edsger Dijkstra", 72, false, 1520.00, huffman);
        Consultor turing = new Consultor("45645645646", "Alan Mathison Turing", 41, false, 780.00, ada);

        Revendedor vonNeumann = new Revendedor("65465465464", "John von Neumann", 53, false, 300.00, turing);
        Revendedor knuth = new Revendedor("90219021902", "Donald Ervin Knuth", 80, false, 432.00, turing);
        Revendedor hopper = new Revendedor("54654654654", "Grace Murray Hopper", 85, true, 432.00, dijkstra);

        dao.insert(huffman);
        dao.insert(ada);
        dao.insert(dijkstra);
        dao.insert(turing);
        dao.insert(vonNeumann);
        dao.insert(knuth);
        dao.insert(hopper);
    }
}
