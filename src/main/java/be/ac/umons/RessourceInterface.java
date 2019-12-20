package be.ac.umons;

import java.util.List;
import java.util.Observable;

public abstract class RessourceInterface extends Observable {

    public int getRessourceQuantite() {
        return 0;
    }

    public List<Ressource> getRessources() {
        return null;
    }

    public boolean getRessourceDispo() {
        return false;
    }

    public void setRessourceName(String ressourceName) {}

    public void setRessourceQuantite(int ressourceQuantite) {}

}
