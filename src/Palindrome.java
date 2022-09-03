public class Palindrome {

        public static void main(String[] args)
        {
          //  Main test = new Main();
            int a = 707, count = 0;
            while (a != 0 )
            {
                a = a/10;
                ++count;
            }
            System.out.println("The given number length is " + count);
            a = 707;
            isPalindrome(a);

        }
        public static void isPalindrome(int a)
        {

            int temp, x, y, z;
            x =  (a%10)*100;
            y =  (a%100)*10;
            z =  (a/100);
            int rev = x+y+z;
            if ( a == rev )
                System.out.println("The given num " + a + " is palindrome" );
            else
                System.out.println("The given num " + a + " is not a palindrome" );

        }

}
