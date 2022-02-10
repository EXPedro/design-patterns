package br.com.exp.padroesprojeto.adapter;

/** <b>Padrão Adapter</b>
 *  <p>
 *  Passo 2 - Criar classes concretas
 *  implementando a interface
 */

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //n faz nada
    }
}
