package br.com.exp.padroesprojeto.abstractfactory;

/** <b>Padrão Abstract Factory</b>
 *  <p>
 *  Passo 6 - Usar a FactoryProducer para
 *  criar a AbstractFactory com o intuito
 *  de criar fábricas das classes concretas
 *  fornecendo informações como o tipo desejado
 */

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //cria uma fábrica de Shape
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        //cria um objeto de Shape Rectangle
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //chama o método draw de Shape Rectangle
        shape1.draw();
        //cria um objeto de Shape Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        //chama o método draw de Shape Square
        shape2.draw();
        //cria uma fábrica de Shape (Rounded)
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //cria um objeto de Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        //chama o método draw de Shape Rectangle
        shape3.draw();
        //cria um objeto de Shape Square
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        //chama o método draw de Shape Square
        shape4.draw();
    }
}