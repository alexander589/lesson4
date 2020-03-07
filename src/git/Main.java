package git;

public class Main {

    public static void main(String[] args) {

        Figure figure = new Figure();
        figure.draw();

        Circle circle = new Circle();
        circle.draw();

        Square square = new Square();
        square.draw();

        Triangle triangle = new Triangle();
        triangle.draw();

        Parallelepiped parallelepiped = new Parallelepiped();
        parallelepiped.draw();
    }

    public static void drawShape(Figure figure) {

    }
}
