class Restaurant {

    boolean foodReady = false;

    synchronized void prepareFood() {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void serveFood() {
        try {
            if (!foodReady) {
                wait();
            }
            System.out.println("Waiter served food");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Restaurant obj = new Restaurant();

        Thread chef = new Thread(() -> obj.prepareFood());
        Thread waiter = new Thread(() -> obj.serveFood());

        waiter.start();
        chef.start();
    }
}