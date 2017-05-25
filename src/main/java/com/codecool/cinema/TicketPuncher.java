package com.codecool.cinema;

/**
 * The type Ticket puncher.
 * This Class represents the StudentWorker job.
 */
public class TicketPuncher extends StudentWorker {

    /**
     * The Salary increase rate.
     * Declare salary premium.
     */
    static final double salaryIncreaseRate = 0.5;

    /**
     * Instantiates a new Ticket puncher.
     * This method count a monthly salary rate and multiple by salaryIncreaseRate.
     */
    public TicketPuncher() {
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
        return (this.name + ", do not let in troublesome customers!\n");
    }

    @Override
    public String toString() {
        return "com.codecool.cinema.TicketPuncher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
