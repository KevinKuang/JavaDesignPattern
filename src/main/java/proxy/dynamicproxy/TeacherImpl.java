package proxy.dynamicproxy;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public class TeacherImpl implements Teacher {
    @Override
    public void teach() {
        System.out.println("老师正在上课");
    }
}
