package br.com.exp.padroesprojeto.prototype;

import java.util.Hashtable;

/** <b>Padrão Prototype</b>
 *  <p>
 *  Passo 3 - Criar classe que cria as classes
 *  concretas do banco de dados e as armazena
 *  em uma Hashtable
 */

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // para cada shape, roda a query do banco de dados e cria shape
    // shapeMap.put(shapeKey, shape);
    // para o exemplo são adicionadas três shapes
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}