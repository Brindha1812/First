public class Occurance {
       public static void main(String[] args) {
        String st = " Work hard and do well";
        String ss = st;
        char a = '@';
        String r = String.format("%d", 0);
        System.out.println(r);
        System.out.println(ss);
        char[] ch = st.toCharArray();
        int i, j, temp;
        int len = st.length();
            for (i = 0; i < len - 1; i++)
            {
                temp = 0;
                for(j = 0; j < len-1; j++)
                {
                    if ( st.charAt(i) != a )
                    {
                        if (st.charAt(i) == ss.charAt(j))
                        {
                            temp++;
                            st.charAt(i) = a;
                            ss.charAt(j) = a;
                        }
                    }
                }
                System.out.println("The Number of occurance of " + st.charAt(i) +" is " + temp );
            }
       }
}


