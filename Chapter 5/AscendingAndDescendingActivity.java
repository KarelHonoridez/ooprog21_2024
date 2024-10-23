import java.util.Scanner;

public class AscendingAndDescendingActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Input third number: ");
        int num3 = scanner.nextInt();

        int one, two, three;

        if (num1 <= num2 && num2 <= num3) {
            one = num1;
            two = num2;
            three = num3;
            System.out.println("Ascending order: " + one + ", " + two + ", " + three);
        } else {
            if (num1 >= num2 && num1 >= num3) {
                one = num1;
                if (num2 >= num3) {
                    two = num2;
                    three = num3;
                } else {
                    two = num3;
                    three = num2;
                }
            } else if (num2 >= num1 && num2 >= num3) {
                one = num2;
                if (num1 >= num3) {
                    two = num1;
                    three = num3;
                } else {
                    two = num3;
                    three = num1;
                }
            } else {
                one = num3;
                if (num1 >= num2) {
                    two = num1;
                    three = num2;
                } else {
                    two = num2;
                    three = num1;
                }
            }

            System.out.println("Descending order: " + one + ", " + two + ", " + three);
        }
    }
}
