## ¿Qué es la herencia?
Es una relación de parentesco entre dos clases, una es el padre de la otra, una es hija de la otra.

###Características
1. Es el mecanismo de la programación orientada a objetos para implementar relaciones de jerarquía de clases
2. Una subclase hereda el estado y el comportamiento de todos sus ancestros
3. Es una de las bases de reutilización de código y polimorfismo
4. También es un principio fundamental de a POO

###Parentesco entre clases
No puede existir herencia si no existe alguna relación familiar entre ambas clases!, debe existir una relación literal y 
coherente de padre a hijo

1. Cuando una clase no hereda de otra clase en java de forma implicit y por debajo  hereda de la clase object por lo
 tanto la clase object es la clase padre de todas las clases en java

###Sobre-escritura de métodos
Otra característica de la herencia es poder sobre-escribir un método que heredamos del padre, se puede hacer redefiniendo
en la clase hija un método con el mismo nombre.

1. ``@Override`` : Anotación para indicar y documentar que estamos sobre-escriendo un método del padre
2. Si queremos mantener la funcionalidad y las características del padre y le queremos agregar funcionalidad extra en la
   clase hija también se puede utilizar **super**.

###Restringir la herencia y sobre-escritura de métodos
Para impedir la herencia utilizamos la palabra  **final** como modificador de la clase, por ejemplo esta clase no puede tener
descendencia. Una constante no se puede modificar. Las clases o métodos que tengan el modificador final no se pueden heredar.
``final pulic class Persona{``
   ``[...]``
``}``


###Code
1. ``extends``
2. ``super`` : Super nos permite que una clase hija pueda reutilizar o invocar atributos y métodos de la clase padre,
               para poder utilizar el constructor e inicializar las variables de la clase padre es necesario utilizar 
               **super**.
2. ``this`` : Nos permite utilizar métodos y atributos dentro de la misma clase
2. ``protected`` : Cuando un atributo en la clase padre es protegido en la clase hija se puede acceder, es solamente para herencia
no es necesario acceder a través del **get** o el **set**, todo atributo **protected** en la clase padre es visible y se puede
acceder tanto en la propia clase como en la jerarquía en toda su descendencia de forma directa.

###Nota
1. Los constructores de la clase padre y las clases que heredan del mismo se iran desencadenando
2. Se puede invocar de forma implicita el constructor del padre  **``super();``** esta será la primera línea de un constructor
 de la clase hija que se ejecute.
3. Si se utiliza un constructor que inicializa parámetros de la clase padre se deberá incializar en la clase hija a través **``super("nombre");``**    