package builder.builder.builder;

import builder.builder.building.CommonHouse;
import builder.builder.building.roof.RoofType;

/**
 * Created by Kevin on 2020/2/7.
 *
 * @author Kevin
 */
public class CommonHouseBuilder extends BuildingBuilder {

    public CommonHouseBuilder() {
        super();
        super.building = new CommonHouse();
    }

    @Override
    public boolean buildBasic(int deep) {
        // 地基深度不得小于5
        super.building.setBasicDeep(deep);
        return (deep>=5);
    }

    @Override
    public boolean buildWalls(int height) {
        // 高度不得大于20，且不得大于地基的3倍高
        super.building.setWallsHeight(height);
        return (height<=20&&height<=(super.building.getBasicDeep()*3));
    }

    @Override
    public boolean buildRoof(RoofType roofType) {
        // 不能用圆顶
        super.building.setRoofType(roofType);
        return (RoofType.DOME!=roofType);
    }

}
