package br.com.exp.padroesprojeto.prototype;

/** <b>Padrão Prototype</b>
 *  <p>
 *  Passo 2 - Criar classes concretas
 *  que extendem a classe abstrata
 */

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
