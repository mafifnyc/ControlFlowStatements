import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        double average =0;
        for(int i=10; i>0; i--) {
            System.out.println("Enter number:");
            double num = scan.nextInt();
            sum = sum + num;
            average = sum/10;

        }
        System.out.println(average);
    }
}
