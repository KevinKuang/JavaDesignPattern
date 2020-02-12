package decorator.tea;

import decorator.tea.MilkTea;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public abstract class JiDiTea extends MilkTea {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
