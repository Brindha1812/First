interface Hide
{
    public void method1();
    public void method2();
}
public class InterFirst implements Hide
{

    @Override
    public void method2() {
        System.out.println("Method2 Override ");
    }
    public void method1()
    {
        System.out.println("Method1 Override");
    }
    public static void main( String arg[])
    {
        Hide obj = new InterFirst();
        obj.method1();
        obj.method2();
    }
}