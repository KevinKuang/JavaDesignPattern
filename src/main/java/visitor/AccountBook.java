package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public class AccountBook {
    //单子列表
    private List<Bill> billList = new ArrayList<>();
    //添加单子
    public void addBill(Bill bill){
        billList.add(bill);
    }
    //供账本的查看者查看账本
    public void show(AccountBookViewer viewer){
        for (Bill bill : billList) {
            bill.accept(viewer);
        }
    }
}
