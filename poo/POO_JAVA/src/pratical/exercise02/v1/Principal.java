package pratical.exercise02.v1;

public class Principal {
    public static void main(String[] args) {

        Client client1 = new Client("Gabriel", "71226678809");
        Client client2 = new Client("Vitor", "49474665983");

        Bank bank = new Bank(666);

        Account conta1 = new Account(123, bank, client1);
        Account conta2 = new Account(456, bank, client2);

        client1.addAccount(conta1);
        client2.addAccount(conta2);

        bank.addAccount(conta1);
        bank.addAccount(conta2);

        client1.listAccounts();
        client2.listAccounts();
        bank.listAccounts();

        conta1.deposit(10000, 123);
        conta1.withdraw(900, 123);
        conta1.increaseLimit(100, 123);
        conta1.setAccountTime(1);
        System.out.println("Credit: " + conta1.getAvailableCredit());
        conta2.deposit(90000, 456);

        System.out.println("conta1.balance = " + conta1.balance(123));
        System.out.println("conta1.balance = " + conta1.balance(000));
        System.out.println("conta2.balance = " + conta2.balance(456));
    }
}
