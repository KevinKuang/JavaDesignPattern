package commnd;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public interface Command {

    void execute();

    void undo();
}
