public interface IEventEmitter {
    void attach(Observer observer);


    void detach(Observer observer) ;

    void notifyObservers (int value) ;
}
