public class Circle extends Shape{
    @Override
    double area() {
        double radius = size;
        double area = radius * radius * Math.PI;
        return area;
    }


    @Override
    double perimeter() {
        double radius = size;
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
