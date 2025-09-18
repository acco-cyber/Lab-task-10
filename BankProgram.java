import java.util.ArrayList;
public class BankProgram {
    static class Account {
        private String name;
        private String accountNumber;
        private double balance;
        public Account(String name, String accountNumber, double balance) {
            this.name = name;
            this.accountNumber = accountNumber;
            this.balance = balance; }
        public void deposit(double amount) {
            balance += amount;}
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds in account: " + accountNumber); }}
        public void display() {
            System.out.println("Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance);}
        public String getAccountNumber() {
            return accountNumber;}}
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        Account acc1 = new Account("Peter Irmgard", "C0011", 5000.0);
        Account acc2 = new Account("Katja Ruedi", "C0121", 4500.0);
        Account acc3 = new Account("Marcella Gebhard", "C0222", 20000.0);
        accounts.add(acc1);
        accounts.add(acc2);
        accounts.add(acc3);
        // Display all accounts
        System.out.println("List of accounts:");
        for (Account acc : accounts) {
            acc.display();}
        System.out.println("\nAfter depositing 1000 into account1:");
        acc1.deposit(1000);
        acc1.display();
        System.out.println("No transaction in account2:");
        acc2.display();
        System.out.println("After withdrawing 5000 from account3:");
        acc3.withdraw(5000);
        acc3.display();}}