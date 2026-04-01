class BankApplication {

    static void processTransaction() throws Exception {
        throw new Exception("Transaction Failed");
    }

    public static void main(String[] args) {

        try {
            processTransaction();
            System.out.println("Transaction Successful");
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}