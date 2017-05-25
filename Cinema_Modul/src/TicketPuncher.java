
public class TicketPuncher extends StudentWorker {

    static final double salaryIncreaseRate = 0.5;

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
        return "TicketPuncher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
