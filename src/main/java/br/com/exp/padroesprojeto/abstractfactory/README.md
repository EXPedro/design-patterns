# Abstract Factory

O padrão *Abstract Factory* é uma super fábrica que cria outras
fábricas. Esta fábrica é chamada de fábrica das fábricas.
Esse padrão de projeto é uma padrão criacional, e fornece
uma das melhores formas de criar objetos.  
No padrão *Abstract Factory* uma interface é responsável por
criar uma fábrica (*factory*) de objetos, sem explicitamente
especificar suas classes. Cada fábrica gerada pode criar os 
objetos, como no padrão *Factory*.  

## Implementação  

No exemplo, é criada uma interface *Shape*, e uma classe
concreta implementando-a. O próximo passo é criar uma
fábrica abstrata *AbstractFactory*. Então, é criada uma
fábrica de *shapes* (*ShapeFactory*), que a extende. Uma
fábrica para criar/gerar fábricas (*FactoryProducer*) é 
criada.  
*AbstractFactoryPatternDemo*, nossa classe demo, usa a
*FactoryProducer* para receber um objeto *AbstractFactory*.
Ela irá passar as informações (CIRCLE / RECTANGLE / SQUARE)
para receber da *AbstractFactory* o tipo de objeto que 
necessita.

![imgAbstractFactory](https://www.tutorialspoint.com/design_pattern/images/abstractfactory_pattern_uml_diagram.jpg)