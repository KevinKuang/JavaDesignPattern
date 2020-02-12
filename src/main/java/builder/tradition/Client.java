package builder.tradition;

import builder.tradition.building.Villa;
import builder.tradition.building.roof.RoofType;
import builder.tradition.building.CommonHouse;

/**
 * Created by Kevin on 2020/2/7.
 *
 * @author Kevin
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build(6,16, RoofType.SLOPING_ROOF);
        Villa villa = new Villa();
        villa.build(6,13,RoofType.FLAT_ROOF);
    }
}
