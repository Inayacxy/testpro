package week4homework;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ChoiceQuest {
    @Test
    public void no2(){
        String s="hello";
        String t="hello";
        char c[]={'h','e','l','l','o'};

        //System.out.println(s.equals(t));
        System.out.println(t.equals(c));
        //System.out.println(s == t);
       // System.out.println(t.equals(new String("hello")));

    }
    @Test
    public void no4(){
        String s = null; s.concat("abc");
    }

    //No5
//    public static int aMethod(int i) throws Exception {
//        try{
//            return i/10;
//        }catch(Exception ex){
//            throw new Exception ("exception in a aMothod");
//        }finally{
//            System.out.print("finally");
//        }
//    }
//    public static void main(String [] args) {
//        try{
//            aMethod(0);
//        }catch(Exception ex){
//            System.out.print("exception in main");
//        }
//        System.out.print("finished");
//    }

    @Test
    public void no7(){
        try {
            final int a[] = new int[2];

            System.out.println("Access element three :" + a[3]);
        } catch (final ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
            throw e;
        }
        System.out.println("Out of the block");

    }

    @Test
    public void no8(){
        try {
            throw new IOException();
        } catch (final Exception e) {
        }

        try {
            throw new IOException();
        } catch (final IOException e) {
        }


        try {
            throw new IOException();
        } catch (final RuntimeException re) {
        } catch (final IOException e) {
        }


//        try {
//            throw new IOException();
//        } catch (final RuntimeException e) {
//        }

    }
    @Test
    public void no9(){
        try {
            throw new FileNotFoundException();
        } catch (final NullPointerException | FileNotFoundException e) {
        }

        try {
            throw new FileNotFoundException();
        } catch (final IOException e) {

        }

    }


    public static void main(final String[] args) throws FileNotFoundException {
        throw new FileNotFoundException();

    }


}
