package edu.seu.DesignPattern.ActionPattern.Observer;

public interface Observer {
    void update(Subject s);
    int getLocalState();
}

class ObserverA implements Observer{
    private int localState;
    @Override
    public void update(Subject s) {
        localState=s.getState();
    }

    @Override
    public int getLocalState() {
        return localState;
    }
}