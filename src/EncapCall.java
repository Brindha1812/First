public class EncapCall
{
    public static void main(String[] args)
    {
        MyEncapsulation encap = new MyEncapsulation();
        encap.setEmpssn(1111);
        encap.setEmpname("Thea Aathini");
        System.out.println(encap.getEmpssn());
        System.out.println(encap.getEmpname());
    }
}
