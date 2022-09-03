interface MyFirstInterface
{
    public void method1();
    public void method2();
}
class MyInterface implements MyFirstInterface
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
        MyFirstInterface obj = new MyInterface();
        obj.method1();
        obj.method2();
    }
}