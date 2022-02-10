# Prototype  

O padrão *Prototype* consiste em duplicar o objeto, enquanto mantém em mente
a performance. É um padrão de projeto criacional, e este padrão é uma das
melhores maneiras de se criar um objeto.  
Este padrão implementa uma interface de um protótipo, que manda criar um 
clone do objeto atual. Este padrão é utilizado quando a criação do objeto 
utiliza muitos recursos. Por exemplo: um objeto que deve ser criado depois 
de uma custosa operação de banco de dados. Nós podemos criar um cache do
objeto e retornar esse clone nas próximas chamadas e atualizações do banco
de dados, reduzindo as chamadas diretas ao banco de dados.  

## Implementação  

Será criada uma classe abstrata Shape, e classes concretas extendendo-a. O
próximo passo é criar uma classe ShapeCache, que armazenará objetos Shape em
uma *hashtable*, e retornará seus clones, quando requisitados.  

*PrototypePatternDemo* é a nossa classe demo, que usará a ShapeCache para
criar um objeto Shape.  

![Prototype](https://www.tutorialspoint.com/design_pattern/images/prototype_pattern_uml_diagram.jpg)

