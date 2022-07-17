package week3homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Test;

public class ProgrammingQuest1 {

    @Test
    public void testA(){
        Cylinder cylinder = new Cylinder(2f,10f);
        System.out.println("A."+cylinder);
    }

    @Test
    public void testB(){
        Cylinder cylinder = new Cylinder(2f,10f);
        System.out.println("B."+"底面积：" + cylinder.getBaseArea());
    }

    @Test
    public void testC(){
        Cylinder cylinder = new Cylinder(2f,10f);
        System.out.println("C."+"底面积：" + cylinder.getVolume());
    }

    @Test
    public void testD(){
        //赋值1
        Cylinder cylinder1 = new Cylinder();
        cylinder1.setRadius(2f);
        cylinder1.setHigh(10f);
        //赋值2
        Cylinder cylinder2 = new Cylinder(2f,10f);
    }

    @Test
    public void testE(){
        Cylinder cylinder = new Cylinder(2f,10f);
        System.out.println("E."+"赋值并返回半径：" + cylinder.setRadius(3f).getRadius());
        System.out.println("E."+"赋值并返回高：" + cylinder.setHigh(100f).getHigh());
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Accessors(chain = true)
    static class Cylinder{

        private Float radius;
        private Float high;
        public static final float PI = 3.1415926f;

        public Float getBaseArea(){
            return 2 * this.radius * PI;
        }

        public Float getVolume(){
            return getBaseArea() * this.high;
        }

        @Override
        public String toString() {
            return "Cylinder{" +
                    "radius=" + radius +
                    ", high=" + high +
                    ", base area=" + getBaseArea() +
                    ", volume=" + getVolume() +
                    '}';
        }
    }


}
