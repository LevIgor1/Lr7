import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Task1()
        Task2();
    }

    static void Task1(){
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

    static void Task2(){
        Card[] cards = {
                new Card(CardType.Visa, "123749375432956".toCharArray(), new Date(2024, 3, 2), "321".toCharArray(), "1111".toCharArray(), 12000),
                new Card(),
                new Card(CardType.MasterCart, "4937503059482734".toCharArray(), new Date(2025, 5, 1), "V92".toCharArray(), "0192".toCharArray(), 5000)
        };
        User Ivan = new User("Хамов Іван Сергійович", new Date(2005, 11,2), cards);
        System.out.println(Ivan.toString());
    }
}