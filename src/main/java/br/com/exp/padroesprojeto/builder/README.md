# Builder

O padrão *Builder* constrói um objeto complexo usando objetos 
simples, e usando uma aproximação passo a passo.
Esse tipo de padrão de projeto é do tipo criacional, e fornece
uma das melhores maneiras de se criar um objeto.  
Uma classe *Builder* constrói o objeto final passo a passo. Esse
construtor é independente de outros objetos.  

## Implementação  

Um restaurante *fast-food* onde uma refeição típica poderia ser
um hamburguer (*Burger*) e uma bebida gelada (*ColdDrink*). O hamburguer pode 
ser vegano (*VegBurger*) ou de frango (*ChickenBurger*), e será empacotado numa
embalagem (*Wrapper*) própria. A bebida gelada pode ser coca ou pepsi, e será
colocada em garrafas (*Bottle*).  
Será criado uma interface *Item* representando os lanches (*Meal*), e classes
concretas implementando a interface, e uma interface representando
a embalagem, e classes concretas implementando esta outra interface,
com hamburgueres sendo colocados em suas embalagens, e as bebidas geladas 
sendo colocadas nas garrafas.  
Por fim, é criada uma classe Lanche (*Meal*) tendo um *ArrayList* de Item,
e um LancheBuilder (*MealBuilder*) para construir diferentes tipos de objeto
Lanche, combinando diferentes objetos *Item*. *BuilderPatternDemo* é a nossa
classe de demonstração, e irá usar o (*Meal*)*Builder* para construir um lanche.  

![imbBuilder](https://www.tutorialspoint.com/design_pattern/images/builder_pattern_uml_diagram.jpg)





