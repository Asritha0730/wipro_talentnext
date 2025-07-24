package Collection1;

import java.util.*;


class Employe {
    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private String address;

    public Employe(String firstName, String lastName, String mobile, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMobile() { return mobile; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }
}


public class mini_project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employe> employeeList = new ArrayList<>();

        System.out.println("Enter the Number of Employees");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee " + (i + 1) + " Details:");

            System.out.println("Enter the Firstname");
            String fname = sc.nextLine();

            System.out.println("Enter the Lastname");
            String lname = sc.nextLine();

            System.out.println("Enter the Mobile");
            String mobile = sc.nextLine();

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            employeeList.add(new Employe(fname, lname, mobile, email, address));
        }

       
        Collections.sort(employeeList, Comparator.comparing(Employe::getFirstName));

        System.out.println("\nEmployee List:\n");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
        for (Employe e : employeeList) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                    e.getFirstName(), e.getLastName(), e.getMobile(), e.getEmail(), e.getAddress());
        }

        sc.close();
    }
}
