//Создайте класс рецептов, который содержит поля:
//
//        Множество продуктов.
//        Суммарная стоимость всех продуктов у данного рецепта.
//        Название рецепта.
//        Создайте множество, в котором будут храниться все рецепты. Добавьте в него несколько рецептов.
//        Рецепты не могут иметь одинаковое название — при попытке добавить рецепт с уже занятыми названием необходимо
//        выбросить исключение. Рецепты с разным названием, содержащие одинаковый список продуктов, считаются разными рецептами.

import java.util.*;

public class Recipe {
    private Product product;
    private String nameRecipe;
    private float summa;
    private float weght;
    private Map<Float,Product> produkts=new HashMap<>();


    public Recipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
        this.summa = summa;
        if (this.nameRecipe == null|| this.nameRecipe.isEmpty()||this.nameRecipe.isBlank()) {
            throw new NullPointerException("Не корректно указано название рецепта");
        }

    }
//    public float priceRecipe() {
//        float sum=0;
//        sum=sum+product.getUnitPrice()*weght;
//        return  sum;
//    }
    public String getNameRecipe() {
        return nameRecipe;
    }

    public void addProduct(Float wight, Product product) {
        produkts.put(wight,product);
        this.weght=wight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return nameRecipe.equals(recipe.nameRecipe) && produkts.equals(recipe.produkts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe, produkts);
    }

    @Override
    public String toString() {
        ArrayList<Product> values = new ArrayList<>(produkts.values());
        return "рецепт {" +"Название рецепта='" + nameRecipe+" состав"+ values  ;
    }
}
