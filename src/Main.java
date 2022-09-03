public class Main
{

    /*
    Whether a String is an IP Address or not IPv4
    xxx.xxx.xxx.xxx
    0-255
    255.255.254.0 = true
    266.0.1.1 = false

     */
    public static void main( String[] args)
    {
       // System.out.println(addLeadingZero(String.valueOf(123)));
        System.out.println(removeLeadingZero(String.valueOf(000000123)));
    }
    public static String removeLeadingZero(String number)
    {
        int len = number.length();
        String temp = "";
        if(len > 9)
        {
            System.out.println("Invalid Input");
            return null;
        } else
        {
            for( int i =1 ; i<=(9-len); i++)
            {
                temp = temp + "0";
            }
            return ( temp+number);
        }

    }
}
