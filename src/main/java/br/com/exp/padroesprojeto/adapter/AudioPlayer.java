package br.com.exp.padroesprojeto.adapter;

/** <b>Padrão Adapter</b>
 *  <p>
 *  Passo 4 - Criar classe concreta
 *  implementando a interface MediaPlayer
 */

public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //suporte inbuilt para tocar arquivos mp3
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        //mediaAdapter providencia suporte para outros formatos de áudio
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

        else{
            System.out.println("Invalid media: " + audioType + " format not supported");
        }
    }
}