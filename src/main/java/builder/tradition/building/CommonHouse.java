package builder.tradition.building;

import builder.tradition.building.roof.RoofType;

/**
 * Created by Kevin on 2020/2/7.
 *
 * @author Kevin
 */
public class CommonHouse extends AbstractBuilding {
    @Override
    protected boolean buildBasic(int deep) {
        // 地基深度不得小于5
        return (deep>=5);
    }

    @Override
    protected boolean buildWalls(int height) {
        // 高度不得大于20，且不得大于地基的3倍高
        return (height<=20&&height<=(super.basicDeep*3));
    }

    @Override
    protected boolean buildRoof(RoofType roofType) {
        // 不能用圆顶
        return (RoofType.DOME!=roofType);
    }
}
