import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {

    public static void main(String[] args) {

        HashMap<Integer, Employee> employees = new HashMap<>();

        employees.put(101, new Employee(101, "Rahul", 50000, "IT"));
        employees.put(102, new Employee(102, "Priya", 70000, "HR"));
        employees.put(103, new Employee(103, "Arjun", 45000, "IT"));
        employees.put(104, new Employee(104, "Sneha", 80000, "Finance"));
        employees.put(105, new Employee(105, "Kiran", 60000, "IT"));

        System.out.println("Employee 103");

        System.out.println(employees.get(103));

        Employee employee = employees.get(104);

        if (employee != null) {

            employee.setSalary(90000);
        }

        employees.remove(102);

        System.out.println();

        System.out.println("All Employees");

        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {

            System.out.println(entry.getValue());
        }
    }
}