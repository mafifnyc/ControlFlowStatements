import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        char operator;
        double num1, num2, result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        num1 = scan.nextInt();
        System.out.println("Enter one of the operators: /,*,-,+");
        operator = scan.next().charAt(0);
        System.out.print("Enter Second Number: ");
        num2 = scan.nextInt();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(result);
                break;
            case '*':
                result= num1 * num2;
                System.out.println(result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(result);
                break;
            default :
                System.out.println("Invalid Operator");
                break;
        }
    }
}
