import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(int index) {
        accounts.remove(index);
    }

    public void deposit(int accountId, double amount) {
        Account account = accounts.get(accountId);
        account.deposit(amount);
    }

    public void withdraw(int accountId, double amount) {
        Account account = accounts.get(accountId);
        account.withdraw(amount);
    }
}

class Account {

    private int id;
    private String name;
    private double balance;

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account(1, "John Doe", 1000.0);
        bank.addAccount(account1);

        Account account2 = new Account(2, "Jane Doe", 2000.0);
        bank.addAccount(account2);

        bank.deposit(1, 500.0);
        bank.withdraw(2, 1000.0);

        System.out.println("Account 1 balance: " + bank.getAccount(1).getBalance());
        System.out.println("Account 2 balance: " + bank.getAccount(2).getBalance());
    }
}
