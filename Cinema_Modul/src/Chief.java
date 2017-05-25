
public class Chief extends Leader {

    private static Chief instance = null;

    private Chief() {
        super();
    }

    public static Chief getInstance() {
        if (instance == null) {
            instance = new Chief();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Chief{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
