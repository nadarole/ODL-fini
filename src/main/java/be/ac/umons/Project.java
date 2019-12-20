package be.ac.umons;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private Date deadline;
    private List<Task> ListTasks = new ArrayList();
    private static int projectID = 0;

    public Project() {
        ++projectID;
        System.out.println("Création du projet # " + projectID);
    }
    public Project(List<Task> ListTasks, Date deadline) {

        this.ListTasks = ListTasks;
        this.deadline = deadline;
        ++projectID;
        System.out.println("Création du projet # " + projectID);
    }
    public List<Task> getTask() {
        return this.ListTasks;
    }
    public Date getDeadline() {
        return this.deadline;
    }
    public void setTask(ArrayList<Task> ListTasks) {
        this.ListTasks = ListTasks;
    }
    public String toString() {
        String text = "Project #" + projectID + "\n" + "\ndeadline \n" + this.deadline;
        return text;
    }
}
