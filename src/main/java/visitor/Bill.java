package visitor;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public interface Bill {

    void accept(AccountBookViewer viewer);

}