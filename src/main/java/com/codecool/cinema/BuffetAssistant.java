package com.codecool.cinema;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Buffet assistant.
 * This Class represents the StudentWorker job.
 */
public class BuffetAssistant extends StudentWorker {

    /**
     * The Salary increase rate.
     * Declare salary premium.
     */
    static final double salaryIncreaseRate = 0.7;

    /**
     * Instantiates a new Buffet assistant.
     * This method count a monthly salary rate and multiple by salaryIncreaseRate.
     */
    public BuffetAssistant() {
        super();
    }

    private static final Logger logger = LoggerFactory.getLogger(TicketPuncher.class);


    @Override
    public int increaseSalary() {
        for (int i = 1; i <= Cinema.monthlyTurnover; i ++) {
            if (i % 25 == 0) {
                this.salary = (int) (this.salary + this.salary * salaryIncreaseRate);
            }
        }
        logger.info("BuffetAssistant with {} id increased salary {}.",this.id, this.salary);
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
