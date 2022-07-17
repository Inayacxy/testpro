package week4homework;

public class ProgrammingQuest2 {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "str2";
        try{
            System.out.println(str1.equals(str2));
        } catch (NullPointerException e){
            System.out.println("发生空指针异常");
        } finally {
            System.out.println("程序结束");
        }

    }
}
