package com.codecool.cinema;

public class Cashier extends StudentWorker {

    static final double salaryIncreaseRate = 0.1;

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
