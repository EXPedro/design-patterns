package br.com.exp.padroesprojeto.adapter;

/** <b>Padrão Adapter</b>
 *  <p>
 *  Passo 2 - Criar classes concretas
 *  implementando a interface
 */

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        //n faz nada
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Tocando arquivo mp4. Nome: "+ fileName);
    }
}
