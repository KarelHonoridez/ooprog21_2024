public class warmup_sleepin {

    public static void main(String[] args) 
    {
        System.out.println("sleepIn(false, false)" + sleepIn(false, false));
        System.out.println("sleepIn(true, false)" + sleepIn(true, false));
        System.out.println("sleepIn(false, true)" + sleepIn(false, true)); 
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) 
    {
        if (weekday == true && vacation == false)
            return false;
        else 
            return true;
    }
}