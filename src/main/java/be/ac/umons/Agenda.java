package be.ac.umons;

import java.util.Date;
import java.util.Observable;

public class Agenda extends Observable {

    private Date start;
    private Date end;

    Agenda(Date start, Date end){
        this.start = start;
        this.end = end;
    }

    public Date getStart(){return start;}
    public Date getEnd(){return end;}

    public void setStart(Date start){
        this.start = start;
        notifyObservers("Agenda Start set.");
    }
    public void setEnd(Date end){
        this.end = end;
        notifyObservers("Agenda End set.");
    }
}
