package facade;

/**
 * Created by Kevin on 2020/2/9.
 *
 * @author Kevin
 */
public class DVDPlayer {
    private final static DVDPlayer instance = new DVDPlayer();
    private DVDPlayer(){}

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("DVD on...");
    }

    public void off(){
        System.out.println("DVD off...");
    }

    public void play(){
        System.out.println("DVD play...");
    }
}
