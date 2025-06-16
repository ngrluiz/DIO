/**
 * A simple calculator program that reads two integers and prints their sum.
 */

import java.util.Scanner;
public class Caculadora {

    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Informe o primeiro número: ");
            var value1 = scanner.nextInt();
            System.out.println("Informe o segundo número: ");
            var value2 = scanner.nextInt();
            System.out.printf("%d + %d = %d%n", value1, value2, value1 + value2);
        }

    }
}
