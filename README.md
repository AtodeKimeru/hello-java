# hello-java
## Para ejecutar los programas

Compila y ejecuta un programa específico usando maven:

```bash
mvn compile exec:java -Dexec.mainClass="EjercicioNo4"
mvn compile exec:java -Dexec.mainClass="EjercicioNo12"
mvn compile exec:java -Dexec.mainClass="EjercicioNo14"
mvn compile exec:java -Dexec.mainClass="EjercicioNo17"
```

## Ejecutar las pruebas

Ejecuta todas las pruebas:

```bash
mvn test
```

O una prueba específica:

Ejemplo:
```bash
mvn test -Dtest=EjercicioNo4Test
```