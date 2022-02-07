package br.com.exp.padroesprojeto.factory;

/** <b>Padrão Factory</b>
 *  <p>
 *  Passo 4 - Usar a Fábrica (Factory) para criar objetos
 *  passando informações, como o tipo de Shape que se deseja
 *  <p>
 */

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //cria um objeto Circle e chama seu método "draw".
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //chama o método draw de Circle
        shape1.draw();

        //cria um objeto Rectangle e chama seu método "draw".
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //chama o método draw de Rectangle
        shape2.draw();

        //cria um objeto Square e chama seu método "draw".
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //chama o método draw de square
        shape3.draw();
    }
}
