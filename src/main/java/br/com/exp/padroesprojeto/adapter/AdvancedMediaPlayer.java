package br.com.exp.padroesprojeto.adapter;

/** <b>Padrão Adapter</b>
 *  <p>
 *  Passo 1 - Criar interfaces
 *  MediaPlayer e AdvancedMediaPlayer
 */

public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
