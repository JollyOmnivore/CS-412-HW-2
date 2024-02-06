public class Shape {
    String type;
    int size;

    double area() {
        return size;
    }


    double perimeter() {
        return size;
    }

    String getType() {
        return this.type;
    }


    public void setSize(int sz) {
        if (sz > 0) {
            size = sz;
        }
    }

    void setType(String x) {
        this.type = x;

    }

    void print() {
        System.out.println(type + " of size " + size + " has area " + String.format("%.2f",area()) + " perimeter " + String.format("%.2f",perimeter()));
    }
}

