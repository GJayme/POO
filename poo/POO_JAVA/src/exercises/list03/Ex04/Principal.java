package exercises.list03.Ex04;

public class Principal {

    public static void main(String[] args) {

        Consultor c1 = new Consultor("12312312312","David A. Huffman", 74,false, 7000.00, null);
        Consultor c2 = new Consultor("32132132131","Augusta Ada Byron", 36,true, 3000.00, c1);
        Consultor c3 = new Consultor("21321321313","Edsger Dijkstra", 72,false, 1520.00, c1);
        Consultor c4 = new Consultor("45645645646","Alan Mathison Turing", 41,false, 780.00, c2);
        Revendedor r1 = new Revendedor("65465465464","John von Neumann", 53,false, 300, c4);
        Revendedor r2 = new Revendedor("90219021902","Donald Ervin Knuth", 80,false, 432, c4);
        Revendedor r3 = new Revendedor("54654654654","Grace Murray Hopper", 85,true, 432, c3);


        System.out.println("c1: " + c1.calculaComissao());
        System.out.println("c2: " + c2.calculaComissao());
        System.out.println("c3: " + c3.calculaComissao());
        System.out.println("c4: " + c4.calculaComissao());
        System.out.println("r1: " + r1.calculaComissao());
        System.out.println("r2: " + r2.calculaComissao());
        System.out.println("r3: " + r3.calculaComissao());
    }
}
