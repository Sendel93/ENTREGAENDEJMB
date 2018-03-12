package Ejercicio2_2;

/**
 *
 * @author Juan Martin Belda
 */
public class Circle extends Shape {
    public Circle(double size) {
        super(size);
    }
    public double area() {
        double size = getSize();
        return Math.PI*size*size/4.0;
    }
}
