package week3homework;

import org.junit.jupiter.api.Test;

public class ChoiceQuest {
    @Test
    public void Q1(){
//        int num1 = 3; int num2 =2; System.out.println(num1 / num2 * num2);
        //double dou1 = 0; int num1 = 4; int num2 = 2; System.out.println(num1 / num2 + dou1);
        int num1 = -12; int num2 = -5; System.out.println(num1 % num2);
    }
    @Test
    public void Q2(){
    }
    @Test
    public void Q3(){
        boolean a= false,b = true;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!a);
        System.out.println(a^b);
    }

    @Test
    public void Q4(){
        int num1 = 60;
        if (num1 >= 60) {}
        if (num1 >= 60) {}else {}
        if (num1 >= 60) {} else if (num1 >= 80) {} else {}
    }

    @Test
    public void Q5(){
        final char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("高");
            case 'B':
                System.out.println("中");
            case 'C':
                System.out.println("低");
            default:
                System.out.println("未知");
        }

    }

    @Test
    public void Q6(){
        final int  grade = 'B';
        switch (grade) {
            case 'A':
            case 'B':
            case 'C':
                System.out.println("低");
                break;
            default:
                System.out.println("未知");
        }

    }
    @Test
    public void Q8_9_10(){
        int[][] arr4 = new int[3][];
        final int[] numbers = {10, 20, 30, 40, 50};
        for (final int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
        final int[] numbers2 = {10, 20, 30, 40, 50};
        for (final int x : numbers2) {
            if (x == 30) {
                continue;
            }
            System.out.print(x);
            System.out.print(" ");
        }


    }

}
