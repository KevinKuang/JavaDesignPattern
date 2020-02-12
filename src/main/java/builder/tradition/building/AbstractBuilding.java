package builder.tradition.building;

import builder.tradition.building.roof.RoofType;

/**
 * Created by Kevin on 2020/2/7.
 *
 * @author Kevin
 */
public abstract class AbstractBuilding {
    protected int basicDeep;
    protected int wallsHeight;
    protected RoofType roofType;
    protected String decoratedDetail;

    /**
     * 打地基
     * @param deep 深度
     * @return 是否合适
     */
    protected abstract boolean buildBasic(int deep);

    /**
     * 砌墙
     * @param height 高度
     * @return 是否合适
     */
    protected abstract boolean buildWalls(int height);

    /**
     * 盖屋顶
     * @param roofType 屋顶类型
     * @return 是否合适
     */
    protected abstract boolean buildRoof(RoofType roofType);

    /**
     * 装修
     * @param detail 装修细节
     */
    public void decorate(String detail){
        this.decoratedDetail = detail;
    }

    public void build(int basicDeep, int wallsHeight, RoofType roofType){
        System.out.println("basicDeep = " + basicDeep);
        if (!this.buildBasic(basicDeep)){
            System.out.println("建造失败了，地基不符合要求");
            return;
        }
        this.basicDeep = basicDeep;
        System.out.println("wallsHeight = " + wallsHeight);
        if (!this.buildWalls(wallsHeight)){
            System.out.println("建造失败了，墙壁不符合要求");
            return;
        }
        this.wallsHeight = wallsHeight;
        System.out.println("roofType = " + roofType);
        if (!this.buildRoof(roofType)){
            System.out.println("建造失败了，屋顶不符合要求");
            return;
        }
        this.roofType = roofType;
        System.out.println("建造成功");
    }
}
