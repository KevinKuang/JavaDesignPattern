package builder.builder.building.roof;

/**
 * Created by Kevin on 2020/2/7.
 *
 * @author Kevin
 */
public enum RoofType {
    FLAT_ROOF("平顶"),
    DOME("圆顶"),
    SLOPING_ROOF("坡顶"),
    SPIRE("尖顶");
    private String type;

    RoofType(String type) {
        this.type = type;
    }
}
