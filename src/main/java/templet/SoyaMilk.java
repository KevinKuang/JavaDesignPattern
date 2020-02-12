package templet;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public abstract class SoyaMilk {
    // 不允许子类覆盖
    public final void make(){
        select();
        add();
        soak();
        beat();
    }

    public void select(){
        System.out.println("选材...");
    }

    public abstract void add();

    public void soak(){
        System.out.println("浸泡...");
    }

    public void beat(){
        System.out.println("打碎...");
    }

}
