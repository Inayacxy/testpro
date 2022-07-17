package week4homework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List list = new ArrayList();
        Arrays arrs;
        try{
            int[] nums = new int[]{1,3,2,6,5};
            Class<?> dualPivotQuicksort = Class.forName("java.util.DualPivotQuicksort");
            Object obj = dualPivotQuicksort.newInstance();
            //1. getMethod("Test",int.class,String.class);
            //2. getMethod("Test",new Class[]{int.class,String.class});
            //      int[] a, int left, int right,
            //      int[] work, int workBase, int workLen)
            Method method = dualPivotQuicksort.getMethod("sort",
                    new Class[]{int[].class,int.class,int.class,
                            int[].class,int.class,int.class});
            method.setAccessible(true);
            method.invoke(nums, 0, nums.length - 1, null, 0, 0);
        } catch (Exception e) {
            // ClassNotFoundException | NoSuchMethodException | InvocationTargetException |
            // InstantiationException | IllegalAccessException
            System.out.println("描述信息：" + e.getMessage());
            e.printStackTrace();

        }

    }
}
