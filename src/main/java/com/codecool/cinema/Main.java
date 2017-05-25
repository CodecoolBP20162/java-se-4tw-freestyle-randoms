package com.codecool.cinema;
import java.util.Stack;

public class Main {
    static final String string1 = "Head of the cinema:\n";
    static final String string2 = "\nList of student workers at the beginning of the month:\n";
    static final String string3 = "\nList of managers:\n";
    static final String string4 = "\nList of student workers at the end of the month with their salary raised:\n";
    static final String string5 = "";
    static final String string6 = "\nCommands student workers got:";


    public static void main(String[] args) {

        Stack<String> strings = new Stack<>();
        strings.add(string6);
        strings.add(string5);
        strings.add(string4);
        strings.add(string3);
        strings.add(string2);
        strings.add(string1);

        Cinema myCinema = new Cinema(100);
        myCinema.hireStudentWorkers(2);
        myCinema.hireManagers(2);

        System.out.println(strings.pop() + myCinema.chief.toString());

        System.out.println( strings.pop()+ myCinema.students.toString());

        System.out.println(strings.pop() + myCinema.managers.toString());

        for (StudentWorker studentWorker : myCinema.students) {
            studentWorker.increaseSalary();
        }

        System.out.println(strings.pop() + myCinema.students);

        String commands = strings.pop();

        for (int i = 0; i < myCinema.students.size(); i += 2) {
            commands += myCinema.students.get(i).getCommand();
        }

        System.out.println(strings.pop());
        System.out.println(commands);


    }

}
