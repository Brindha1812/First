public class Constructor1
{
    int age;
    String name;
    Constructor1()
    {
        this.name = "Thea Aathini";
        this.age = 2;
    }
    Constructor1(String n, int a)
    {
        this.name = n;
        this.age = a;
    }
    public static void main(String ars[])
    {
        Constructor1 con = new Constructor1();
        Constructor1 obj = new Constructor1("Bharath", 30);
        Constructor1 obj1 = new Constructor1("Brindha", 28);
        System.out.println(obj.name + "  " +obj.age);
        System.out.println(obj1.name + "  " +obj1.age);
        System.out.println(con.name +"  " + con.age);

    }
}
