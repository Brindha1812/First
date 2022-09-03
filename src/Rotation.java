public class Rotation
{
    // Rotation of an array
       public static void main(String[] args)
       {
            int i, j;
            int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
            int len1 = arr1.length;
            i = len1 - 1;
            System.out.println("Total length of the Array :" + len1 );
            for (j = 0; j <= i ; --i)
            {
                System.out.println(arr1[i]);
            }


        }
}
