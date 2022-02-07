# Factory Pattern

O padrão *factory* é um dos mais utilizados em Java.
Esse tipo de padrão de projeto é um padrão criacional,
e é uma das melhores maneiras de criar objetos.  
No padrão *factory*, criamos objetos sem expor a lógica
de criação, e as referências aos objetos recém criados
é feita através de uma interface comum.

## Implementação

No exemplo, é criada a interface Shape, e classes concretas
implementando a interface. O próximo passo foi criar
uma fábrica de Shapes (ShapeFactory).   
A classe FactoryPatternDemo usará essa fábrica para
obter as Shapes que necessita, passando as informações
que precisa para cada objeto criado (CIRCLE / RECTANGLE
/ SQUARE).

![img](https://www.tutorialspoint.com/design_pattern/images/factory_pattern_uml_diagram.jpg)





