package lang.print.gaps.task4;

import java.util.Scanner;

public class FormulaCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int formula1 = (9 * a^a) - (5 * b) + 2 + a - 7;
        int formula2 = (a + b - 4*a*b) / 2;
        int wholeFormula = formula1 * formula2;
        System.out.println(wholeFormula);
    }
}
