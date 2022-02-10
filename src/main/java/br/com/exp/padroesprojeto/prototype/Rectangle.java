package br.com.exp.padroesprojeto.prototype;

/** <b>Padrão Prototype</b>
 *  <p>
 *  Passo 2 - Criar classes concretas
 *  que extendem a classe abstrata
 */

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
