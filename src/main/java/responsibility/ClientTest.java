package responsibility;

import org.junit.Test;
import responsibility.approver.*;

/**
 * Created by Kevin on 2020/2/14.
 *
 * @author Kevin
 */
public class ClientTest {
    @Test
    public void test(){
        PurchaseRequest request = new PurchaseRequest(31000,0);
        Approver departmentApprover = new DepartmentApprover("A");
        Approver collegeApprover = new CollegeApprover("B");
        Approver viceSchoolApprover = new ViceSchoolApprover("C");
        Approver schoolApprover = new SchoolApprover("D");

        departmentApprover.setNextApprover(collegeApprover);
        collegeApprover.setNextApprover(viceSchoolApprover);
        viceSchoolApprover.setNextApprover(schoolApprover);

        departmentApprover.processRequest(request);
    }
}
