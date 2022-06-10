import java.util.Scanner;

public class SwitchGrade {
    public static void main(String[] args) {

    String grade;
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter Grade: ");
        grade = scan.next();

    switch(grade) {
        case "A+":
            System.out.println("Excellent");
            break;
        case "A":
            System.out.println("Very Good");
            break;
        case "B":
            System.out.println("Good");
            break;
        case "C":
            System.out.println("Fair");
            break;
        case "D":
            System.out.println("Can do Better");
            break;
        default:
            System.out.println("Fail");
    }


    }
}
