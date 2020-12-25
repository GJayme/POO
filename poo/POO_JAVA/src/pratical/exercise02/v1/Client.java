package pratical.exercise02.v1;

public class Client {

    private String nome;
    private String cpf;

    private Account[] accounts = new Account[1000];

    private int countAccount = 0;

    public Client(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void listAccounts(){
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i] != null){
                System.out.println(accounts[i]);
            }
        }
    }

    public void addAccount(Account newAccount){
        if (countAccount >= accounts.length){
            return;
        }

        countAccount++;

        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i] == null){
                accounts[i] = newAccount;
                break;
            }
        }
    }

    public void removeAccount(Account accountToRemove){
        for (int i = 0; i < countAccount; i++) {
            if (accounts[i].getAgency() == accountToRemove.getAgency() && accounts[i].getNumber() == accountToRemove.getNumber() && accounts[i].getBank() == accountToRemove.getBank()){
                if (accounts[i] != null){
                    accounts[i] = null;
                    countAccount--;
                }
            }
        }
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
