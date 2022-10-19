import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recipe {

    private String nameRecipe;
    private List<Product> productRecipeList=new ArrayList<>();

    public Recipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;

    }

    public void addProductToRecipe(Product product) {
        productRecipeList.add(product);
    }
    public String getNameRecipe() {
        return nameRecipe;
    }

    public List<Product> getProductRecipeList() {
        return productRecipeList;
    }

    @Override
    public String toString() {
        return "Рецепт{" +
                "название='" + nameRecipe + '\'' +
                ", список продуктов=" + productRecipeList.toString() +
                '}';
    }
}
