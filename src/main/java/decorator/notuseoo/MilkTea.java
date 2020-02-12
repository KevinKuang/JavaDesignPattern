package decorator.notuseoo;

import decorator.tea.JiDiTea;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public class MilkTea {
    private JiDiTea jiDiTea;
    private List<Ingredient> ingredientList;

    public MilkTea(JiDiTea jiDiTea) {
        this.jiDiTea = jiDiTea;
        this.ingredientList = new ArrayList<>();
    }

    public float cost(){
        float price = jiDiTea.getPrice();
        for (Ingredient ingredient: ingredientList) {
            price += ingredient.getPrice();
        }
        return price;
    }

    public MilkTea append(Ingredient ingredient){
        this.ingredientList.add(ingredient);
        return this;
    }
}
