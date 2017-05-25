package com.codecool.cinema;

/**
 * The type Ticket puncher.
 */
public class TicketPuncher extends StudentWorker {

    /**
     * The Salary increase rate.
     */
    static final double salaryIncreaseRate = 0.5;

    /**
     * Instantiates a new Ticket puncher.
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
