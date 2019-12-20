package be.ac.umons;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CreateTask2 implements Strategy{


    public Team makeTask (Worker Chef, List<Worker> listAllWorkers, String teamName, Agenda taskAgenda, Task task, Ressource ressources, List<Worker> listWorkers, Map<Worker,Agenda> allAgendas)
    {
        Iterator<Worker> itwALL = listAllWorkers.iterator();
        Team  team = new Team( listWorkers,teamName);
        int i =0;
        while (itwALL.hasNext()) {

            if(i==0) {
                team.setIdChef(itwALL.next().getId());
                allAgendas.put(itwALL.next(), taskAgenda);
                itwALL.next().setWorkerAgenda(taskAgenda);
            }
            if(i<4){
                listWorkers.add(itwALL.next());
                allAgendas.put(itwALL.next(), taskAgenda);
                itwALL.next().setWorkerAgenda(taskAgenda);
            }
            if(i==4){
                break;
            }
            i++;
        }

        /*2*/task.setTaskAgenda(taskAgenda);
        /*3*/task.setTaskRessources(ressources);

        //workers de la team seront les 3 permiers de la liste allWorkers or chef
        //ressource sera donner dans le main également
        return team;
    }
    public void display()
    {System.out.println("task created using second method");}
}
