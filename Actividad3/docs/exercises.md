## 1- Ejercicio 8.2
### Enunciado: Notas
Se requiere desarrollar un programa con interfaz gráfica de usuario que 
genere una ventana donde se solicite el ingreso de cinco notas obtenidas 
por un estudiante.
El programa debe calcular y mostrar en la parte inferior de la ventana 
los siguientes datos:
- El promedio de notas ingresadas.
- La desviación estándar de las notas ingresadas.
- La mayor nota obtenida.
- La menor nota obtenida


## 2- Ejercicio 8.3
### Gestión de eventos
Los usuarios realizan acciones sobre componentes de la interfaz gráfica. La 
realización de estas acciones genera eventos que deben ser procesados por 
el programa. Los componentes de la interfaz gráfica “deben estar atentos” 
para gestionar los eventos generados. Para ello, tienen asociados unos objetos 
denominados oyentes o listeners (Morelli y Walde, 2012).

Los listeners son interfaces Java incluidos en el paquete que se deben 
importar: 
java.awt.event.*;
Los componentes que procesan los eventos deben implementar la in
terfaz ActionListener, que incluye el método actionPerformed(ActionEvent e), 
el cual debe ser implementado.
Los eventos pueden ser de bajo nivel o semánticos (Schildt, 2018):
- Los eventos de bajo nivel: representan entradas o interacciones de 
bajo nivel con la GUI. Por ejemplo, cambio de tamaño de un compo
nente, de foco, etc.
- Los eventos semánticos: encapsulan la semántica del modelo del 
componente. Por ejemplo, cambiar el estado de un componente, 
seleccionar un ítem, etc.

### Enunciado: Persona
Se requiere desarrollar un programa con interfaz gráfica de usuario que 
permita calcular el volumen y superficie de varias figuras geométricas. Las 
figuras geométricas son el cilindro, la esfera y la pirámide.
- Para el cilindro se solicitan su radio y altura (en centímetros).
- Para la esfera, su radio (en centímetros).
- Para la pirámide, su base, altura y apotema (en centímetros).

Una vez ingresados estos datos, el programa calcula el volumen y 
superficie de cada figura. Para desarrollar el programa se debe crear una 
jerarquía de clases para las diferentes figuras geométricas requeridas.


