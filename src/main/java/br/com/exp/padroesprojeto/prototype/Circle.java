package br.com.exp.padroesprojeto.prototype;

/** <b>Padrão Prototype</b>
 *  <p>
 *  Passo 2 - Criar classes concretas
 *  que extendem a classe abstrata
 */

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
