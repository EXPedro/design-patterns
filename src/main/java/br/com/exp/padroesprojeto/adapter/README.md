# Adapter  

O padrão *Adapter* trabalha como uma ponte entre duas interfaces incompatíveis.
Esse tipo de padrão é um padrão estrutural, e combina duas interfaces independentes.  
Esse padrão envolve uma classe única que é responsável em juntar
as funcionalidades de interfaces independentes ou incompatíveis. Um
exemplo da vida real pode ser o caso de um leitor de cartão que age
como um adaptador entre o cartão de memória e o laptop. Você conecta
o cartão de memória em um leitor de cartão, e o leitor de cartão ao
laptop, de modo que o cartão de meória seja lido pelo laptop.  
Estamos demonstrando o uso do padrão *Adapter* através do seguinte exemplo em que
um player de áudio pode tocar apenas arquivos mp3, e gostaria de usar um
player de áudio avançado, capaz de tocar arquivos vlc e mp4.  

## Implementação    

Temos uma interface *MediaPlayer*, e uma classe concreta *AudioPlayer*
implementado-a. *AudioPlayer* pode tocar mp3 por padrão.  
Temos outra interface *AdvancedMediaPlayer* e classes concretas
implementando-a. Essas classes podem tocar os formatos vlc e mp4.  
Nós queremos fazer *AudioPlayer* tocar outros formatos. Para obter
isso, criamos uma classe adapter *MediaAdapter*, que implementa a
interface *MediaPlayer* e usa objetos *AdvancedMediaPlayer* para tocar
o formato desejado.  
*AudioPlayer* usa a classe adapter *MediaAdapter*, passando para ela
o tipo de formato de áudio desejado, sem saber que classe pode tocá-lo.  
*AdapterPatternDemo*, nossa classe demo, irá usar a classe *AudioPlayer*
para tocar vários formatos.  

![Adapter](https://www.tutorialspoint.com/design_pattern/images/adapter_pattern_uml_diagram.jpg)
