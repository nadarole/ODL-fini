package be.ac.umons;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//Classe qui herite de 'RessourceInterface' et 'Serializable' pour enregistrer donnees
public class Ressource extends RessourceInterface implements Serializable {

    private String ressourceName;
    private int ressourceQuantite;
    private List<Ressource> ressources = new ArrayList<>();

    public Ressource(String ressourceName, int ressourceQuantite, List<Ressource> ressources){

        this.ressourceName = ressourceName;
        this.ressourceQuantite = ressourceQuantite;
        this.ressources = ressources;
    }
    public Ressource(String ressourceName, int ressourceQuantite){

        this.ressourceName = ressourceName;
        this.ressourceQuantite = ressourceQuantite;
    }


    public String getRessourceName(){return ressourceName;}
    @Override
    public int getRessourceQuantite(){return ressourceQuantite;}
    @Override
    public List<Ressource> getRessources(){return ressources;}
    @Override
    public boolean getRessourceDispo(){

        if(ressourceQuantite == 0) return false;
        else return true;
    }


    @Override
    public void setRessourceName(String ressourceName){
        this.ressourceName = ressourceName;
        notifyObservers("Ressource Name set.");
    }
    @Override
    public void setRessourceQuantite(int ressourceQuantite) {
        if (ressourceQuantite > -1) {
            this.ressourceQuantite = ressourceQuantite;
        }else{System.out.println("Error : negative quantity of ressource.");}
        notifyObservers("Ressource Quantity set.");
    }
    public void setRessources(List<Ressource> ressources){
        this.ressources = ressources;
        notifyObservers("Ressources set.");
    }
    public void addRessource(Ressource ressource){
        this.ressources.add(ressource);
        notifyObservers("Ressource added.");
    }
    public void deleteRessource(Ressource ressource){
        this.ressources.remove(ressource);
        notifyObservers("Ressource deleted.");
    }

    @Override
    public String toString(){

        return "Ressource's name : " + getRessourceName() + " \nQuantity left: " + getRessourceQuantite()
                + "\nQuantity inside " + getRessourceName() + " : " + ressources.size() + "\n";
    }
}