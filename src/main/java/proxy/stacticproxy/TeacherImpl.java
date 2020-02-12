package proxy.stacticproxy;

/**
 * Created by Kevin on 2020/2/9.
 *
 * @author Kevin
 */
public class TeacherImpl implements Teacher {
    @Override
    public void teach() {
        System.out.println("老师正在上课");
    }
}
