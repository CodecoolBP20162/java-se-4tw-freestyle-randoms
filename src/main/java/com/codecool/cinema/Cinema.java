package com.codecool.cinema;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    List<StudentWorker> students;
    List<Leader> managers;
    List<Leader> managers2;
    List<Leader> leader;

    Chief chief = Chief.getInstance();

    static int monthlyTurnover = 0;

    public Cinema(int monthlyTurnover) {
        students = new ArrayList<>();
        managers = new ArrayList<>();
        managers2 = new ArrayList<>();
        leader = new ArrayList<>();


        this.monthlyTurnover = monthlyTurnover;
    }

    public List<StudentWorker> hireStudentWorkers(int numberOfStudentWorkers) {
        for (int i = 0; i < numberOfStudentWorkers; i++) {
            students.add(new Cashier());
            students.add(new TicketPuncher());
            students.add(new BuffetAssistant());
        }
        return students;
    }

    public List<Leader> hireManagers(int numberOfManagers) {
        for (int i = 0; i < numberOfManagers; i++) {
            managers.add(new Manager());
        }
        managers.add(Chief.getInstance());
        return managers;
    }

    public List<Leader> hireOneManager(int oneOfManager) {
        for (int i = 0; i < oneOfManager || i !=1; i++) {
            managers2.add(new Manager());
        }
        managers2.add(new Manager());
        return managers2;
    }

    public List<Leader> oneLeader(int OneLeader) {
        for (int i = 0; i < OneLeader || i !=1; i++){
            leader.add(new Manager());
        }
        leader.add(new Manager());
        return leader;
    }



}
