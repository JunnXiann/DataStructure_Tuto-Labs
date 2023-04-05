package Tutorial.Revision.Q5;

public class BankAccount implements Account {
    int balance;
    BankAccount(int balance) {
        this.balance = balance;
    }

    public int deposit(int amount) {
        this.balance -= amount;
        return this.balance;
    }

    public boolean withdraw(int amount) {
        if (amount > this.balance) {
            return false;
        } else {
            this.balance -= amount;
            return true;
        }
    }
}
