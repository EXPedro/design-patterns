package br.com.exp.padroesprojeto.factory;

/** <b>Padrão Factory</b>
 *  <p>
 *  Passo 3 - Criar uma Fábrica (Factory) para gerar objetos
 *  das classes concretas, de acordo com as informações recebidas
 *  <p>
 */

public class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}