package br.com.exp.padroesprojeto.abstractfactory;

/** <b>Padrão Abstract Factory</b>
 *  <p>
 *  Passo 4 - Criar classes Factory
 *  extendendo a AbstractFactory, para gerar
 *  objetos das classes concretas, de acordo
 *  com as necessidades do projeto.
 */

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
