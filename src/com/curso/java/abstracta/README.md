##¿Qué es una clase abstracta?

Una clase abstracta está hecha para la herencia, representa siempre una clase padre de la cual tenemos que extender, pero 
no es un cualquier clase padre si no representa un concepto muy genérico en nuestra aplicación es decir un concepto
abstracto. Por lo tanto es tan conceptual que no se debería de crear una instancia de esta clase sino las instancias
se crean a partir de la clase concreta o las clases hijas que extienden de una clase **abstracta** 

Una clase abstracta deberá tener métodos que también son abstractos es decir métodos que no tienen una implementación, 
cada clase hija va a sobreescribir este método con una implementación única y particular de cada una.

### Características
1. Es cuando tenemos una jerarquía de clases en que algún comportamiento está presente en todas ellas pero se 
mate realiza de formas distintas en cada una
2. El modificador ``abstract`` declara que la clase es una clase **abstracta**
3. Una clase abstracta podría contener métodos abstractos (métodos sin implementación)
4. Una clase abstracta está diseñada para ser una super clase y no puede ejemplarizarse

###Code
1. ``abstract public class`` : Una clase abstracta se define con el modificador **abstract**
2. ``abstract public void registrar();`` : Un método abstracto lleva un modificador **abstract** y son métodos que no
tienen implementación no tienen cuerpo.
3.   

###NOTA
1. Cuando heredamos de una clase padre que es abstracta estamos obligados a implementar sus métodos por contrato.
2. Una clase abstracta puede tener métodos con implementación y métodos sin implementación
3. Cuando una clase tiene un método abstracto la clase se deberá de definir como una clase abstracta
