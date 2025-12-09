import java.util.HashMap;
import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }
}

public class StudentDatabase {
    public static void main(String[] args) {
        HashMap<Integer, Student> students = new HashMap<>();
        students.put(1, new Student(1, "Pratiksha"));
        students.put(2, new Student(2, "Maya"));

        System.out.println("Student Database:");
        students.forEach((k, v) -> System.out.println(v));
    }
}
