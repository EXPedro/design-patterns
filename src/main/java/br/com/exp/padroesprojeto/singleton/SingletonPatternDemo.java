package br.com.exp.padroesprojeto.singleton;

/** <b>Padrão Singleton</b>
 *  <p>
 *  Passo 2 - Recebe o único objeto da classe Singleton
 */

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //Construtor ilegal
        //Erro em tempo de compilação: O construtor de SingleObject() não está visível
        //SingleObject object = new SingleObject();

        //Recebe o único objeto disponível
        SingleObject object = SingleObject.getInstance();

        //mostra a mensagem
        object.showMessage();
    }
}
