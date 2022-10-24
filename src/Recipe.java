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
    private Map<Product, Float> produkts=new HashMap<>();


    public Recipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
        this.summa = summa;
        if (this.nameRecipe == null|| this.nameRecipe.isEmpty()||this.nameRecipe.isBlank()) {
            throw new NullPointerException("Не корректно указано название рецепта");
        }

    }
    public void priceRecipe() {
        float s=0;
       for ( Map.Entry<Product, Float> produkt : produkts.entrySet()) {
            s=s+ produkt.getKey().getUnitPrice()*produkt.getValue();
       }

     System.out.println("общая сумма на продукты на рецепт "+ nameRecipe + " = "+ s+ " руб.");
  }
    public String getNameRecipe() {
        return nameRecipe;
    }

    public void addProduct(Product product, Float weght) {

          if (produkts.containsKey(product)) {
           System.out.println(product.getName()+" уже есть в составе рецепта="+nameRecipe+".  Продукт не будет добавлен");

        } else{  produkts.put(product, weght);}



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

        return "рецепт {" +"Название рецепта='" + nameRecipe+" состав"+ produkts;
    }
}
