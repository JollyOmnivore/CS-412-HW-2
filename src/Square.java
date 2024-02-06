public class Square extends Shape {
    @Override
    double area() {
        double area = size * size;
        return area;
    }

    @Override
    double perimeter() {
        double perimeter = size + size + size + size;
        return perimeter;
    }
}