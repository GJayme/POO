package pratical.exercise02.v1;

public class Account {

    private long number;
    private long agency;
    private double balance;
    private double availableCredit;
    private int password;
    private int accountTime;

    private Bank bank;
    private Client client;

    public Account(int password, Bank bank, Client client) {
        this.password = password;
        this.bank = bank;
        this.client = client;
    }

    public boolean withdraw(double amount, int password){
        if (password != this.password) {
            return false;
        }

        if (amount - balance < 0.0){
            if (availableCredit >= Math.abs(amount - balance)) {
                balance -= amount;
                return true;
            }
        }

        balance -= amount;
        return true;
    }

    public boolean deposit(double amount, int password){
        if (password != this.password) {
            return false;
        }
        balance += amount;
        return true;
    }

    public double increaseLimit(double amount, int password){
        if (password != this.password) {
            return 0.0;
        }

        double aprovedLimit = bank.approveLimit(amount, accountTime);

        this.availableCredit = aprovedLimit;

        return aprovedLimit;
    }

    public double balance(int password){
        if (password != this.password) {
            return 0.0;
        }
        return balance;
    }

    public long getNumber() {
        return number;
    }

    public long getAgency() {
        return agency;
    }

    public Bank getBank() {
        return bank;
    }

    public double getAvailableCredit() {
        return availableCredit;
    }

    public void setAccountTime(int accountTime) {
        this.accountTime = accountTime;
    }

    public int getAccountTime() {
        return accountTime;
    }

    @Override
    public String toString(){
        return "Banco: " + this.bank + " Agencia: " + this.agency + " Número: " + this.number + " Cliente: " + this.client;
    }
}
