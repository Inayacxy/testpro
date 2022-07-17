package week2homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Test2
{
    public static void main(String[] args)
    {
        byte b1 = 12;
        short s1= 128;
        int i1 =1234;
        long l1=3434l;

        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);



    }
    @Test
    public void doubleEquals(){
        boolean flag = true;
        int num = 0;
        if((num = 1) > 0){
            System.out.println("runtime if");
        } else {
            System.out.println("runtime else");
        }
    }
    @Test
    public void test_for(){
        int b=0;int c =0;int d =0;int i=0;
        for (i = 0; i < 100; i++) {
            b += 1;
            c += 2;
            if(c > 100){
                System.out.println();
                break;
            }
            if(c > 50){
                continue;
            }
            d += 3;
        }
        System.out.println("b:"+b+",c:"+c+",d:"+d+",i:"+i);
        Arrays.asList();
    }

}
