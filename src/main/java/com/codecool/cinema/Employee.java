package com.codecool.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * The type Employee.
 */
public abstract class Employee {

    /**
     * The Id.
     */
    int id;
    /**
     * The Name.
     */
    public String name;
    /**
     * The Salary.
     */
    int salary;

    /**
     * The constant counter.
     */
    public static int counter = 1;

    /**
     * Instantiates a new Employee.
     */
    public Employee() {
        this.id = counter++;
        this.name = setName();
        this.salary = setSalary();
    }

    /**
     * Sets name.
     *
     * @return the name
     */
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

    /**
     * Sets salary.
     *
     * @return the salary
     */
    public int setSalary() {
        int salary = ThreadLocalRandom.current().nextInt(500, 3000);
        return salary;
    }

}
