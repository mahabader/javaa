package javacode;
import java.util.List;
    import java.util.ArrayList;


public class Javacode {


    public static double calculateSqLength(Point<? extends Number> p) {
        Number n1 = p.getX();
        Number n2 = p.getY();
        double x = n1.doubleValue();
        double y = n2.doubleValue();
        return x * x + y * y;
    }

    public static void main(String[] args) {
        Point<Integer> p = new Point<Integer>(3, 4);
        System.out.println("Point: " + p);
        System.out.println("Square Length: " + calculateSqLength(p));
    }
}

class Point<T extends Number> {
    private T x, y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getX() { return x; }
    public T getY() { return y; }

    public String toString() {
        return "(" + x.toString() + "," + y.toString() + ")";
    }
}