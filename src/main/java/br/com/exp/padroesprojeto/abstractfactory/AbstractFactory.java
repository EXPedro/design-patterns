package br.com.exp.padroesprojeto.abstractfactory;

/** <b>Padrão Abstract Factory</b>
 *  <p>
 *  Passo 3 - Criar uma classe abstrata para gerar fábricas
 *  de objetos Shape dos tipos Normal e Rounded.
 */

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType) ;
}
