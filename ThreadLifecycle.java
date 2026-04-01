class ChatApplication {

    public static void main(String[] args) {

        Thread sender = new Thread(() -> {
            System.out.println("Sending message...");
        });

        Thread receiver = new Thread(() -> {
            System.out.println("Receiving message...");
        });

        System.out.println("Sender State: " + sender.getState());

        sender.start();
        receiver.start();

        System.out.println("Sender State after start: " + sender.getState());
    }
}