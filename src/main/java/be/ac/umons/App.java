package be.ac.umons;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    private Stage primaryStage;
    private BorderPane rootLayout;
   /* private ObservableList<Task> taskData = FXCollections.observableArrayList();*/
    @Override
    public void start(Stage stage) throws Exception {

        this.primaryStage = stage;
        this.primaryStage.setTitle("JavaFX Sample App");
        Connexion();

    }
   /* public App(){
        List<Skill> taskSkills1 = new ArrayList();
        Skill skill1= new Skill("ouvrier");
        Skill skill2=new Skill("machiniste de plateau");
        Skill skill4= new Skill("régisseur de spectacles");
        taskSkills1.add(skill1);
        taskSkills1.add(skill2);
        taskSkills1.add(skill4);
        taskData.add(new Task("montage de la scène","pas de description",taskSkills1));
    }*/
   /* public ObservableList<Task> getTaskData() {
        return taskData;
    }*/
    public void Connexion() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("RootLayout.fxml"));
            Pane accueil = (Pane) loader.load();

            Stage nouv = new Stage();
            nouv.setTitle("Page de connexion");
            Scene scene = new Scene(accueil);
            nouv.setScene(scene);
            nouv.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showPage(String titre,String nom) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource(nom));
            Pane accueil = (Pane) loader.load();

            Stage nouv = new Stage();
            nouv.setTitle(titre);
            Scene scene = new Scene(accueil);
            nouv.setScene(scene);
            nouv.show();
          /*  RegistrationFormController controller = loader.getController();
            controller.setApp(this);*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args )
    {
        System.out.println( "Hello World!" );

        Application.launch(args);
        //creation du manager
        Manager boss = new Manager(" Debauche","Olivier");

        //creation liste de la liste de taches
        List<Task> listTasks = new ArrayList();

        List<Skill> taskSkills1 = new ArrayList();
        List<Skill> taskSkills2 = new ArrayList();
        List<Skill> taskSkills3 = new ArrayList();

        //instanciation de 8 skills
        Skill skill1= new Skill("ouvrier");
        Skill skill2=new Skill("machiniste de plateau");
        Skill skill3= new Skill("technicien de la lumière");
        Skill skill4= new Skill("régisseur de spectacles");
        Skill skill5= new Skill("éclairagiste");
        Skill skill6= new Skill("technicien du son");
        Skill skill7= new Skill("électricien");
        Skill skill8= new Skill("sound designer");

        //ajout des skills a une liste par rapport leurs taches respectives
        taskSkills1.add(skill1);
        taskSkills1.add(skill2);
        taskSkills1.add(skill4);

        taskSkills2.add(skill6);
        taskSkills2.add(skill8);
        taskSkills2.add(skill7);

        taskSkills3.add(skill3);
        taskSkills3.add(skill5);

        //instanciation de la tache
        Task task1 = new Task("montage de la scène","pas de description",taskSkills1);
        Task task2 = new Task("installation du matériel audio","pas de description",taskSkills2);
        Task task3 = new Task("Installation du jeu de lumière" ,"pas de description",taskSkills3);

        //ajout des taches a la liste de taches du projet
        listTasks.add(task1);
        listTasks.add(task2);
        listTasks.add(task3);

        //instanciation de la deadline
        Date deadline = new Date(2020,3,15,12,30);
        Project projet = new Project (listTasks,deadline);

        //instanciation des 17 workers
        Worker worker1 = new Worker("Dupont","Daniel");
        Worker worker2 = new Worker ("Lefevre","Marie");
        Worker worker3= new Worker ("Godart","Emilien");
        Worker worker4 = new Worker ("Ranson","Isabelle");
        Worker worker5 = new Worker ("Godefroid","Greta");
        Worker worker6 = new Worker("Dupuis","Megane");
        Worker worker7 = new Worker("Wilde","Oscar");
        Worker worker8 = new Worker("Hugo","valentin");
        Worker worker9 = new Worker("Marx","Albert");
        Worker worker10 = new Worker("Rousseau","Arthur");
        Worker worker11 = new Worker("Ozer","Français");
        Worker worker12 = new Worker("de Musset","Alfredo");
        Worker worker13 = new Worker("Zola","Emile");
        Worker worker14 = new Worker("Flaubert","Gustave");
        Worker worker15 = new Worker("Cage","Axelle");
        Worker worker16 = new Worker("Chaplin","Charlie");
        Worker worker17 = new Worker("Marlaux","David");

        //ajout des skills aux workers
        worker1.addSkill(skill1);
        worker2.addSkill(skill1);
        worker3.addSkill(skill1);
        worker4.addSkill(skill1);
        worker6.addSkill(skill2);
        worker7.addSkill(skill3);
        worker8.addSkill(skill3);
        worker9.addSkill(skill3);
        worker10.addSkill(skill3);
        worker11.addSkill(skill3);
        worker12.addSkill(skill4);
        worker13.addSkill(skill5);
        worker14.addSkill(skill5);

        worker5.addSkill(skill6);

        worker15.addSkill(skill7);
        worker16.addSkill(skill7);
        worker17.addSkill(skill8);

        //centralisation des workers dans ine liste
        List<Worker> listAllWorkers= new ArrayList();
        listAllWorkers.add(worker1);
        listAllWorkers.add(worker2);
        listAllWorkers.add(worker3);
        listAllWorkers.add(worker4);
        listAllWorkers.add(worker5);
        listAllWorkers.add(worker6);
        listAllWorkers.add(worker7);
        listAllWorkers.add(worker8);
        listAllWorkers.add(worker9);
        listAllWorkers.add(worker10);
        listAllWorkers.add(worker11);
        listAllWorkers.add(worker12);
        listAllWorkers.add(worker13);
        listAllWorkers.add(worker14);
        listAllWorkers.add(worker15);
        listAllWorkers.add(worker16);
        listAllWorkers.add(worker17);

        //instanciation de la ressource boite a outils
        Ressource ressource1 = new Ressource("marteau",4);
        Ressource ressource2 = new Ressource("tournevis",6);
        Ressource ressource3 = new Ressource("niveau",3);
        List<Ressource> listRessources1 = new ArrayList();
        listRessources1.add(ressource1);
        listRessources1.add(ressource2);
        listRessources1.add(ressource3);
        Ressource ressources1 =new Ressource("boite à outils",4,listRessources1);

        //instanciation de la ressource materiel audio
        Ressource ressource4 = new Ressource("micros",8);
        Ressource ressource5 = new Ressource("enceintes",6);
        Ressource ressource6 = new Ressource("table de mixage",2);
        List<Ressource> listRessources2 = new ArrayList();
        listRessources2.add(ressource4);
        listRessources2.add(ressource5);
        listRessources2.add(ressource6);
        Ressource ressources2 =new Ressource("matériel audio",1,listRessources2);

        //instanciation de la ressource materiel lumiere
        Ressource ressource7 = new Ressource("spots",15);
        Ressource ressource8 = new Ressource("panneau de controle",3);
        Ressource ressource9 = new Ressource("projecteur",7);
        List<Ressource> listRessources3 = new ArrayList();
        listRessources3.add(ressource7);
        listRessources3.add(ressource8);
        listRessources3.add(ressource9);
        Ressource ressources3 =new Ressource("matériel lumière",3,listRessources3);

        //tache 1:
        Worker chef = new Worker("Adriano","GUTTADAURIA");
        Date start1 = new Date(2020,1,30,5,30);
        Date end1 = new Date(2020,2,5,00,30);
        Agenda taskAgenda1 = new Agenda(start1,end1);
        listAllWorkers.add(chef);
        Skill skill9 = new Skill("leadership");
        chef.addSkill(skill9);
        CreateTask1 temp1 = new CreateTask1();
        Team team1 = new Team();
        List<Worker> listWorkers1 = new ArrayList<Worker>();
        team1 = temp1.makeTask(chef,listAllWorkers,"Team Adriano",taskAgenda1,task1,ressources1,listWorkers1, boss.getAllAgendas());
        temp1.display();

        //tache 2:
        Date start2 = new Date(2020,2,6,7,00);
        Date end2 = new Date(2020,2,9,16,30);
        Agenda taskAgenda2 = new Agenda(start2,end2);
        CreateTask2 temp2 = new CreateTask2();
        Team team2 =new Team();
        List<Worker> listWorkers2 = new ArrayList<Worker>();
        team2 = temp2.makeTask(chef,listAllWorkers,"Team Pierre",taskAgenda2,task2,ressources2,listWorkers2, boss.getAllAgendas());
        temp2.display();

        //tache 3:
        Worker chef2 = new Worker("François","Roland");
        Date start3 = new Date(2020,2,6,7,00);
        Date end3 = new Date(2020,2,9,16,30);
        Agenda taskAgenda3 = new Agenda(start3,end3);
        listAllWorkers.add(chef2);
        Skill skill10 = new Skill("leadership");
        chef.addSkill(skill10);
        Team team3 = new Team();
        List<Worker> listWorkers3 = new ArrayList<Worker>();
        team3 = temp1.makeTask(chef2,listAllWorkers,"Team François",taskAgenda3,task3,ressources3,listWorkers3, boss.getAllAgendas());
        temp1.display();

        //enregistrement du Projet dans le dossier 'out'
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("C:\\Users\\maesp\\Documents\\Polytech\\ODL\\TP8_ODL\\out");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(projet);
            out.close();
            fileOut.close();
            System.out.printf("Project saved.");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    }

