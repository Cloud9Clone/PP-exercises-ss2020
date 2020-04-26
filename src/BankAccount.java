public class BankAccount {

    private int balance; // unit: EUR
    private int limit;  // 500 EUR

    private void addToBalance(int i) {
        balance += i;
    }

    private void subFromBalance(int i) {
        balance -= i;
    }

    public BankAccount() {
        balance = 0;
        limit = 500;
    }

    public BankAccount(int i) {
        balance = i;
        limit = 500;
    }

    public int getBalance() {
        return balance;
    }

    public int getLimit(){
        return limit;
    }

    public void deposit(int i) {
        addToBalance(i);
    }

    public void withdraw(int i) {
        subFromBalance(i);
    }

    // For checking whether the money are enough?
    public boolean withdrawChecked(){       // Unit-Test testWithdrawChecked() implemented!
        if(balance >= limit){
            return true;
        } else {
            return false;
        }
    }

}
