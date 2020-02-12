package observer.observer;

/**
 * Created by Kevin on 2020/2/12.
 *
 * @author Kevin
 */
public interface Subject {
    void register(Observer o);
    void remove(Observer o);
    void notifyObservers();
}
