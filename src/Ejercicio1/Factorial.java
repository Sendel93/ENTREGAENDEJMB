package Ejercicio1;

/**
 *
 * @author Juan Martin Belda
 */
public class Factorial{
    public static int calculo( int n ){
        if( n < 0 ){
            throw new IllegalArgumentException("Número " + n + " no puede ser menor que 0");
        }
        int fact = 1;
        for( int i = 2; i <= n; i++ ){
            fact *= i;
        }
        if( fact <= 0 ){ //Es de la unica forma que funcione, sino el overflow no funciona correctamente
            throw new ArithmeticException("Overflow, " + n+ " demasiado grande");
        }
        return fact;
    }
}
