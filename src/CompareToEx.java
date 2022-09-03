public class CompareToEx
{
    public static void main(String args[])
    {
        String str1 = "My name is Brindha";
        String str2 = "My name is Thea";
        char[] str3 = {'T', 'i', 'm', 'e', ' ', 'p', 'r', 'e', 'c', 'i', 'o', 'u', 's'};
        String str4 = "";
        str4 =  str4.copyValueOf(str3, 0, 10);
        System.out.println(str4);
        boolean a = str1.toLowerCase().startsWith("brindha", 11);
        System.out.println(a);
        String s1 = "Hi";
        String s2 = "hi";
        String qq = "Hello!";
        String qq1 = "Bonjour!!";
        System.out.println(qq1.compareTo(qq));
        System.out.println(qq1.compareToIgnoreCase(qq));
        System.out.println(qq.compareToIgnoreCase(qq1));
        System.out.println(qq1.equalsIgnoreCase(qq));
        int x = 10;
        char c = 'a';
        String s3 =String.valueOf(x);
        String s4 = String.valueOf(c);
        System.out.println(c + " dog");
        System.out.println(s3 + 10);
        String st = new String("Bless this home");
        String st1 = new String("and people who all come to this home");
        boolean b1 = st.endsWith("home");
        System.out.println(b1);
        boolean b2 = st.endsWith("come");
        System.out.println(b2);
        String sg = "I like Gulab Jamoon, I also like Kesari and Both are delicious";
        String sg1 = "Kesari";
        String sg2 = "like";
        System.out.println(sg.toUpperCase().lastIndexOf("IOU"));
        System.out.println(sg.lastIndexOf(sg1, 40));
        System.out.println(sg.lastIndexOf(sg2));
        System.out.println(sg.length());
        String sn = "Hi         This is Brindha";
        System.out.println(sn.length());
        System.out.println(sn.replace(" ", "").length());
        System.out.println(sn.replace("i","ie").length());
        String sr = "What goes around comes around is a karma around quote from xyz.com by Stephane";
        System.out.println(sr.replaceAll("around","Around"));
        System.out.println(sr.replaceFirst("xyz.*","ABC.net"));
        String gg = "         Bharath  Brindha  Thea  Aathini           ";
        System.out.println(gg);
        System.out.println(gg.trim());
        String gg1 = "Welcome!!";
        System.out.println(gg1.hashCode());
        String ss = "";
        String sss = "Hi";
        String ss1 = "Hello";
        String ss2 = "Hi".intern();
        System.out.println(ss1);
        System.out.println(ss2);
        System.out.println(ss.isEmpty());
        String tt = "Go Easy on me Baby I was still a child ";
        String tt1 = "Easy";
        System.out.println(tt.matches(" .* Baby .*"));
       System.out.println(ss.contentEquals(ss2));
       char[] arr = tt.toCharArray();
       for ( char z : arr)
           System.out.print(z);
    }
}

