package be.ac.umons;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

//Herite de 'User', 'Serializable' pour enregistrer donnees et 'Observer' pour recevoir notifications des observés
public class Manager extends User implements Serializable, Observer {

    private Map<Worker, Agenda> AllAgendas;

    public Manager(String name, String firstName) {
        super(name, firstName);
    }

    public void addWorker(List<Worker> listWorkers, Worker w) {
        listWorkers.add(w);
    }
    public void deleteWorker(List<Worker> listWorkers, Worker w) {
        listWorkers.remove(w);
    }
    public void addRessource(List<Ressource> listRessources, Ressource R) {
        listRessources.add(R);
    }

    //methodes pour acceder aux elements de la map
    public void setAllAgendas(Map<Worker, Agenda> Allagendas) {
        this.AllAgendas = Allagendas;
    }
    public Map<Worker, Agenda> getAllAgendas() {
        return AllAgendas;
    }
    public Agenda getAgenda(Worker worker) {
        return AllAgendas.get(worker);
    }
    public void addAgenda(Worker worker, Agenda agenda) {
        AllAgendas.put(worker, agenda);
    }


    @Override
    public void update(Observable observable, Object o) {
        if (observable instanceof Task) {
            if (o == "Task.setName") {
                System.out.println("Task Name : " + ((Task) observable).getTaskName());
            }
            if (o == "Task.setTaskDescription") {
                System.out.println("Task Description : " + ((Task) observable).getTaskDescription());
            }
            if (o == "Task.setTaskRessources") {
                System.out.println("Task Ressources : " + ((Task) observable).getTaskRessources());
            }
            if (o == "Task.setTaskSkills") {
                System.out.println("Task Skills :\n " + ((Task) observable).getTaskSkills());
            }
            if (o == "Task.setTaskAgenda") {
                System.out.println("Task Agenda : " + ((Task) observable).getTaskAgenda());
            }
        }
        if (observable instanceof Worker) {
            if (o == "Worker.addSkill") {
                System.out.println("Worker skills :\n " + ((Worker) observable).getSkills());
            }
            if (o == "Worker.setDispo") {
                System.out.println("Worker avalaible.");
            }
            if (o == "Worker.setNames") {
                System.out.println("Worker name and first name : " + ((Worker) observable).getName() + ((Worker) observable).getFirstName());
            }
            if (o == "Worker.setworkerAgenda") {
                System.out.println("Worker Agenda:\n " + ((Worker) observable).getWorkerAgenda());
            }
        }
        if (observable instanceof Ressource) {
            if (o == "Ressource.setRessourceName") {
                System.out.println("Ressource Name : " + ((Ressource) observable).getRessourceName());
            }
            if (o == "Ressource.setRessourceQuantite") {
                System.out.println("Ressource Quantite : " + ((Ressource) observable).getRessourceQuantite());
            }
            if (o == "Ressource.setRessources") {
                System.out.println("Ressources :\n " + ((Ressource) observable).getRessources());
            }
            if (o == "Ressource.addRessource") {
                System.out.println("Ressources :\n " + ((Ressource) observable).getRessources());
            }
            if (o == "Ressource.deleteRessource") {
                System.out.println("Ressources :\n " + ((Ressource) observable).getRessources());
            }

        }
    }
}
