package Employee_Management_System;

import java.io.*;
import java.util.Scanner;

public class EmployeeManagement implements Serializable {
    private int id;
    private String name;
    private int age;
    private double salary;

    public EmployeeManagement(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Employee Age  : " + age);
        System.out.println("Employee Salary: " + salary);
        System.out.println("-----------------------------");
    }
}

class EmployeeManagementSystem {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            count = sc.nextInt();
            sc.nextLine();

            switch (count) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    System.out.println("Exiting application.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addEmployee(Scanner sc) throws IOException {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        EmployeeManagement emp = new EmployeeManagement(id, name, age, salary);

        File file = new File("Employee");
        file.createNewFile();

        FileOutputStream fos = new FileOutputStream(file, true);
        ObjectOutputStream oos = (file.length() == 0
                ? new ObjectOutputStream(fos)
                : new AppendableObjectOutputStream(fos));

        oos.writeObject(emp);
        oos.close();
        fos.close();
    }

    private static void displayAll() throws IOException, ClassNotFoundException {
        File f = new File("Employee");
        if (!f.exists() || f.length() == 0) {
            System.out.println("No employee records found.");
            return;
        }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        System.out.println("Employee Details:");
        System.out.println("-----------------------------");

        try {
            while (true) {
                EmployeeManagement emp = (EmployeeManagement) ois.readObject();
                emp.display();
            }
        } catch (EOFException eof) {
           
        }

        ois.close();
    }
}


class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
       
    }
}
