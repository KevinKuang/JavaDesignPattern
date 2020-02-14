package responsibility.approver;

import responsibility.PurchaseRequest;

/**
 * Created by Kevin on 2020/2/14.
 *
 * @author Kevin
 */
public class ViceSchoolApprover extends Approver {
    public ViceSchoolApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice()<=30000){
            System.out.println(String.format("[请求编号:%d]副校长%s已处理，金额为%.2f",request.getId(),this.name,request.getPrice()));
        }else {
            super.nextApprover.processRequest(request);
        }
    }
}
