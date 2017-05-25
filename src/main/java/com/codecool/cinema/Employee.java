package com.codecool.cinema;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * The type Employee.
 * This is the main abstract call
 */
public abstract class Employee {

    /**
     * The Id.
     * Giving new id to the new employees.
     */
    int id;
    /**
     * The Name.
     * Giving a name to the new employees.
     */
    public String name;
    /**
     * The Salary.
     * Set default salary rate to the new employees
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
