import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class EjercicioNo4Test {    

    @Test
    public void testCirclePerimeter() { 
        Circle testCircle = new Circle(2);
        double expected = 2 * Math.PI * 2;
        assertEquals(expected, testCircle.perimeter(), 0.01);
    }
    
    @Test
    public void testCircleArea() {
        Circle testCircle = new Circle(3);
        double expected = Math.PI * 3 * 3;
        assertEquals(expected, testCircle.area(), 0.01);
    }
    
    @Test
    public void testRectanglePerimeter() {
        Rectangle testRectangle = new Rectangle(5, 3);
        double expected = 2 * (5 + 3);
        assertEquals(expected, testRectangle.perimeter(), 0.01);
    }
    
    @Test
    public void testRectangleArea() {
        Rectangle testRectangle = new Rectangle(5, 3);
        double expected = 5 * 3;
        assertEquals(expected, testRectangle.area(), 0.01);
    }
    
    @Test
    public void testSquarePerimeter() {
        Square testSquare = new Square(4);
        double expected = 4 * 4;
        assertEquals(expected, testSquare.perimeter(), 0.01);
    }
    
    @Test
    public void testSquareArea() {
        Square testSquare = new Square(4);
        double expected = 4 * 4;
        assertEquals(expected, testSquare.area(), 0.01);
    }
    
    @Test
    public void testRightTrianglePerimeter() {
        RightTriangle testTriangle = new RightTriangle(3, 4);
        double hypotenuse = Math.sqrt(3*3 + 4*4); // 5
        double expected = 3 + 4 + hypotenuse;
        assertEquals(expected, testTriangle.perimeter(), 0.01);
    }
    
    @Test
    public void testRightTriangleArea() {
        RightTriangle testTriangle = new RightTriangle(3, 4);
        double expected = (3 * 4) / 2;
        assertEquals(expected, testTriangle.area(), 0.01);
    }
    
    @Test
    public void testRightTriangleHypotenuse() {
        RightTriangle testTriangle = new RightTriangle(3, 4);
        double expected = 5.0;
        assertEquals(expected, testTriangle.hypotenuse(), 0.01);
    }
    
    @Test
    public void testTriangleTypeEquilateral() {
        // Equilateral triangle: all sides equal
        Triangle testTriangle = new Triangle(5, 5);
        assertEquals("Equilátero", testTriangle.triangleType());
    }

    @Test
    public void testTriangleTypeIsosceles() {
        // Isosceles triangle: two sides equal (5-5-3)
        Triangle testTriangle = new Triangle(5, 3);
        assertEquals("Isósceles", testTriangle.triangleType());
    }
    
    @Test
    public void testTriangleTypeScalene() {
        // Scalene triangle: all sides different (3-4-5)
        Triangle testTriangle = new Triangle(3, 4);
        assertEquals("Escaleno", testTriangle.triangleType());
    }
}
