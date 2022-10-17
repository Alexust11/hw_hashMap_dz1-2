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
import java.util.Set;

public class Recipe {
    private String nameRecipe;
    private float summa;
    private Set<ListProduct[]> produkts=new HashSet<ListProduct[]>();


    public Recipe(String nameRecipe, float summa) {
        this.nameRecipe = nameRecipe;
        this.summa = summa;
    }

    public void addProduct(ListProduct... listProduct) {
        produkts.add(listProduct);
    }

    public void getProdukts() {
        for (int i = 0; i < produkts.size(); i++) {
            System.out.println(Arrays.toString(produkts.toArray())); ;
        }


    }

    @Override
    public String toString() {
        return "Recipe{" +
                "nameRecipe='" + nameRecipe + '\'' +
                ", summa=" + summa + '}';
    }
}
