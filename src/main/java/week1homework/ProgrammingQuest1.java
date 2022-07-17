package week1homework;

import java.text.NumberFormat;

public class ProgrammingQuest1 {
    byte v1 = 'a';//1字节 最小值是 -128（-2^7）；最大值是 127（2^7-1）； 默认值是 0；
    short v2 = 'A';//2字节 最小值是 -32768（-2^15）；最大值是 32767（2^15 - 1）；默认值是 0；
                    //Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
    int v3 = 2147483647 + 1;//4字节 最小值是 -2,147,483,648（-2^31）；最大值是 2,147,483,647（2^31 - 1）；默认值是 0 ；
    long v4 = 1L;//8字节 最小值是 -9,223,372,036,854,775,808（-2^63）； 最大值是 9,223,372,036,854,775,807（2^63 -1）；默认值是 0L；
    float v5 =3.14F;//4字节 最大值是 3.4028235E38（2^128 - 1）；最小值是 1.4E - 4（2^-149）默认值是0.0
    double v6 = 3.1415926;//8字节 最大值是 1.7976931348623157E308（2^1024-1）；最小值是 4.9E - 324（2^-1074）默认值是0.0
    char v7 = (char) (' '+v2);//2字节 最小值是u0000(0)；最大值是 uffff(2^16 - 1或65,535)；默认值是0
    boolean v8;//4字节 默认值为false;

    @Override
    public String toString() {
        return "ProgrammingQuest1{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ", v4=" + v4 +
                ", v5=" + v5 +
                ", v6=" + v6 +
                ", v7=" + v7 +
                ", v8=" + v8 +
                '}';
    }

    public static void main(String[] args) {
        ProgrammingQuest1 programmingQuest1 = new ProgrammingQuest1();
        System.out.println(programmingQuest1.v1);
        System.out.println(programmingQuest1.v2);
        System.out.println(programmingQuest1.v3);
        System.out.println(programmingQuest1.v5);
        System.out.println(programmingQuest1.v6);
        System.out.println(programmingQuest1.v7);
        System.out.println(programmingQuest1.v8);

        programmingQuest1.v6 = programmingQuest1.v5;
        System.out.println("将float赋值给double类型后：v6="+programmingQuest1.v6);//精度丢失
        //方法格式化保留位数: 引入NumberFormat(java.text.NumberFormat)
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMinimumFractionDigits(2);
        System.out.println("方法格式化保留位数: v6=" + numberFormat.format(programmingQuest1.v6));
        //System.out.println(programmingQuest1.toString());

    }
}
