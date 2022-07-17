package week2homework;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public class Test1 {


    @Test
    public void no4(){
        int num1 = 60; if (num1 >= 60) {
            System.out.println("1");
        }
        int num2 = 60; if (num1 >= 60) {System.out.println("2");}else {}
        int num3 = 60; if (num1 >= 60) {System.out.println("3");} else if (num1 >= 80) {
            System.out.println("32");
        }
        int num4 = 60; if (num1 >= 60) {System.out.println("4");} else if (num1 >= 80) {
            System.out.println("42");
        } else {
            System.out.println("43");
        }


    }

    @Test
    public void testArithmeticOperator(){
        short s = 20;
//        s = s+22;
        s += 22;
    }

    @Test
    public void testLogicalOperator(){
        boolean flag = true;int num = 0;
        if(flag || (num++>0)){
            if(num>0) System.out.println("||逻辑运算符为非短路运算符");
            else System.out.println("||逻辑运算符为短路运算符");

        }

        if(flag | (num++>0)){
            if(num>0) System.out.println("|逻辑运算符为非短路运算符");
            else System.out.println("|逻辑运算符为短路运算符");
        }
    }

    @Test
    public void testBitwiseOperator(){
        System.out.println(8<<2);
    }
    @Test
    public void testTernaryIf_elseOperator(){
        int a = 0,b = 0; 
        a += 1;
//        (a>b) ? 2:"b大";
        
    }

    @Test
    public void testArrays(){
        Collection collection;
        ArrayList arrayList;
        Map map;
        Array array;
    }
}
