# hello-java

## Estructura del proyecto

Este es un proyecto con proposito académico, en el se encuentran diversos ejercicios de Programación Orientada a Objetos. Se encuentran divididos por carpetas con la siguiente estructura

./
│
├── README.md
├── Actividad1/
│   └── (archivos de Actividad 1)
├── Actividad2/
│   └── (archivos de Actividad 2)
├── Actividad3/
│   └── (archivos de Actividad 3)
├── Actividad4/
│   └── (archivos de Actividad 4)
└── Actividad5/
    └── (archivos de Actividad 5)

Cada directorio es un proyecto de Java y se compila con el uso de Maven

## Instrucciones para abrir cada ejercicio

Para ejecutar cada ejercicio, sigue estos pasos:

1. Abre una terminal en la carpeta correspondiente a la actividad.
	
	- Para Actividad 1:
		```bash
			cd Actividad1/
		```

	- Para Actividad 2:
		```bash
			cd Actividad2/
		```

2. Usa el siguiente comando para compilar y ejecutar el ejercicio deseado:

	 - Para EjercicioNo4:
		 ```bash
		 mvn compile exec:java -Dexec.mainClass="EjercicioNo4" -Dexec.classpath="Actividad1/src/main/java"
		 ```
	 - Para EjercicioNo12:
		 ```bash
		 mvn compile exec:java -Dexec.mainClass="EjercicioNo12" -Dexec.classpath="Actividad1/src/main/java"
		 ```
	 - Para EjercicioNo14:
		 ```bash
		 mvn compile exec:java -Dexec.mainClass="EjercicioNo14" -Dexec.classpath="Actividad1/src/main/java"
		 ```
	 - Para EjercicioNo17:
		 ```bash
		 mvn compile exec:java -Dexec.mainClass="EjercicioNo17" -Dexec.classpath="Actividad1/src/main/java"
		 ```

## Ejecutar las pruebas

<b>Entrar primero a la carpeta de correspondiente a la Actividad</b>

Ejemplo:
```bash
cd Actividad1/
```


Ejecuta todas las pruebas:

```bash
mvn test
```

O una prueba específica:

Ejemplo:
```bash
mvn test -Dtest=EjercicioNo4Test
```