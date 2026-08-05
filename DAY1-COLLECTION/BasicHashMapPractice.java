import java.util.HashMap;
import java.util.Map;

public class BasicHashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Rahul");
        employees.put(102, "Priya");
        employees.put(103, "Arjun");
        employees.put(104, "Sneha");

        System.out.println("Original Map");
        System.out.println(employees);

        System.out.println("\nEmployee 103");
        System.out.println(employees.get(103));

        employees.replace(102, "Anjali");

        employees.remove(101);

        System.out.println("\nContains Key 105");
        System.out.println(employees.containsKey(105));

        System.out.println("\nKeys");

        for (Integer key : employees.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nValues");

        for (String value : employees.values()) {
            System.out.println(value);
        }

        System.out.println("\nEntries");

        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}