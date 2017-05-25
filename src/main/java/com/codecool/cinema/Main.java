package com.codecool.cinema;

public class Main {

    public static void main(String[] args) {

        Cinema myCinema = new Cinema(100);
        myCinema.hireStudentWorkers(2);
        myCinema.hireManagers(2);

        System.out.println("Head of the cinema:\n" + myCinema.chief.toString());

        System.out.println("\nList of student workers at the beginning of the month:\n" + myCinema.students.toString());

        System.out.println("\nList of managers:\n" + myCinema.managers.toString());

        for (StudentWorker studentWorker : myCinema.students) {
            studentWorker.increaseSalary();
        }

        System.out.println("\nList of student workers at the end of the month with their salary raised:\n" + myCinema.students);

        String commands = "";

        for (int i = 0; i < myCinema.students.size(); i += 2) {
            commands += myCinema.students.get(i).getCommand();
        }

        System.out.println("\nCommands student workers got:");
        System.out.println(commands);
    }

}
