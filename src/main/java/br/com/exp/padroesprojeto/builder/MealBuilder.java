package br.com.exp.padroesprojeto.builder;

/** <b>Padrão Builder</b>
 *  <p>
 *  Passo 6 - Criar a classe <i>MealBuilder</i>
 *  a classe responsável por criar objetos Meal
 */

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
