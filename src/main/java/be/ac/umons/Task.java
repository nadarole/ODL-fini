package be.ac.umons;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.List;
import java.util.Observable;

public class Task extends Observable {

    private String taskName;
    private String taskDescription;
    private List<Skill> taskSkills;
    private Agenda taskAgenda;
    private Ressource taskRessources;


    public Task(String taskName, String taskDescription, List<Skill> taskSkills){

        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskSkills = taskSkills;
    }


    public String getTaskName(){return taskName;}
    public String getTaskDescription(){return taskDescription;}
    public Ressource getTaskRessources(){ return taskRessources;}
    public List<Skill> getTaskSkills(){return taskSkills;}
    public Agenda getTaskAgenda(){return taskAgenda;}

    public void setTaskAgenda(Agenda taskAgenda){
        this.taskAgenda = taskAgenda;
        notifyObservers("Task Agenda set.");
    }
    public void setTaskRessources(Ressource taskRes){
        this.taskRessources = taskRes;
        notifyObservers("Task Ressources set.");
    }
    public void setTaskDescription(String taskDescription){
        this.taskDescription = taskDescription;
        notifyObservers("Task Description set.");
    }
    public void setTaskName(String taskName){
        this.taskName = taskName;
        notifyObservers("Task Name set.");
    }
    public void setTaskSkills(List<Skill> taskSkills){
        this.taskSkills = taskSkills;
        notifyObservers("Task Skills set.");
    }

  /*  public StringProperty taskNameProperty() {
        return new SimpleStringProperty(taskName) ;
    }*/

}
