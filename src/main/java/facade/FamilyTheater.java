package facade;

/**
 * Created by Kevin on 2020/2/9.
 *
 * @author Kevin
 */
public class FamilyTheater {
    private DVDPlayer player;
    private Projector projector;
    private Screen  screen;
    private Stereo stereo;

    public FamilyTheater() {
        this.player = DVDPlayer.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    public void ready(){
        screen.down();
        stereo.on();
        stereo.up();
        projector.on();
        player.on();
        projector.show();
    }

    public void play(){
        player.play();
    }

    public void end(){
        projector.off();
        player.off();
        screen.up();
        stereo.off();
    }
}
