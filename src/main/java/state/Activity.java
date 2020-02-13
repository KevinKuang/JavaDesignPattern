package state;

import java.util.Random;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class Activity {
    private int money;
    private int prizeCount;
    private State state;

    private final State notRaffleState = new NotRaffleState();
    private final State canRaffleState = new CanRaffleState();
    private final State dispenseState = new DispenseState();
    private final State noPrizeState = new NoPrizeState();

    public Activity(int money, int prizeCount) {
        this.money = money;
        this.prizeCount = prizeCount;
        // 初始默认为不能抽奖
        this.state = notRaffleState;
        if (prizeCount == 0){
            this.state = noPrizeState;
        }
    }


    public void deduceMoney() {
        try {
            this.state.deduceMoney(50);
            this.state = canRaffleState;
            System.out.println("扣除积分成功，可以抽奖了");
        }catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
    }


    public void raffle() {
        try {
            if (this.state.raffle()){
                this.state = dispenseState;
                System.out.println("你中奖了");
            }else {
                this.state = notRaffleState;
                System.out.println("你没中奖");
            }
        }catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
    }


    public void dispensePrize() {
        try {
            this.state.dispensePrize();
            if (this.prizeCount > 0){
                this.state = notRaffleState;
                System.out.println("领奖成功，你可以继续抽奖");
            }else {
                this.state = noPrizeState;
                System.out.println("领奖成功，奖品已经派完");
            }
        }catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
    }


    private class NotRaffleState implements State{

        String msg = "请先扣除积分";

        @Override
        public void deduceMoney(int num) {
            if (money > num){
                money -= num;
            }else {
                throw new UnsupportedOperationException("积分不足");
            }
        }

        @Override
        public boolean raffle() {
            throw new UnsupportedOperationException("不能抽奖，"+msg);
        }

        @Override
        public void dispensePrize() {
            throw new UnsupportedOperationException("不能发放奖品，"+msg);
        }
    }

    private class CanRaffleState implements State{

        @Override
        public void deduceMoney(int num) {
            throw new UnsupportedOperationException("已经扣除了积分，请抽奖");
        }

        @Override
        public boolean raffle() {
            System.out.println("正在抽奖");
            Random random = new Random();
            if (random.nextInt(10) == 0){
                return true;
            }
            return false;
        }

        @Override
        public void dispensePrize() {
            throw new UnsupportedOperationException("不能发放奖品，请先抽奖");
        }
    }

    private class DispenseState implements State{

        @Override
        public void deduceMoney(int num) {
            throw new UnsupportedOperationException("不能扣除积分，请先领奖");
        }

        @Override
        public boolean raffle() {
            throw new UnsupportedOperationException("不能抽奖，请先领奖");
        }

        @Override
        public void dispensePrize() {
            System.out.println("正在领取奖品");
            prizeCount -= 1;
        }
    }

    private class NoPrizeState implements State{

        @Override
        public void deduceMoney(int num) {
            throw new UnsupportedOperationException("奖品已经发完");
        }

        @Override
        public boolean raffle() {
            throw new UnsupportedOperationException("奖品已经发完");
        }

        @Override
        public void dispensePrize() {
            throw new UnsupportedOperationException("奖品已经发完");
        }
    }
}
