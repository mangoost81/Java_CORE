package lesson_2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigDecimal a = BigDecimal.valueOf(100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Print num");
        BigDecimal b = scanner.nextBigDecimal();
        System.out.println(b.multiply(a));
    }
}
