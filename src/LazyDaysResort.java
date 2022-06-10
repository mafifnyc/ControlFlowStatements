import java.util.Scanner;

public class LazyDaysResort {

    public static void main(String[] args) {
        int temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Temperature");
        temp = scan.nextInt();
        if (temp>=95 || temp <=20 ) {
            System.out.println("Shops!!");
        }
        else if (temp >= 80) {
            System.out.println("Swimming");
        }
        else if (temp >= 60) {
            System.out.println("Tennis");
        }
        else if (temp >= 40) {
            System.out.println("Golf");
        }
        else if (temp < 40) {
            System.out.println("Skiing");
        }


    }
}
