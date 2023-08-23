import java.util.LinkedList;
import java.util.Queue;

class Printer {
    private Queue<String> documentQueue = new LinkedList<>();
    private static final int MAX_QUEUE_SIZE = 5;

    public synchronized void addDocument(String document) throws InterruptedException {
        while (documentQueue.size() >= MAX_QUEUE_SIZE) {
            wait();
        }
        documentQueue.add(document);
        System.out.println("Added document: " + document + " (Queue size: " + documentQueue.size() + ")");
        notifyAll();
    }

    public synchronized void printDocument() throws InterruptedException {
        while (documentQueue.isEmpty()) {
            wait();
        }
        String document = documentQueue.poll();
        System.out.println("Printing document: " + document + " (Queue size: " + documentQueue.size() + ")");
        notifyAll();
    }
}