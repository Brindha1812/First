public class CharRemove
{
    public static void main(String[] args)
    {
        String str = "abc abba bbacdaa ccbaacba caab";
        char[] ch = str.toCharArray();
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        char[] c = new char[30];
        int h;
        for ( h = 0; h < ch.length -1; h++)
        {
            c[h] = ch[h];
        }
        int i, j, temp;
        char a = '@';
        for ( i = 0; i < len - 1; i++)
        {
            for ( j = 0; j < len -1; j++)
            {
                if ( i != j)
                {
                    if(c[i] == ch[j])
                    {
                        sb.deleteCharAt(j);
                    }
                }
            }
        }
        for(i = 0; i < len -1; i++) {
            System.out.print(ch[i] + " ");
            System.out.print(c[i]);
        }
    }
}
