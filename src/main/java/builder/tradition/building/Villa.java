package builder.tradition.building;

import builder.tradition.building.roof.RoofType;

/**
 * Created by Kevin on 2020/2/7.
 *
 * @author Kevin
 */
public class Villa extends AbstractBuilding {
    @Override
    protected boolean buildBasic(int deep) {
        // 地基深度不得小于3
        return (deep>=3);
    }

    @Override
    protected boolean buildWalls(int height) {
        // 高度不得大于15，且不得大于地基的4倍高
        return (height<=20&&height<=(super.basicDeep*4));
    }

    @Override
    protected boolean buildRoof(RoofType roofType) {
        // 可以使用任意屋顶
        return true;
    }
}
