package br.com.exp.padroesprojeto.adapter;

/** <b>Padrão Adapter</b>
 *  <p>
 *  Passo 1 - Criar interfaces
 *  MediaPlayer e AdvancedMediaPlayer
 */

public interface MediaPlayer {
    void play(String audioType, String fileName);
}