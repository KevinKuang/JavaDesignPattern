package facade;

/**
 * Created by Kevin on 2020/2/9.
 *
 * @author Kevin
 */
public class Stereo {
    private final static Stereo instance = new Stereo();
    private Stereo(){}

    public static Stereo getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("Stereo on...");
    }

    public void off(){
        System.out.println("Stereo off...");
    }

    public void up(){
        System.out.println("Stereo Voice up...");
    }
}
