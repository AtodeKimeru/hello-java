# Actividad 2

### Ejercicio 2.1. Definicion de clases

Se requiere un programa que modele el concepto de una persona. Una persona posee nombre, apellido, número de documento de identidad y año de nacimiento. La clase debe tener un constructor que inicialice los valores de sus respectivos atributos.

La clase debe incluir los siguientes métodos:

   

*   Definir un método que imprima en pantalla los valores de los atributos del objeto.
*   En un método main se deben crear dos personas y mostrar los valores de sus atributos en pantalla.


### Ejercicio 2.2. Definición de atributos de una clase con tipos primitivos de datos




Se requiere un programa que modele el concepto de un planeta del sistema solar. Un planeta tiene los siguientes atributos:



*   Un nombre de tipo String con valor inicial de null
*   Cantidad de satelites de tipo int con valor inicial de cero.
*   Masa en kilogramos de tipo double con valor inicial de cero.
* Volumen en kilómetros cúbicos de tipo double con valor inicial de cero.
* diametro en kilómetros de tipo int con valor inicial de cero.
* Distancia media al Sol en millones de kilómetros, de tipo int con valor inicial de cero.
* Tipo de planeta de acuerdo con su tamaño, de tipo enumerado con los siguientes valores posibles: GASEOSO, TERRESTRE y ENANO.
* Observable a simple vista, de tipo booleano con valor inicial false.

La clase debe incluir los siguientes métodos:

* La clase debe tener un constructor que inicialice los valores de sus respectivos atributos.
*  Definir un método que imprima en pantalla los valores de los atributos de un planeta.
* Calcular la densidad un planeta, como el cociente entre su masa y su volumen.
* Determinar si un planeta del sistema solar se considera exterior. Un planeta exterior está situado más allá del cinturón de asteroides. El cinturón de asteroides se encuentra entre 2.1 y 3.4 UA. Una unidad astronómica (UA) es la distancia entre la Tierra y el Sol= 149 597 870 Km.
* En un método main se deben crear dos planetas y mostrar los valores de sus atributos en pantalla. Además, se debe imprimir la densidad de cada planeta y si el planeta es un planeta exterior del sistema solar.


### Ejercicio 2.3. Estado de un objeto
Se requiere un programa que modele el concepto de un automóvil. Un automóvil tiene los siguientes atributos:
* Marca: el nombre del fabricante.
* Modelo: año de fabricación.
* Motor: volumen en litros del cilindraje del motor de un automóvil.
* Tipo de combustible: valor enumerado con los posibles valores de gasolina, bioetanol, diésel, biodiésel, gas natural.
* Tipo de automóvil: valor enumerado con los posibles valores de carro de ciudad, subcompacto, compacto, familiar, ejecutivo, SUV.  
* Número de puertas: cantidad de puertas.
* Cantidad de asientos: número de asientos disponibles que tiene el vehículo.
* Velocidad máxima: velocidad máxima sostenida por el vehículo en km/h.
* Color: valor enumerado con los posibles valores de blanco, negro, rojo, naranja, amarillo, verde, azul, violeta.y
* Velocidad actual: velocidad del vehículo en un momento dado.

La clase debe incluir los siguientes métodos:

* Un constructor para la clase Automóvil donde se le pasen como parámetros los valores de sus atributos. u Métodos get y set para la clase Automóvil.
* Métodos para acelerar una cierta velocidad, desacelerar y frenar (colocar la velocidad actual en cero). Es importante tener en cuenta que no se debe acelerar más allá de la velocidad máxima permitida para el automóvil. De igual manera, tampoco es posible desacelerar a una velocidad negativa. Si se cumplen estos casos, se debe mostrar por pantalla los mensajes correspondientes.  
* Un método para calcular el tiempo estimado de llegada, utilizando como parámetro la distancia a recorrer en kilómetros. El tiempo estimado se calcula como el cociente entre la distancia a recorrer y la velocidad actual.
* Un método para mostrar los valores de los atributos de un Automóvil en pantalla.
* Un método main donde se deben crear un automóvil, colocar su velocidad actual en 100 km/h, aumentar su velocidad en 20 km/h, luego decrementar su velocidad en 50 km/h, y después frenar. Con cada cambio de velocidad, se debe mostrar en pantalla la velocidad actual.


### Ejercicio 2.4: Clases sobre figuras geométricas


Se requiere un programa que modele varias figuras geométricas: el círculo, el rectángulo, el cuadrado y el triángulo rectángulo.


‣  El círculo tiene como atributo su radio en centímetros

‣  El rectángulo, su base y altura en centímetros

‣  El cuadrado, la longitud de sus lados en centímetros.

‣ El triángulo, su base y altura en centímetros.





Se requieren métodos para determinar el área y el perímetro de cada figura geométrica. Además, para el triángulo rectángulo se requiere

‣ Un método que calcule la hipotenusa del rectángulo

‣ Un método para determinar qué tipo de triángulo es:

*   Equilátero: todos sus lados son iguales 
* Isósceles: tiene dos lados iguales.
*   Escaleno: todos sus lados son diferentes


Se debe desarrollar una clase de prueba con un método main para crear las cuatro figuras y probar los métodos respectivos.



### Ejercicio 2.5: clase CuentaBancaria


Se requiere un programa que modele una cuenta bancaria que posee los
siguientes atributos:

\
‣ Nombres del titular.


‣ Apellidos del titular.


‣ Número de la cuenta bancaria


‣ Tipo de cuenta: puede ser una cuenta de ahorros o una cuenta
corriente.


‣ Saldo de la cuenta

\
Se debe definir un constructor que inicialice los atributos de la clase
Cuando se crea una cuenta bancaria, su saldo inicial tiene un valor de cero.

\
En una determinada cuenta bancaria se puede:

\
‣ Imprimir por pantalla los valores de los atributos de una cuenta
bancaria.


‣ Consultar el saldo de una cuenta bancaria.


‣ Consignar un determinado valor en la cuenta bancaria, actualizando el saldo correspondiente.


‣ Retirar un determinado valor de la cuenta bancaria, actualizando
el saldo correspondiente. Es necesario tener en cuenta que no se
puede realizar el retiro si el valor solicitado supera el saldo actual
de la cuenta
