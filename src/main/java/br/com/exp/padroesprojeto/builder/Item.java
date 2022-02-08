package br.com.exp.padroesprojeto.builder;

/** <b>Padrão Builder</b>
 *  <p>
 *  Passo 1 - Criar uma interface
 *  representa o item do lanche
 */

public interface Item {
    String name();
    Packing packing();
    float price();
}
