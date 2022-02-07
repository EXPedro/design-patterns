package br.com.exp.padroesprojeto.abstractfactory;

/** <b>Padrão Abstract Factory</b>
 *  <p>
 *  Passo 2 - Criar classes concretas implementando a interface.
 */

public class RoundedRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
