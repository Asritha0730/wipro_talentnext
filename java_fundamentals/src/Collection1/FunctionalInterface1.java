package Collection1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class EmployeeInterface {
    int id;
    String name;
    String location;
    double salary;

    EmployeeInterface(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }
}

public class FunctionalInterface1 {
    public static void main(String[] args) {
        List<EmployeeInterface> employees = Arrays.asList(
            new EmployeeInterface(1, "Asritha", "Hyderabad", 50000),
            new EmployeeInterface(2, "Rahul", "Pune", 52000),
            new EmployeeInterface(3, "Sneha", "Delhi", 51000),
            new EmployeeInterface(4, "Arjun", "Bangalore", 53000),
            new EmployeeInterface(5, "Riya", "Mumbai", 54000)
        );

        Function<EmployeeInterface, String> getLocation = e -> e.getLocation();

        List<String> locations = employees.stream()
                                          .map(getLocation)
                                          .collect(Collectors.toList());

        System.out.println("Locations: " + locations);
    }
}
