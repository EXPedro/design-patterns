package br.com.exp.padroesprojeto.builder;

/** <b>Padrão Builder</b>
 *  <p>
 *  Passo 4 - Criar classes concretas
 *  extendendo <i>Burger</i> e <i>ColdDrink</i>
 */

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
