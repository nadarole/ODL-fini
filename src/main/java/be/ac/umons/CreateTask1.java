package be.ac.umons;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CreateTask1 implements Strategy {
    public Team makeTask (Worker chef, List<Worker> listAllWorkers, String teamName, Agenda taskAgenda, Task task, Ressource ressources, List<Worker> listWorkers, Map<Worker, Agenda> allAgendas)
    {
        listWorkers.add(chef);
        allAgendas.put(chef, taskAgenda);
        chef.setWorkerAgenda(taskAgenda);
        Team team = new Team(chef.getId(), teamName, listWorkers);

        /*1*/ List<Skill> temp = null;

        Iterator<Worker> itw = listAllWorkers.iterator();
        Iterator<Skill> its = task.getTaskSkills().iterator();
        assert false;
        Iterator<Skill> itt = temp.iterator();

        while(its.hasNext())

        {

            while (itw.hasNext()) {
                temp = itw.next().getSkills();
                if (its.next().getSkillName().equals(itt.next().getSkillName()) && itw.next().getDispo() == true) {
                    listWorkers.add(itw.next());
                    allAgendas.put(itw.next(), taskAgenda);
                    itw.next().setWorkerAgenda(taskAgenda);
                    break;
                }
            }
        }

        /*2*/task.setTaskAgenda(taskAgenda);
        /*3*/task.setTaskRessources(ressources);
        return team;

    }
    public void display()
    {System.out.println("task created using first method");}}
