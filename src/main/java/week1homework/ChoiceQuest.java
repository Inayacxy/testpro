package week1homework;

import org.junit.jupiter.api.Test;

public class ChoiceQuest {

    //  No.6
    double d1 = 123.4;
    float f2 = 1.23F;
    //    float f3 = 1.23;
    float f4 = 1.23f;

    @Test
    public void no7() {
        // No.7
        char c1 = '1';
//    char c2 = '12';
        char c3 = '\n';
        char c4 = '\u0043';
        System.out.println("c1:" + c1 + " c3:" + c3 + " c4:" + c4);
        String test = "\u0041\u0042\u0043\u0044";
        System.out.println(test);
    }

    @Test
    public void no8() {
        short s1 = 1;

        byte b1 = 2;
        byte b2 = (byte) (s1 + b1);
        byte b3 = (byte) (b1 + b1);

        int i1 = 2;
        int i2 = s1 + i1;

        long lo1 = 2;
        long lo2 = s1 + lo1;

        float f1 = 2;
        float f2 = s1 + f1;

    }

    @Test
    public void No9(){
        int num = 10;
        byte zijie = 2;
        long lo1 = 121;
//        byte b = 12;
//        float f1 = (float)(b + 12.3);

    }

    @Test
    public void No10(){
        String str = "结果是";
        boolean flag = true;
        System.out.println(str+flag);
    }

}
