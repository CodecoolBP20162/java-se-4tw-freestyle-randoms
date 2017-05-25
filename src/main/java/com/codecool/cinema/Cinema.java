package com.codecool.cinema;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Cinema.
 */
public class Cinema {

    /**
     * The Students.
     */
    List<StudentWorker> students;
    /**
     * The Managers.
     */
    List<Leader> managers;

    /**
     * The Chief.
     */
    Chief chief = Chief.getInstance();

    /**
     * The Monthly turnover.
     */
    static int monthlyTurnover = 0;

    /**
     * Instantiates a new Cinema.
     *
     * @param monthlyTurnover the monthly turnover
     */
    public Cinema(int monthlyTurnover) {
        students = new ArrayList<>();
        managers = new ArrayList<>();

        this.monthlyTurnover = monthlyTurnover;
    }

    /**
     * Hire student workers list.
     *
     * @param numberOfStudentWorkers the number of student workers
     * @return the list
     */
    public List<StudentWorker> hireStudentWorkers(int numberOfStudentWorkers) {
        for (int i = 0; i < numberOfStudentWorkers; i++) {
            students.add(new Cashier());
            students.add(new TicketPuncher());
            students.add(new BuffetAssistant());
        }
        return students;
    }

    /**
     * Hire managers list.
     *
     * @param numberOfManagers the number of managers
     * @return the list
     */
    public List<Leader> hireManagers(int numberOfManagers) {
        for (int i = 0; i < numberOfManagers; i++) {
            managers.add(new Manager());
        }
        managers.add(Chief.getInstance());
        return managers;
    }

}
