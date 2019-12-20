package be.ac.umons;

import java.util.Observable;

public abstract class User extends Observable {

    protected static int id = 0;
    protected String name;
    protected String firstName;

    public User(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
        this.id += 1;
    }

    public int getId(){ return id;};
    public String getName(){ return name;};
    public String getFirstName(){ return firstName;};
}
