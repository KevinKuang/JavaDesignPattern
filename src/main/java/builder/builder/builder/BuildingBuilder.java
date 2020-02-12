package builder.builder.builder;

import builder.builder.building.AbstractBuilding;
import builder.builder.building.roof.RoofType;

/**
 * Created by Kevin on 2020/2/7.
 *
 * @author Kevin
 */
public abstract class BuildingBuilder<T extends AbstractBuilding> {

    protected T building;

    /**
     * 打地基
     * @param deep 深度
     * @return 是否合适
     */
    public abstract boolean buildBasic(int deep);

    /**
     * 砌墙
     * @param height 高度
     * @return 是否合适
     */
    public abstract boolean buildWalls(int height);

    /**
     * 盖屋顶
     * @param roofType 屋顶类型
     * @return 是否合适
     */
    public abstract boolean buildRoof(RoofType roofType);

    /**
     * 装修
     * @param detail 装修细节
     */
    public void decorate(String detail){
        this.building.setDecoratedDetail(detail);
    }

    public T getBuilding() {
        return building;
    }
}
