package facade;

/**
 * Created by Kevin on 2020/2/9.
 *
 * @author Kevin
 */
public class Projector {

    private final static Projector instance = new Projector();
    private Projector(){}

    public static Projector getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("Projector on...");
    }

    public void off(){
        System.out.println("Projector off...");
    }

    public void show(){
        System.out.println("Projector show...");
    }
}
