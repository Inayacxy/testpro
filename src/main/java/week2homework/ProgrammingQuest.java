package week2homework;

import java.util.Scanner;

public class ProgrammingQuest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("请输入年份，如：1998年，结束请输入“1”。");
            String input = scanner.nextLine();
            char[] zodiac = "鼠牛虎兔龙蛇马羊猴鸡狗猪".toCharArray();
            try{
                if(input.equals("1")) break;
                int year = Integer.valueOf((input).substring(0, 4));
                switch(year % 12){
                    case 4 :System.out.println(zodiac[0]+"年");
                        break;
                    case 5 :System.out.println(zodiac[1]+"年");
                        break;
                    case 6 :System.out.println(zodiac[2]+"年");
                        break;
                    case 7 :System.out.println(zodiac[3]+"年");
                        break;
                    case 8 :System.out.println(zodiac[4]+"年");
                        break;
                    case 9 :System.out.println(zodiac[5]+"年");
                        break;
                    case 10 :System.out.println(zodiac[6]+"年");
                        break;
                    case 11 :System.out.println(zodiac[7]+"年");
                        break;
                    case 0 :System.out.println(zodiac[8]+"年");
                        break;
                    case 1 :System.out.println(zodiac[9]+"年");
                        break;
                    case 2 :System.out.println(zodiac[10]+"年");
                        break;
                    case 3 :System.out.println(zodiac[11]+"年");
                        break;
                }
            } catch (NumberFormatException e1){
                System.out.println("输入的格式不正确，请重新输入");
            } catch (StringIndexOutOfBoundsException e2){
                System.out.println("输入内容不能为空，请重新输入");
                Scanner scanner1;
            }
        }



    }
}
