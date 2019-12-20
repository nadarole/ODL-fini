package be.ac.umons;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Worker extends User implements Serializable {
    private boolean workerDispo = true;
    private List<Skill> skills = new ArrayList<Skill>();
    private Agenda workerAgenda;


    public Worker(String name, String firstName) {
        super(name, firstName);
    }


    public void addSkill(Skill skill){
        skills.add(skill);
        notifyObservers("Skill added to " + getName() + ".");
    }


    public void setDispo(boolean dispo){
        this.workerDispo = dispo;
        notifyObservers("Worker " + getName() + "available.");
    }
    public void setNames(String name, String firstName){
        this.name = name;
        this.firstName = firstName;
        notifyObservers("Worker name and firstname set.");
    }
    public void setWorkerAgenda(Agenda workerAgenda){
        this.workerAgenda = workerAgenda;
        notifyObservers("Worker agenda set.");
    }


    public boolean getDispo(){return workerDispo;}
    public List<Skill> getSkills(){ return skills;}
    public Agenda getWorkerAgenda(){return workerAgenda;}
}

