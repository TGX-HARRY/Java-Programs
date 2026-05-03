public class oopsAbstractClass {
    public static class account {
        private String accountHolder;
        private double balance;
        
        /**
         * Getter for accountHolder
         * @return accountHolder
         */
        public String getAccountHolder() {
            return accountHolder;
        }

        public void setAccountHolder(String name) {
            this.accountHolder = name;
        }
        
        public void setBalance(double amount) {
            if (amount >= 0) {
                this.balance = amount;
            } else {
                System.out.println("Balance cannot be negative.");
            }
        }

        public double getBalance() {
            return balance;
        }
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }
    }
    public static void main(String[] args) {
        account myAccount = new account();
        myAccount.setAccountHolder("John Doe");
        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        myAccount.setBalance(1000.0);

        System.out.println("Initial Balance: " + myAccount.getBalance());
        myAccount.deposit(500.0);

        System.out.println("Balance after deposit: " + myAccount.getBalance());
        myAccount.withdraw(200.0);

        System.out.println("Balance after withdrawal: " + myAccount.getBalance());
        return;
    }
    
}
