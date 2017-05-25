package com.codecool.cinema;

/**
 * The type Cashier.
 */
public class Cashier extends StudentWorker {

    /**
     * The Salary increase rate.
     */
    static final double salaryIncreaseRate = 0.1;

    /**
     * Instantiates a new Cashier.
     */
    public Cashier() {
        super();
    }

    @Override
    public int increaseSalary() {
        for (int i = 1; i <= Cinema.monthlyTurnover; i ++) {
            if (i % 50 == 0) {
                this.salary = (int) (this.salary + this.salary * salaryIncreaseRate);
            }
        }
        return this.salary;
    }

    @Override
    public String getCommand() {
        return (this.name + ", be kinder to the customers!\n");
    }

    @Override
    public String toString() {
        return "com.codecool.cinema.Cashier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
