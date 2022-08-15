import java.util.*;

abstract class Shape {
    public int x, y;

    public abstract void printArea();
}

class Rectangle extends Shape {
    public void printArea() {
        float area = x * y;
        System.out.println("Area of rectangle is " + area);
    }
}

class Triangle extends Shape {
    public void printArea() {
        float area = (x * y) / 2.0f;
        System.out.println("Area of Triangle is " + area);
    }
}

class Circle extends Shape {
    public void printArea() {
        float area;
        area = 3.14159f * x * x;
        System.out.println("Area of CIrcle is " + area);
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        int c;
        Scanner in = new Scanner(System.in);
        System.out.println("Menu \n 1.Area of Rectangle \n 2.Area of Traingle \n 3.Area of Circle ");
        System.out.print("Enter your choice : ");
        c = in.nextInt();
        switch (c) {

            case 1:
                System.out.println("Enter length and breadth for Rectangle ");
                Rectangle r = new Rectangle();
                r.x = in.nextInt();
                r.y = in.nextInt();
                r.printArea();
                break;

            case 2:
                System.out.println("Enter bredth and height for Triangle");
                Triangle t = new Triangle();
                t.x = in.nextInt();
                t.y = in.nextInt();
                t.printArea();
                break;

            case 3:
                System.out.println("Enter radius ");
                Circle ci = new Circle();
                ci.x = in.nextInt();
                ci.printArea();
                break;

            default:
                System.out.println("Enter correct choice");
        }
    }
}
