package be.ac.umons;

import java.io.Serializable;
import java.util.List;

public class Team implements Serializable {
    private int idChef;
    private String teamName;
    private List<Worker> listWorkers;

    public Team(int idChef, String teamName, List<Worker> listWorkers){
        this.idChef = idChef;
        this.listWorkers = listWorkers;
        this.teamName = teamName;
    }
    public Team(List<Worker> listWorkers, String teamName){
        this.listWorkers = listWorkers;
        this.teamName = teamName;
    }
    public Team (){}

    public int getIdChef(){ return idChef;}
    public String getName(){ return teamName;}

    public void setIdChef(int idChef){ this.idChef = idChef;}
    public void setTeamName(String teamName){this.teamName = teamName;}
    public void setListWorkers(List<Worker> listWorkers){this.listWorkers = listWorkers;}
}
