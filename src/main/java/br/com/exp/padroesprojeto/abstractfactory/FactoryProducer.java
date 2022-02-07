package br.com.exp.padroesprojeto.abstractfactory;

/** <b>Padrão Abstract Factory</b>
 *  <p>
 *  Passo 5 - Criar um  gerador de Factories
 *  para criar fábricas passando informações
 *  como o tipo de Shape desejado
 */

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}
