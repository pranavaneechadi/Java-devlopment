import java.util.ArrayList;

public class BasicArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> technologies = new ArrayList<>();

        technologies.add("Java");
        technologies.add("Spring Boot");
        technologies.add("PostgreSQL");
        technologies.add("Docker");
        technologies.add("Kafka");

        System.out.println(technologies);

        technologies.add("Redis");
        technologies.add(2, "Git");
        technologies.remove("Kafka");

        System.out.println(technologies.contains("Spring Boot"));
        System.out.println(technologies.get(3));

        int index = technologies.indexOf("PostgreSQL");
        technologies.set(index, "MySQL");

        System.out.println(technologies.size());

        for (String technology : technologies) {
            System.out.println(technology);
        }

        System.out.println(technologies);
    }
}