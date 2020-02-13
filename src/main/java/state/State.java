package state;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public interface State {
    void deduceMoney(int num);

    boolean raffle();

    void dispensePrize();
}
