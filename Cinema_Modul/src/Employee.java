import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Employee {

    int id;
    String name;
    int salary;

    public static int counter = 1;

    public Employee() {
        this.id = counter++;
        this.name = setName();
        this.salary = setSalary();
    }

    public String setName() {

        List<String> nameOfEmployee = new ArrayList<>();

        nameOfEmployee.add("Daniel");
        nameOfEmployee.add("David");
        nameOfEmployee.add("Abel");
        nameOfEmployee.add("Dorothy");
        nameOfEmployee.add("Diana");
        nameOfEmployee.add("Anna");

        String name = nameOfEmployee.get(new Random().nextInt(nameOfEmployee.size()));

        return name;

    }

    public int setSalary() {
        int salary = ThreadLocalRandom.current().nextInt(500, 3000);
        return salary;
    }

}
