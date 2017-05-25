package com.codecool.cinema;

/**
 * The type Student worker.
 */
public abstract class StudentWorker extends Employee {

    /**
     * Instantiates a new Student worker.
     */
    public StudentWorker() {
        super();
    }

    /**
     * Increase salary int.
     *
     * @return the int
     */
    public abstract int increaseSalary();

    /**
     * Gets command.
     *
     * @return the command
     */
    public abstract String getCommand();

    public abstract String toString();

}
