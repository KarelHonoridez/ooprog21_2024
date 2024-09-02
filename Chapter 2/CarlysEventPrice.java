import java.util.Scanner;


public class CarlysEventPrice{

public static void main(String[] args) 
    { 
        Scanner g = new Scanner(System.in);
        System.out.println("Number of guest: ");
        int guest = g.nextInt();
        int PRICE_PER_GUEST = 35;

        int total =  guest * PRICE_PER_GUEST;
        System.out.println("***************************************");
        System.out.println("* Carly's makes the food that makes   *");
        System.out.println("*           it a party.               *");
        System.out.println("***************************************");


        System.out.println("Number of guest: " + guest);
        System.out.println("Price per guest: " + PRICE_PER_GUEST);
        System.out.println("Total price: " + total);

        int largeEventGuest = 50;
        if (guest >= largeEventGuest)
        {
            System.out.println("Large event: Yes");

        } else {System.out.println("Large event: No");


        }

        
}
}
