package task2;

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = scanner.nextInt();
        double side2 = scanner.nextInt();
        double areaCalculator = side1 * side2;
        double perimeterCalculator = 2 * side1 + 2 * side2;
        System.out.println("Area is " + areaCalculator);
        System.out.println("Perimeter is " + perimeterCalculator);
    }
}
