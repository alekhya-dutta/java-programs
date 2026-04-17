import java.util.Scanner;

class Point {
    int x;
    int y;

    void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    double radius;
    Point p;

    void setCircle(double r, int x, int y) {
        radius = r;
        p = new Point();
        p.setPoint(x, y);
    }

    void display() {
        double area = Math.PI * radius * radius;
        System.out.println("Center: (" + p.x + "," + p.y + ")");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        double r = sc.nextDouble();
        int x = sc.nextInt();
        int y = sc.nextInt();

        c.setCircle(r, x, y);
        c.display();
    }
}
