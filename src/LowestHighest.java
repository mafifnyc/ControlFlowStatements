import java.util.Scanner;

public class LowestHighest {
    public static void main(String[] args) {
        int highest=Integer.MIN_VALUE, lowest=Integer.MAX_VALUE, num=0;
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.print("Enter a number:");
            num = scan.nextInt();
        }

        if (num > highest) {
            highest = num;
        }
        else if(num < lowest) {
            lowest = num;
        }
        System.out.println(num);

//        System.out.println("Highest number is: " + highest);
//        System.out.println("Lowest number is: " + lowest);
    }
}
