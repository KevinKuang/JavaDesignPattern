package builder.builder.director;

import builder.builder.builder.BuildingBuilder;
import builder.builder.building.AbstractBuilding;
import builder.builder.building.roof.RoofType;
import builder.builder.excption.BuildException;

/**
 * Created by Kevin on 2020/2/7.
 *
 * @author Kevin
 */
public class StandardBuildingDirector<T extends AbstractBuilding> {
    private BuildingBuilder<T> builder;

    public StandardBuildingDirector(BuildingBuilder builder) {
        this.builder = builder;
    }

    public T build (int basicDeep, int wallsHeight, RoofType roofType){
        System.out.println("basicDeep = " + basicDeep);
        if (!builder.buildBasic(basicDeep)){
            System.out.println("建造失败了，地基不符合要求");
            throw new BuildException("地基不符合要求");
        }
        System.out.println("wallsHeight = " + wallsHeight);
        if (!builder.buildWalls(wallsHeight)){
            System.out.println("建造失败了，墙壁不符合要求");
            throw new BuildException("墙壁不符合要求");
        }
        System.out.println("roofType = " + roofType);
        if (!builder.buildRoof(roofType)){
            System.out.println("建造失败了，屋顶不符合要求");
            throw new BuildException("屋顶不符合要求");
        }
        System.out.println("建造成功");
        return builder.getBuilding();
    }
}
