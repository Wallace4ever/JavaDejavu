package edu.seu.DesignPattern.ActionPattern.Observer;

import java.util.LinkedList;
import java.util.List;

public interface Subject {
    void register(Observer o);
    void remove(Observer o);
    void notifyObs();
    int getState();
    void setState( int state);
}

class SubjectA implements Subject{
    List<Observer> l=new LinkedList<>();
    private int state;
    @Override
    public void register(Observer o) {
        l.add(o);
    }

    @Override
    public void remove(Observer o) {
        l.remove(o);
    }

    @Override
    public void notifyObs() {
        for(Observer o:l){
            o.update(this);
        }
    }

    @Override
    public int getState() {
        return state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
        notifyObs();
    }
}