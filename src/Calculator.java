import java.util.Scanner;

public class Calculator {


    public static void calculator() {
        System.out.println("Enter first num: ");
        Scanner scanner = new Scanner(System.in);
        Scanner scannerOperation = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter sec num: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter operation: ");
        String operation = scannerOperation.nextLine();

            switch (operation) {

                case "+" -> {
                    int res = num1 + num2;
                    System.out.println(res);
                    return;
                }
                case "-" -> {
                    int res = num1 - num2;
                    System.out.println(res);
                    return;
                }
                case "*" -> {
                    int res = num1 * num2;
                    System.out.println(res);
                    return;
                }
                case "/" -> {
                    double res = num1 / num2;
                    System.out.println(res);
                    return;

                }
                case "All", "+,-,*,/" -> {
                    System.out.println((num1 + num2) + ", " + (num1 - num2) + ", " + (num1 * num2) + ",  " + (num1 / num2));
                    return;

                }

            }


    }
}
