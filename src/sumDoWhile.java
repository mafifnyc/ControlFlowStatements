import java.util.Scanner;

public class sumDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        int sum = 0;
        char op;
        do {
            System.out.println("Enter Two Numbers:");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            sum = sum + num1 + num2;
            System.out.println("Perform another operation? Y/N");
            op = scan.next().charAt(0);
        }
        while(op=='Y' || op=='y');
        System.out.println("Sum is: " +sum);

    }
}
