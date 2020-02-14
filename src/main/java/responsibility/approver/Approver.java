package responsibility.approver;

import responsibility.PurchaseRequest;

/**
 * Created by Kevin on 2020/2/14.
 *
 * @author Kevin
 */
public abstract class Approver {

    protected Approver nextApprover;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processRequest(PurchaseRequest request);
}
