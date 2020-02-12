package facade;

/**
 * Created by Kevin on 2020/2/9.
 *
 * @author Kevin
 */
public class Screen {
    private final static Screen instance = new Screen();
    private Screen(){}

    public static Screen getInstance() {
        return instance;
    }

    public void up(){
        System.out.println("Screen up...");
    }

    public void down(){
        System.out.println("Screen down...");
    }
}
