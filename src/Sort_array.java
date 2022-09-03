public class Sort_array
{
        public static void main(String[] args)
        {
            String name = "lovers";
            System.out.println("The Original name : " + name);
            char temp;
            int i, j, k, len = name.length();
            for ( i = 0; i < len; i++ )
            {
                for ( j = 0; j < len -i-1; j++ )
                {
                    if ( i != j )
                    {
                        if (name.charAt(i) < name.charAt(j))
                        {
                            temp = name.charAt(i);
//                            name.charAt(i) = name.charAt(j);
//                            name.charAt(j) = temp;
                        }
                    }
                }
            }
            for ( i = 0; i < len; i++)
                System.out.print(name.charAt(i) + " ");
        }
}

