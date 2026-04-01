class BankingSystem {

    int balance = 1000;

    void withdraw(String user, int amount) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(user + " withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem obj = new BankingSystem();

        Thread t1 = new Thread(() -> obj.withdraw("User1", 700));
        Thread t2 = new Thread(() -> obj.withdraw("User2", 500));

        t1.start();
        t2.start();
    }
}