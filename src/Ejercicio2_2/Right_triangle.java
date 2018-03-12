package Ejercicio2_2;

/**
 *
 * @author Juan Martin Belda
 */
public class Right_triangle extends Shape {
    public Right_triangle(double size) {
        super(size);
    }
    public double area() {
        double size = getSize() ;
        return size*size/2;
    }
}
