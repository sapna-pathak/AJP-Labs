
class Bank {

    double amount;

    Bank(double amount) {
        this.amount = amount;
        System.out.println("your ammount= " + amount);
    }

    void withdraw(double withdrawalAmount) {
        System.out.println("withdraw amount= " + withdrawalAmount);
        String msg = (withdrawalAmount <= amount) ? "withdraw is successfull" : "balance is low";
        System.out.println(msg);
        if (withdrawalAmount <= amount) {
            amount = amount - withdrawalAmount;
        }
    }

    void deposit(double depositAmount) {
        System.out.println("deposit amount= " + depositAmount);
        amount = amount + depositAmount;
        System.out.println("total balance= " + amount);
    }
}

public class Ajplab1a {

    public static void main(String[] args) {
        Bank b = new Bank(10000);
        b.withdraw(3000);
        b.deposit(5000);

    }
}
