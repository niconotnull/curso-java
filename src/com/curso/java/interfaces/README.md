## ¿Qué es una interfaz?
Una interfaz es una colección de métodos abstractos(sin implementar) y de valores constantes que puede realizar
un objeto determinado, Pero también puede contener valores constantes, es decir atributos con el modificador
static y final, pero es muy importante mencionar y tener en cuenta que una interfaz el que se hace el
comportamiento, que debe hacer un objeto o una clase pero no el cómo es decir no su implementación.

Las clases que implementan esta interfaz tienen que implementar los métodos abstractos y terminar su propia forma 
o lógica de programación cada clase que implementa esa interfaz lo realizará de forma distinta, aquí entra en concepto 
de polimorfismo.

###Diferentes formas de hacer lo mismo (Polimorfismo)

1. Una interfaz es similar a una clase abstracta no permite que ninguno de sus métodos esté implementado
2. Capturar similitudes entre clases no relacionadas sin forzar una relación entre ellas.
3. Es decir definen comportamientos que una o varias clases necesitan implementar
4. Es un tipo de dato de referencia, puede utilizarse como tipo de dato del objeto(argumento de métodos y una 
   declaración de variables) 
5. Se define un protocolo de implementación entre clases y como la interfaz es un tipo de dato de referencia 

###Diseño orientado a interfaces

1. En java las interfaces permiten pasar del estilo de diseño "Orientado a la implementación" a uno "orientado a la
   interfaz".
2. Donde todas las clases acceden a servicio a través de interfaces que son implementadas por clases concretas.
3. Al no depender de clases concretas (Solo de entidades abstractas) nuestro diseño será más reutilizable

### Nota
Un diseño orientado a interfaces hacen que las clases que la utilicen puedan acceder a estos objetos o servicios a 
través de su interfaz que son implementados por clases concretas y al no depender de clases concretas en el tipo de dato.
Nuestro diseño será más reutilizable, escalable y sobre todo fasil de mantener 

###Code
1. ``public inteface class`` : Una clase abstracta se define con el modificador **abstract**