import java.io.*;
import java.util.Arrays;

class StudentRegister {
public static void saveStudents(Student[] students, String fileName) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
        outputStream.writeObject(students);
        System.out.println("Students saved to " + fileName);
        } catch (IOException e) {
        e.printStackTrace();
        }
        }

public static Student[] loadStudents(String fileName) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
        return (Student[]) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
        return null;
        }
        }
        }