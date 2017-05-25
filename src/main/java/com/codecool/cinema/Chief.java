package com.codecool.cinema;

/**
 * The type Chief.
 */
public class Chief extends Leader {

    private static Chief instance = null;

    private Chief() {
        super();
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static Chief getInstance() {
        if (instance == null) {
            instance = new Chief();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "com.codecool.cinema.Chief{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
