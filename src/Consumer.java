class Consumer implements Runnable {
    private Printer printer;

    public Consumer(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 90; i++) {
                printer.printDocument();
                Thread.sleep((long) (Math.random() * 50));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}