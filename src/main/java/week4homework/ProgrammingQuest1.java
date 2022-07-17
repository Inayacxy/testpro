package week4homework;

import org.junit.jupiter.api.Test;
import java.util.Objects;

public class ProgrammingQuest1 {

    /**
     * other tests
     */
    public void testOthers(){
        Car car = new Car();
        car.toString();
        car = new Car("green","rhinoceros");
        car.toString();
    }


    /**
     * 对equals测试
     */
    @Test
    public void test1(){
        System.out.println("==================test1==================");

        Car car1 = new Car();
        Car car2 = null;
        System.out.println("测试和空对象比较:" + car1.equals(car2));
    }

    @Test
    public void test2(){
        System.out.println("==================test2==================");

        Car car1 = new Car();
        Car car2 = car1;
        System.out.println("测试自反性："+ car1.equals(car2));

    }

    @Test
    public void test3() throws NoSuchFieldException, IllegalAccessException {
        System.out.println("==================test3==================");

        Car car1 = new Car();
        Car car2 = new Car();

        System.out.println("测试不同引用: car1==car2:" + (car1 == car2));
        System.out.println("测试不同引用: car1.equals(car2)" +car1.equals(car2));
    }

    @Test
    public void test4(){
        System.out.println("==================test4==================");

        System.out.println("实例化两个对象，输出两个对象的信息:");
        Car car1 = new Car("green","rhinoceros");
        Car car2 = new Car("green","elephant");
        System.out.println(car1 + "\n" + car2);
        System.out.println("并比较两个对象是否为同一个对象：");
        System.out.println(car1.equals(car2));
        car2.setModel("rhinoceros");
        System.out.println(car1.equals(car2));
    }

    @Test
    public void test5(){//传递性与对称性测试
        System.out.println("==================test5==================");

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = car1;
        System.out.println("对称性测试:" + ((car1.equals(car2)) && (car2.equals(car1))));
        System.out.println("传递性测试:" + (car3.equals(car2)));
    }
}

class Car{
    private String color;
    private String model;

    public Car() {}

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//instanceof可以对null对象直接返回false,先判断是否为同一实例;
        if (!(o instanceof Car) ) return false;//因为Car没有父类，也就没有父子类比较情况，在这里可以使用instanceof不适用getClass()
        Car car = (Car) o;

        //return (getColor().equals(car.getColor())) && (getModel().equals(car.getModel())); 如果有null会抛空指针异常所以使用Objects工具类
        return Objects.equals(getColor(), car.getColor()) && Objects.equals(getModel(), car.getModel());
    }


    /**
     * //每个类自带hashCode()创建类的散列表才有用:
     *      不会创建散列表：创建类的一个对象或对象数组其实不写也不影响equals判断;
     *      会创建散列表：如HashSet, Hashtable, HashMap来存储对象，会影响equals判断。
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getModel());
    }
}