package week3homework;

import lombok.Data;
import org.junit.jupiter.api.Test;

public class ProgrammingQuest2 {
    @Test
    public void test(){
        StudentTest studentTest = new StudentTest("Tom",24,"2020140668",70f);
        studentTest.sOut();
    }


    @Data
    class Person{
        private String name;
        private Integer age;
        public Person(){};
        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
        public String say(){
            return "我叫："+getName()+"，今年"+getAge()+"岁了。";
        }
    }
    @Data
    class Student extends Person{
        private String ID;
        private Float score;
        public Student(){
            super();
        }
        public Student(String name, Integer age,String ID,Float score) {
            super(name, age);
            this.ID = ID;
            this.score = score;
        }
        @Override
        public String say(){
            return "我叫："+getName()+"，今年"+getAge()+"岁了, ID号是："+getID()+"，分数是："+getScore()+"。";
        }
    }

    class StudentTest{
        private String name;
        private Integer age;
        private String ID;
        private Float score;

        public StudentTest(String name, Integer age, String ID, Float score) {
            this.name = name;
            this.age = age;
            this.ID = ID;
            this.score = score;
        }

        public void sOut(){
            Person person = new Person(name,age);
            Person student = new Student(name,age,ID,score);
            System.out.println(person.getClass().getName()+" "+person.say());
            System.out.println(student.getClass().getName()+" "+student.say());
        }
    }




}
