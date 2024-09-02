import java.util.Scanner;

public class SammysRentalPrice
{
    public static void main(String[] args)
    {
        Scanner g = new Scanner(System.in);
        System.out.print("Number of minutes: ");
        int numberOfMinutes = g.nextInt();

        final int COST_PER_HOUR = 40;
        final int COST_PER_MINUTE = 1;
        final int MINUTE_TO_HOUR = 60;

        double hour = numberOfMinutes / MINUTE_TO_HOUR;
        double minute = numberOfMinutes % MINUTE_TO_HOUR;

        double pricePerHour = hour * COST_PER_HOUR;
        double pricePerMinute = minute * COST_PER_MINUTE;
        double totalPrice = pricePerHour + pricePerMinute;

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun! S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

        System.out.println("Hours: " + hour);
        System.out.println("Minutes: " + minute);
        System.out.println("Total Price: " + totalPrice);
    }
}