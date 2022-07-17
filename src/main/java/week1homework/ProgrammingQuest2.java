package week1homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.junit.jupiter.api.Test;

@Data //this annotation includes @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
@AllArgsConstructor//all args constructor
@EqualsAndHashCode(callSuper = false)//是否考虑父类成员
@Accessors(prefix = "cxy")//忽略前缀,set方法返回对象，另外,chain设置set方法是否返回对象，fluent可以设置getter和setter是否为基础属性名
class Person {
    private String cxyName;
    private String cxySex;
    private Integer cxyAge;
    private StringBuilder cxySelfIntroduction;

}

public class ProgrammingQuest2 {

    Person person = new Person("程雪揚(テイセツヨウ)","男",24,
            new StringBuilder().append("自己紹介させていただきます、どうもありがとうございます")
                    .append("程雪揚ともうします、二十三歳です。\n" +
                            "今年、江苏海洋大学の新卒とうして、専門はソフトウェア工学です、Javaプログラミング言語（げんご）を専攻しております。\n")
                    .append("対日ソフトウェア開発興味があるので、自分の能力をのばしたいです。\n" +
                            "どうぞよろしくお願いします。\n")
                    .append("つよみは前に踏み出す力が強いところです、短所は考えすぎてしまうところです\n"));


    @Test
    public void show(){
        System.out.println("Q:名字是什么？\nA:"+person.getName());
        System.out.println("Q:性别是什么？\nA:"+person.getSex());
        System.out.println("Q:多大了？\nA:"+person.getAge());
        System.out.println("Q:请进行自我介绍？\nA:"+person.getSelfIntroduction());
    }
    public static void test(){

    }
}
