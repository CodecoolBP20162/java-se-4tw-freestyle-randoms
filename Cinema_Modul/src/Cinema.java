import java.util.ArrayList;
import java.util.List;

public class Cinema {

    List<StudentWorker> students;
    List<Leader> managers;

    Chief chief = Chief.getInstance();

    static int monthlyTurnover = 0;

    public Cinema(int monthlyTurnover) {
        students = new ArrayList<>();
        managers = new ArrayList<>();

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

}
