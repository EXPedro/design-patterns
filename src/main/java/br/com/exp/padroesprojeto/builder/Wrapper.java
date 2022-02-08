package br.com.exp.padroesprojeto.builder;

/** <b>Padrão Builder</b>
 *  <p>
 *  Passo 2 - Criar classes concretas
 *  implementando as interfaces
 */

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
