package flyweight;

import java.util.HashMap;

/**
 * Created by Kevin on 2020/2/9.
 *
 * @author Kevin
 */
public class ConcreteWebsiteFactory implements WebsiteFactory {

    private HashMap<String, ConcreteWebsite> pool = new HashMap<>();

    ConcreteWebsite getConcreteWebsiteCategory(String type){
        if (this.pool.containsKey(type)){
            return this.pool.get(type);
        }else {
            ConcreteWebsite website = new ConcreteWebsite(type);
            this.pool.put(type,website);
            return website;
        }
    }
}
