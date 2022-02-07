package br.com.exp.padroesprojeto.singleton;

/** <b>Padrão Singleton</b>
 *  <p>
 *  Passo 1 - Criar uma classe Singleton
 */

public class SingleObject {

    //cria um objeto SingleObject
    private static SingleObject instance = new SingleObject();

    //torna o construtor privado para que a classe não seja
    //instanciada
    private SingleObject(){}

    //Retorna o único objeto disponível
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton funfando!");
    }
}