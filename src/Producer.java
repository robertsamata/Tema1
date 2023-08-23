class Producer implements Runnable {
    private Printer printer;
    private String name;

    public Producer(Printer printer, String name) {
        this.printer = printer;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 30; i++) {
                String document = name + "-Document-" + i;
                printer.addDocument(document);
                Thread.sleep((long) (Math.random() * 100));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}