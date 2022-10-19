//Создайте класс рецептов, который содержит поля:
//
//        Множество продуктов.
//        Суммарная стоимость всех продуктов у данного рецепта.
//        Название рецепта.
//        Создайте множество, в котором будут храниться все рецепты. Добавьте в него несколько рецептов.
//        Рецепты не могут иметь одинаковое название — при попытке добавить рецепт с уже занятыми названием необходимо
//        выбросить исключение. Рецепты с разным названием, содержащие одинаковый список продуктов, считаются разными рецептами.

import java.util.Arrays;
import java.util.HashSet;

public class Recipe {
    private String nameRecipe;
    private Product[] products= new Product[0];//перечисление продуктов из расчета по 1 кг.
    private float summa;
    //private Set<ListProduct> produkts=new HashSet<ListProduct>();

    public Recipe(String nameRecipe, Product... products) {
        this.nameRecipe = nameRecipe;
        this.products = products;
    }


//    public Recipe(String nameRecipe, Product...products) {
//        this.nameRecipe = nameRecipe;
//
//        if (this.nameRecipe == null|| this.nameRecipe.isEmpty()||this.nameRecipe.isBlank()) {
//            throw new NullPointerException("Не корректно указано название рецепта");
//        }
//        if (this.summa<=0) {
//            throw new NullPointerException("Не корректно указана стоимость продуктов");
//        }
//    }

    public String getNameRecipe() {
        return nameRecipe;
    }

//    public void addProduct(ListProduct listProduct) {
//        produkts.add(listProduct);
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Recipe recipe = (Recipe) o;
//        return nameRecipe.equals(recipe.nameRecipe) && produkts.equals(recipe.produkts);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(nameRecipe, produkts);
//
//    }
//

    @Override
    public String toString() {
        return "Recipe{" +
                "nameRecipe='" + nameRecipe + '\'' +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
