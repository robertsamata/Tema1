import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
//        Student[] students = {
//                new Student("Alice", 85),
//                new Student("Bob", 92),
//                new Student("Carol", 78)
//        };
//
//        // Save students to a binary file
//        StudentRegister.saveStudents(students, "students.bin");
//
//        // Load students from the binary file
//        Student[] loadedStudents = StudentRegister.loadStudents("students.bin");
//
//        if (loadedStudents != null) {
//            System.out.println("Loaded students:");
//            Arrays.stream(loadedStudents).forEach(System.out::println);
//        }
//    }}
                Printer printer = new Printer();
                Thread producer1 = new Thread(new Producer(printer, "Device1"));
                Thread producer2 = new Thread(new Producer(printer, "Device2"));
                Thread producer3 = new Thread(new Producer(printer, "Device3"));
                Thread consumer = new Thread(new Consumer(printer));

                producer1.start();
                producer2.start();
                producer3.start();
                consumer.start();
            }
        }