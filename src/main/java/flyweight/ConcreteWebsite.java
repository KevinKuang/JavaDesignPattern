package flyweight;

/**
 * Created by Kevin on 2020/2/9.
 *
 * @author Kevin
 */
public class ConcreteWebsite extends Website {

    private String type;

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(String.format("网站的发布形式为%s，使用者为%s",type,user.getName()));
    }
}
