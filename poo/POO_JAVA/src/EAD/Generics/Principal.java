package EAD.Generics;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {

        Client client1 = new Client("99999999999", "Gabriel", "11111111111", LocalDate.now());
        Client client2 = new Client("11111111111", "Luna", "22222222222", LocalDate.now());

        ClientDAO bd = new ClientDAO();

        bd.insert(client1);
        bd.insert(client2);

        System.out.println(bd.findAll());

        bd.remove("99999999999");

        System.out.println(bd.findAll());

        bd.findOne("99999999999");
        bd.findOne("11111111111");
    }
}
