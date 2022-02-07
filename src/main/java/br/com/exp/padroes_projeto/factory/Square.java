package br.com.exp.padroes_projeto.factory;

/** <b>Padrão Factory</b>
 *  <p>
 *  Passo 2 - Criar classes concretas implementando a interface.
 *  <p>
 */

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
