package visitor;

import org.junit.Test;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public class ClientTest {

    @Test
    public void test(){
        AccountBook accountBook = new AccountBook();
        //添加两条收入
        accountBook.addBill(new IncomeBill(100.32, "卖商品"));
        accountBook.addBill(new IncomeBill(1200, "卖广告位"));
        //添加两条支出
        accountBook.addBill(new ConsumeBill(66.90, "工资"));
        accountBook.addBill(new ConsumeBill(1240, "材料费"));

        Boss boss = new Boss();
        CPA cpa = new CPA();

        //两个访问者分别访问账本
        accountBook.show(cpa);
        accountBook.show(boss);

        boss.getTotalConsume();
        boss.getTotalIncome();
    }
}
