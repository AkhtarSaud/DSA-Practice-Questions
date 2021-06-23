import java.util.ArrayList;

abstract class polygon{
    ArrayList list = new ArrayList<double>;
    abstract ArrayList getSides(){};
    abstract getArea(){};
    abstract getPerimeter(){};
}
class square extends hackearth(){
    ArrayList getSides(){
        returns list;
    }

}
-------------------------------------------------------------------


public abstract class Polygon {
    double[] sides;
    Polygon(double[] sides) { this.sides = sides; }
    void grow() {
    for(int i = 0; i < sides.length; i ++) {
    sides[i] ++;
    }
    }
    double getPerimeter() {
    double perimeter = 0;
    for(int i = 0; i < sides.length; i ++) { perimeter += sides[i];}
    return perimeter;
    }
    abstract double getArea();
    }
    
    public class Rectangle extends Polygon {
    Rectangle(double length, double width) {
    super(new double[4]);
    sides[0] = length; sides[1] = width;
    sides[2] = length; sides[3] = width;
    }
    double getArea() { return sides[0] * sides[1]; }
    }

    public class square extends Polygon {
        square(double side) {
        
        sides[0] = length;
        }
        double getPerimeter(){
            return 2 * side;
        }
        double getArea() { return side * side }
        }


    public class Triangle extends Polygon {
    Triangle(double side1, double side2, double side3) {
    super(new double[3]);
    sides[0] = side1; sides[1] = side2; sides[2] = side3;
    }
    double getArea() {
    /* Heron’s formula */
    double s = getPerimeter() * 0.5;
    double area = Math.sqrt(
    s * (s - sides[0]) * (s - sides[1]) * (s - sides[2]));
    return area;
    }
    }


