class Rectangle {

    double length;
    double breadth;

    void setValues(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {

        Rectangle obj = new Rectangle();

        obj.setValues(12, 6);

        System.out.println("Length: " + obj.length);
        System.out.println("Breadth: " + obj.breadth);
        System.out.println("Area: " + obj.area());
        System.out.println("Perimeter: " + obj.perimeter());
    }
}
