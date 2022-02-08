package br.com.exp.padroesprojeto.builder;

/** <b>Padrão Builder</b>
 *  <p>
 *  Passo 3 - Criar classes abstratas
 *  implementando a interface <i>Item</i>
 *  e fornecendo funcionalidades padrão
 */

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
    @Override
    public abstract float price();
}
