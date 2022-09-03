public class NewClass {
    public static void main(String args[]) {
        String stt = "Java";
        String stt1 = "Programming";
        String qq = "Java";
        String qq1 = " over and over, I am saying that This is over";
        String stt2 = stt.concat(stt1);
        System.out.println(" Concatination number : " + stt2);
        boolean aa = stt2.contains("ammin");
        System.out.println(aa);
        System.out.println(stt.contentEquals(qq));
        System.out.println(qq1.replace("over", "Time"));
    }
}
