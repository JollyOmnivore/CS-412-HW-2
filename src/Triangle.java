public class Triangle extends Shape{


    @Override
    double area() {

        return(Math.sqrt(3)/(4)*(size*size));
    }


    @Override
    double perimeter() {
        double perimeter = size + size + size;
        return perimeter;
    }
}