import java.util.*;


public class ArrListEx
{
    public static void main(String[] args)
    {
        ArrayList<String> arrlist = new ArrayList<String>(Arrays.asList("Bharath", "Brindha", "Thea", "Aathini"));
        System.out.println(arrlist);
        arrlist.add(2, "Thomas");
        for( String name : arrlist)
            System.out.println( "Adding Thomas " +name);
        arrlist.set(2,"Tobby");
        for( String name : arrlist)
            System.out.println("Replacing Thomoas with Tobby : " +name);
        arrlist.remove("Tobby");
        for( String name : arrlist)
            System.out.println("Remove Tobby from ArrayList : " +name);
        String s = arrlist.get(2);
            System.out.println("Getting 2 index value :" +s);
        boolean boo = arrlist.contains("Thea");
            System.out.println("Checking Thea name Present or not :" +s);
        int a = arrlist.size();
        System.out.println("Array Size :" +a);
        int pos = arrlist.indexOf("Aathini");
            System.out.println("Aathini name index : " +pos);

HashMap<String, String> hobj = new HashMap<String, String>();
hobj.put("2","Anuj");
hobj.put("5", "rocky");
for ( Map.Entry m : hobj.entrySet()){
        System.out.println(m.getKey() + " " +m.getValue() );
    }
    }
}