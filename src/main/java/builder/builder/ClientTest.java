package builder.builder;

import builder.builder.builder.BuildingBuilder;
import builder.builder.builder.CommonHouseBuilder;
import builder.builder.builder.VillaBuilder;
import builder.builder.building.CommonHouse;
import builder.builder.building.Villa;
import builder.builder.building.roof.RoofType;
import builder.builder.director.DecorateBuildingDirector;
import builder.builder.director.StandardBuildingDirector;
import org.junit.Test;

/**
 * Created by Kevin on 2020/2/7.
 *
 * @author Kevin
 */
public class ClientTest {
    @Test
    public void commonHouseTest() {
        BuildingBuilder builder = new CommonHouseBuilder();
        StandardBuildingDirector<CommonHouse> director = new StandardBuildingDirector<>(builder);
        CommonHouse commonHouse = director.build(5,14, RoofType.SLOPING_ROOF);
        System.out.println(commonHouse.ring());
    }

    @Test
    public void commonHouseDecorateTest() {
        BuildingBuilder builder = new CommonHouseBuilder();
        DecorateBuildingDirector<CommonHouse> director = new DecorateBuildingDirector<>(builder);
        CommonHouse commonHouse = director.build(5,14, RoofType.SLOPING_ROOF,"nice");
        System.out.println(commonHouse.ring());
    }

    @Test
    public void villaTest(){
        BuildingBuilder builder = new VillaBuilder();
        StandardBuildingDirector<Villa> director = new StandardBuildingDirector<>(builder);
        Villa villa = director.build(3,10,RoofType.SPIRE);
        System.out.println(villa.ring());
    }
}
