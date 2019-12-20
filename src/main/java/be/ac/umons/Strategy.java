package be.ac.umons;

import java.util.List;
import java.util.Map;

//Classe abstraite qui a deux fils : CreateTask1 & CreateTask2
public interface Strategy {

    public Team makeTask (Worker chef, List<Worker> listAllWorkers, String teamName, Agenda taskAgenda, Task task, Ressource ressources, List<Worker> listWorkers, Map<Worker, Agenda> allAgendas);
    public void display();
}
