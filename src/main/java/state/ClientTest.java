package state;

import org.junit.Test;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class ClientTest {

    @Test
    public void test(){
        Activity activity = new Activity(251,2);

        doTest(activity);
    }

    @Test
    public void noEnoughMoneyTest(){
        Activity activity = new Activity(10,2);

        doTest(activity);
    }

    @Test
    public void noPrizeTest(){
        Activity activity = new Activity(251,0);

        doTest(activity);
    }



    private void doTest(Activity activity){
        // 尝试直接抽奖、领奖
        activity.raffle();
        activity.dispensePrize();

        // 先扣除积分
        activity.deduceMoney();
        // 强行领奖
        activity.dispensePrize();

        // 老实抽奖
        activity.raffle();

        // 领取奖品
        activity.dispensePrize();
    }
}
