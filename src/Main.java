import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Class> classes = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("1. Manage Classes");
            System.out.println("2. Manage Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manageClasses(classes, students, scanner);
                    break;
                case 2:
                    manageStudents(classes, students, scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }

    public static void manageClasses(List<Class> classes, List<Student> students, Scanner scanner) {
        while (true) {
            System.out.println("1. Add Class");
            System.out.println("2. List Classes");
            System.out.println("3. Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addClass(classes, scanner);
                    break;
                case 2:
                    listClasses(classes);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }

    public static void addClass(List<Class> classes, Scanner scanner) {
        System.out.print("Enter class ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter class name: ");
        String name = scanner.nextLine();
        Class newClass = new Class(id, name);
        classes.add(newClass);
        System.out.println("Class added: ");
        System.out.println(newClass.getName());
    }

    public static void listClasses(List<Class> classes) {
        System.out.println("List of Classes:");
        for (Class c : classes) {
            System.out.println("ID:"+ c.getId() +". "+" Name: "+ c.getName()+". "+"Number in class: "+ c.getNumberOfStudent());
        }
    }

    public static void manageStudents(List<Class> classes, List<Student> students, Scanner scanner) {
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addStudent(classes, students, scanner);
                    break;
                case 2:
                    listStudents(students);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }

    public static void addStudent(List<Class> classes, List<Student> students, Scanner scanner) {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student score: ");
        double score = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter class ID: ");
        int classId = scanner.nextInt();
        scanner.nextLine();
        Class studentClass = null;
        for (Class c : classes) {
            if (c.getId() == classId) {
                studentClass = c;
                break;
            }
        }

        if (studentClass != null) {
            Student newStudent = new Student(id, name, score, studentClass);
            students.add(newStudent);
            System.out.println("Student added: " + newStudent.getClass());
        } else {
            System.out.println("Class with ID " + classId + " not found.");
        }
    }

    public static void listStudents(List<Student> students) {
        System.out.println("List of Students:");
        for (Student s : students) {
            System.out.println("Danh sách học sinh /n" + s.getId()+". " + s.getName());
        }
    }
}
