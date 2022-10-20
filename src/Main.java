import java.sql.Array;
import java.util.*;

public class Main {

    public static Set<Recipe> recipes = new HashSet<>();// список рецептов
     public static List<Integer> numbers=new ArrayList<>();
    public static int size=20;
    public static Random random = new Random();
    public static void main(String[] args) {
//        Задание 1
//        Напишите простое приложение для формирования списка продуктов.
//                Требования к приложению:
//        Все товары в списке должны быть уникальными. При попытке добавить уже имеющийся продукт необходимо
//        выбросить исключение. Например, если в списке уже есть бананы, то второй раз добавить их нельзя.
//        Каждому продукту помимо названия можно добавить две характеристики: цена и необходимое количество,
//        которое указывается в килограммах.
//        Если какой-то из параметров не заполнен, то программа должна выдавать ошибку и
//        сообщение «Заполните карточку товара полностью».
//        В список продуктов можно добавить новый товар, отметить, что он уже куплен, или удалить его из списка.
//        Названия всех продуктов должны быть на русском языке.
//        Критерии проверки
//        Создан класс Product. Cоздана коллекция, которая содержит в себе продукты.
//        Коллекция удовлетворяет условиям задачи, где объекты не должны повторяться.
//        Добавлены модификаторы доступа. Созданы геттеры и сеттеры для необходимых полей.
//        Методы переопределены.
//        Создано непроверяемое исключение, которое выбрасывает ошибку в случае, если в список добавляется уже имеющийся продукт.
//        Создано непроверяемое исключение, которое выбрасывает ошибку в случае, если данные по объекту заполнены не полностью.


        Product prod1 = new Product("банан", 1.5f,60);
        Product prod2 = new Product("слива", 1, 90);
        Product prod3 = new Product("огурцы", 0.5f, 40);
        Product prod4 = new Product("дыня", 4, 35);
        Product prod5 = new Product("персик", 3.5f, 110);
        Product prod6 = new Product("персик", 3.6f, 120);
           prod1.checkPurchased(true);// метод установки куплен продукт или нет
           prod1.isPurchased();// метод проверки куплен продукт или нет
           prod2.isPurchased();// метод проверки куплен продукт или нет
        ProdList prodList1=new ProdList();
            prodList1.addProductList(prod1);
            prodList1.addProductList(prod2);
            prodList1.addProductList(prod3);
        System.out.println(prodList1);



        System.out.println("________________________________________________");
        Recipe reс1 = new Recipe("салатик 1");
            reс1.addProduct(prod1);
            reс1.addProduct(prod4);
            reс1.addProduct(prod6);
            System.out.println(reс1);
            reс1.priceRecipe();
            System.out.println("__________________________________");
        Recipe reс2 = new Recipe("салатик 2");
            reс2.addProduct(prod1);
            reс2.addProduct(prod2);
            reс2.addProduct(prod3);
            reс2.addProduct(prod3);
            System.out.println(reс2);
            reс2.priceRecipe();
             System.out.println("___________________________________");
        Recipe reс3 = new Recipe("салатик 3");

        Recipe reс4 = new Recipe("салатик 3");

        System.out.println();
        //____________________создание списка рецептов___________________________
            recipes.add(reс1);
            recipes.add(reс3);
            addRecipe(reс2);

//        System.out.println(reс2);
//        System.out.println(reс3);
//        System.out.println("---------------------------------------------");
////_____________________________________________________________________________
//        addRecipe(reс1);
//        addRecipe(reс2);
//        addRecipe(reс4);
//        addRecipe(reс3);
//        System.out.println(recipes);
//
//
//
//
//____________________________________Д/З 2 часть 2____________________________________
//        Создайте множество целых чисел. Заполните множество 20 случайными числами в диапазоне от 0 до 1000.
//        Пройдитесь по всем элементам множества и удалите из него все нечетные значения.
//        Выведите оставшиеся элементы в консоль.

    addNumbers();

    getNumbers();
    numbersProcessing();
    getNumbers();




    }
    public static void numbersProcessing() {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 > 0) {
                numbers.remove(i);
            }
        }
    }
    public static void addNumbers() {
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(1000));
        }

//        for (Double number : numbers) {
//             ;
//       }
    }
    public static void getNumbers() {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("номер= "+i+" :"+numbers.get(i));
        }
    }


    public static void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new NullPointerException("рецепт "+recipe.getNameRecipe()+" уже есть в списке");

        } else{ recipes.add(recipe);}
  }
//



}