class balanceError extends Exception {
    balanceError(String message) {
        super(message);
    }
}

class SavingsAccount {
    int accountNumber;
    float balance;

    SavingsAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public void withdraw(float amount) throws balanceError {
        if (amount > this.balance) {
            throw new balanceError("You dont have enough balance to withdraw");
        } else {
            balance -= amount;
        }
    }
}

public class Java19 {
    public static void main(String[] args) {
        SavingsAccount svAccount = new SavingsAccount(1234);
        try {
            svAccount.withdraw(1000);
        } catch (balanceError e) {
            System.err.println(e);
        }
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}
