// import org.junit.Test;
// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNotNull;


// public class EjercicioNo2Test {    

//     @Test
//     public void testPersonaConstructor() {
//         Persona testPersona = new Persona("Juan", "Pérez", 123456789, 1990);
        
//         assertNotNull(testPersona);
//     }
// }

// import static org.junit.jupiter.api.Assertions.*;

// import org.junit.jupiter.api.Test;

// public class FigurasGeometricasTest {

//     // =========================
//     // TESTS CILINDRO
//     // =========================

//     @Test
//     public void testVolumenCilindro() {
//         Cilindro cilindro = new Cilindro(3, 5);

//         double volumenEsperado = Math.PI * Math.pow(3, 2) * 5;

//         assertEquals(volumenEsperado,
//                      cilindro.calcularVolumen(),
//                      0.001);
//     }

//     @Test
//     public void testSuperficieCilindro() {
//         Cilindro cilindro = new Cilindro(3, 5);

//         double superficieEsperada =
//                 2 * Math.PI * 3 * (3 + 5);

//         assertEquals(superficieEsperada,
//                      cilindro.calcularSuperficie(),
//                      0.001);
//     }

//     @Test
//     public void testDatosCilindro() {
//         Cilindro cilindro = new Cilindro(7, 10);

//         assertEquals(7, cilindro.getRadio());
//         assertEquals(10, cilindro.getAltura());
//     }

//     // =========================
//     // TESTS ESFERA
//     // =========================

//     @Test
//     public void testVolumenEsfera() {
//         Esfera esfera = new Esfera(4);

//         double volumenEsperado =
//                 (4.0 / 3.0) * Math.PI * Math.pow(4, 3);

//         assertEquals(volumenEsperado,
//                      esfera.calcularVolumen(),
//                      0.001);
//     }

//     @Test
//     public void testSuperficieEsfera() {
//         Esfera esfera = new Esfera(4);

//         double superficieEsperada =
//                 4 * Math.PI * Math.pow(4, 2);

//         assertEquals(superficieEsperada,
//                      esfera.calcularSuperficie(),
//                      0.001);
//     }

//     @Test
//     public void testRadioEsfera() {
//         Esfera esfera = new Esfera(9);

//         assertEquals(9, esfera.getRadio());
//     }

//     // =========================
//     // TESTS PIRAMIDE
//     // =========================

//     @Test
//     public void testVolumenPiramide() {
//         Piramide piramide = new Piramide(6, 9, 5);

//         double volumenEsperado =
//                 (Math.pow(6, 2) * 9) / 3.0;

//         assertEquals(volumenEsperado,
//                      piramide.calcularVolumen(),
//                      0.001);
//     }

//     @Test
//     public void testSuperficiePiramide() {
//         Piramide piramide = new Piramide(6, 9, 5);

//         double superficieEsperada =
//                 Math.pow(6, 2) + (2 * 6 * 5);

//         assertEquals(superficieEsperada,
//                      piramide.calcularSuperficie(),
//                      0.001);
//     }

//     @Test
//     public void testDatosPiramide() {
//         Piramide piramide = new Piramide(8, 12, 7);

//         assertEquals(8, piramide.getBase());
//         assertEquals(12, piramide.getAltura());
//         assertEquals(7, piramide.getApotema());
//     }

//     // =========================
//     // TESTS GENERALES
//     // =========================

//     @Test
//     public void testValoresNoNegativos() {
//         Cilindro cilindro = new Cilindro(3, 5);

//         assertTrue(cilindro.calcularVolumen() > 0);
//         assertTrue(cilindro.calcularSuperficie() > 0);
//     }

//     @Test
//     public void testPolimorfismoFigura() {
//         FiguraGeometrica figura = new Esfera(5);

//         assertNotNull(figura);
//         assertTrue(figura.calcularVolumen() > 0);
//         assertTrue(figura.calcularSuperficie() > 0);
//     }
// }
// ```

// ## Requisitos

// Este archivo asume que existen las siguientes clases:

// * `FiguraGeometrica`
// * `Cilindro`
// * `Esfera`
// * `Piramide`

// Y los métodos:

// ```java
// calcularVolumen()
// calcularSuperficie()
// ```

// Además de los getters:

// ```java
// getRadio()
// getAltura()
// getBase()
// getApotema()
// ```

// ## Dependencia Maven para JUnit 5

// ```xml
// <dependency>
//     <groupId>org.junit.jupiter</groupId>
//     <artifactId>junit-jupiter</artifactId>
//     <version>5.10.2</version>
//     <scope>test</scope>
// </dependency>
// ```
