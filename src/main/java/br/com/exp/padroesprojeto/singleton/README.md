# Singleton  

O padrão *Singleton* é um dos padrões mais simples. Esse tipo
de padrão é um padrão criacional, e fornece uma das melhores 
formas de criar um objeto.  
Esse padrão envolve uma única classe, que é responsável por criar
o próprio objeto enquanto se certifica de que apenas um único
objeto seja criado. Essa classe fornece uma forma de acessar seu
único objeto, que pode ser acessado diretamente, sem a necessidade
de instanciar o objeto.  

## Implementação  

Criada uma classe *SingleObject*, com os construtores privados
e com uma instância estática de si mesma.  
Essa classe possui um método estático, para fornecer essa 
instância estática para o mundo exterior.  
*SinglePatternDemo* será a classe de demonstração utilizada 
para criar um objeto *SingleObject*.

![imgSingleton](https://www.tutorialspoint.com/design_pattern/images/singleton_pattern_uml_diagram.jpg)