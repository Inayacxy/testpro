package week3homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.*;

public class Test2 {
    int age = 1;

    public void sOut() {
        System.out.println("This is superClass method and value is " + age);
    }

    @Test
    public void testMetaCode() {
        Collection collection;
        ArrayList arrayList;
        Map map;
        Arrays array;
        Object obj;
        Person person = new Person();
        Class<? extends Test2> testPerson = person.getClass();
        System.out.println(person);
        System.out.println(testPerson);
    }

    @Test
    public void duo_tai() {
        Test2 testPerson = new Person();
        testPerson.sOut();
        System.out.println(testPerson.age);
    }

    @Test
    public void test_copy() throws CloneNotSupportedException {
        Person person = new Person(10);
        person.setAge(10);
        Company company = new Company("companyName",person);
        company.setPerson(person);
        System.out.println("company:" + company);
        Company companyClone = (Company) company.clone();
        companyClone.getPerson().setAge(20);
        System.out.println("company:" + company);
    }

    @Test
    public void test_equals(){
        Test2 test = new Test2();
        test.toString();
    }
    @Test
    public void test_exception(){

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person extends Test2 implements Cloneable {
    private int age;

    public void sOut() {
        System.out.println("This is subClass method and value is " + age);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

@Data
@AllArgsConstructor
class Company implements Cloneable {
    private String cName;
    private Person person;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Company clone = (Company) super.clone();
        clone.setPerson((Person) getPerson().clone());
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(cName, company.cName) && Objects.equals(person, company.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cName, person);
    }

    @Override
    public String toString() {
        return "Company{" +
                "cName='" + cName + '\'' +
                ", person=" + person +
                '}';
    }
}