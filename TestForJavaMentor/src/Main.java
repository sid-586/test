import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите арифметическое выражение");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int d = 0;
        int result = 0;
        for (int i = 0; i <= inputString.length(); i++) {
            if (inputString.charAt(i) == '+' || inputString.charAt(i) == '-' || inputString.charAt(i) == '/' || inputString.charAt(i) == '*') {
                d = i;
                break;
            }
        }
        String xString = inputString.substring(0, d).trim();
        String yString = inputString.substring(d + 1).trim();
        int x = new Various().getNumber(xString);
        String xNumeric = new Various().getNumeric(xString);
        int y = new Various().getNumber(yString);
        String yNumeric = new Various().getNumeric(yString);

        if (xNumeric == yNumeric) {
            if (x >= 1 && x <= 10 && y >= 1 && y <= 10) {
                switch (inputString.charAt(d)) {
                    case '+':
                        result = x + y;
                        break;
                    case '-':
                        result = x - y;
                        break;
                    case '/':
                        result = x / y;
                        break;
                    case '*':
                        result = x * y;
                        break;
                }
                System.out.println("Результат");
                System.out.println(result);
            }
        } else {
            System.out.println("Неверный формат ввода");
        }
    }
}
