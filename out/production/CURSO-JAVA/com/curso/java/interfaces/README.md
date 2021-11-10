## ¿Qué es una interfaz?
Una interfaz es una colección de métodos abstractos(sin implementar) y de valores constantes que puede realizar
un objeto determinado, Pero también puede contener valores constantes, es decir atributos con el modificador
static y final, pero es muy importante mencionar y tener en cuenta que una interfaz el que se hace el
comportamiento, que debe hacer un objeto o una clase pero no el cómo es decir no su implementación.

Las clases que implementan esta interfaz tienen que implementar los métodos abstractos y terminar su propia forma 
o lógica de programación cada clase que implementa esa interfaz lo realizará de forma distinta, aquí entra en concepto 
de polimorfismo.

###Diferentes formas de hacer lo mismo

1. Una interfaz es similar a una clase abstracta que no permite que ninguno de sus métodos esté implementado
2. Capturar similitudes entre clases no relacionadas sin forzar una relación entre ellas.
3. Es decir definen comportamientos que una o varias clases necesitan implementar
4. Es un tipo de dato de referencia, puede utilizarse como tipo de dato del objeto(argumento de métodos y una 
   declaración de variables) 
5. Se define un protocolo de implementación entre clases y como la interfaz es un tipo de dato de referencia 
   