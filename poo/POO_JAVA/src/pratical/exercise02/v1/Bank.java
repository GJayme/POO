package pratical.exercise02.v1;

public class Bank {

    private int number;

    private Account[] accounts = new Account[10000];

    private int countAccount = 0;

    public Bank(int number) {
        this.number = number;
    }

    public void listAccounts(){
        for (int i = 0; i < accounts.length; i++) {
            if(accounts[i] != null){
                System.out.println(accounts[i]);
            }
        }
    }

    public void listAccounts(long agency){}

    public double approveLimit(double amount, int accountTime){
        double preAprovalLimit = 200 + (300 * accountTime);

        if (amount < preAprovalLimit) {
            return amount;
        }
        return preAprovalLimit;
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
        return String.valueOf(number);
    }
}
