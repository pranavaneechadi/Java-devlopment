public class GenericBox<T> {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("Java");
        System.out.println(stringBox.getValue());

        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setValue(100);
        System.out.println(integerBox.getValue());

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.setValue(99.99);
        System.out.println(doubleBox.getValue());

        GenericBox<Employee> employeeBox = new GenericBox<>();
        employeeBox.setValue(new Employee(101, "pranav", 5000, "IT"));
        System.out.println(employeeBox.getValue());
    }
}