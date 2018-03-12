package Ejercicio2_2;

/**
 *
 * @author Juan Martin Belda
 */
public class Square extends Shape {
    public Square(double size) {
        super(size);
    }
    public double area() {
        double size = getSize() ;
        return size*size;
    }
}
