package br.com.exp.padroesprojeto.builder;

/** <b>Padrão Builder</b>
 *  <p>
 *  Passo 4 - Criar classes concretas
 *  extendendo <i>Burger</i> e <i>ColdDrink</i>
 */

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }
    @Override
    public String name() {
        return "Chicken Burger";
    }
}