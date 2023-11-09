import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Введіть радіус: ");
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        System.out.println("Введіть x, y: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        Hexagon figure = new Hexagon(r, x, y);
        System.out.println(figure.toString());
        figure.Move(12, -1);
        System.out.println(figure.toString());
    }
}

