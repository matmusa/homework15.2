import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("напишите радиус :");
        Circle.area(circle.PI, scanner.nextInt());
        System.out.println("напишите цифру :");
        Circle.circumference(circle.PI, scanner.nextInt());

    }
}