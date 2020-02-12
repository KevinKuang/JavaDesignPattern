package proxy.stacticproxy;

/**
 * Created by Kevin on 2020/2/9.
 *
 * @author Kevin
 */
public class ProxyTeacherImpl implements Teacher {

    private Teacher teacher;

    public ProxyTeacherImpl(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("====代理开始====");
        teacher.teach();
        System.out.println("====提交====");
    }
}
