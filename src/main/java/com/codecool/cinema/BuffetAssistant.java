package com.codecool.cinema;

/**
 * The type Buffet assistant.
 */
public class BuffetAssistant extends StudentWorker {

    /**
     * The Salary increase rate.
     */
    static final double salaryIncreaseRate = 0.7;

    /**
     * Instantiates a new Buffet assistant.
     */
    public BuffetAssistant() {
        super();
    }

    @Override
    public int increaseSalary() {
        for (int i = 1; i <= Cinema.monthlyTurnover; i ++) {
            if (i % 25 == 0) {
                this.salary = (int) (this.salary + this.salary * salaryIncreaseRate);
            }
        }
        return this.salary;
    }

    @Override
    public String getCommand() {
        return (this.name + ", be faster! Can't you see the line?\n");
    }

    @Override
    public String toString() {
        return "com.codecool.cinema.BuffetAssistant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
