package builder.builder.building;

import builder.builder.building.roof.RoofType;

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

    public int getBasicDeep() {
        return basicDeep;
    }

    public void setBasicDeep(int basicDeep) {
        this.basicDeep = basicDeep;
    }

    public int getWallsHeight() {
        return wallsHeight;
    }

    public void setWallsHeight(int wallsHeight) {
        this.wallsHeight = wallsHeight;
    }

    public RoofType getRoofType() {
        return roofType;
    }

    public void setRoofType(RoofType roofType) {
        this.roofType = roofType;
    }

    public String getDecoratedDetail() {
        return decoratedDetail;
    }

    public void setDecoratedDetail(String decoratedDetail) {
        this.decoratedDetail = decoratedDetail;
    }

    /**
     * 按门铃
     * @return 门铃的响声
     */
    public abstract String ring();
}
