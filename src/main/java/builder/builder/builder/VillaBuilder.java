package builder.builder.builder;

import builder.builder.building.Villa;
import builder.builder.building.roof.RoofType;

/**
 * Created by Kevin on 2020/2/7.
 *
 * @author Kevin
 */
public class VillaBuilder extends BuildingBuilder {

    public VillaBuilder() {
        super();
        super.building = new Villa();
    }

    @Override
    public boolean buildBasic(int deep) {
        // 地基深度不得小于3
        super.building.setBasicDeep(deep);
        return (deep>=3);
    }

    @Override
    public boolean buildWalls(int height) {
        // 高度不得大于15，且不得大于地基的4倍高
        super.building.setWallsHeight(height);
        return (height<=20&&height<=(super.building.getBasicDeep()*4));
    }

    @Override
    public boolean buildRoof(RoofType roofType) {
        // 可以使用任意屋顶
        super.building.setRoofType(roofType);
        return true;
    }
}
