package visitor;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public interface AccountBookViewer {
    //查看消费的单子
    void view(ConsumeBill bill);

    //查看收入的单子
    void view(IncomeBill bill);
}
