package Day02.oop_2_fengzhuang_set_get;


import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Student stu = new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("输入年龄");
        int a=sc.nextInt();
        stu.setAge(a);
        stu.name="mm";
        stu.eat();

    }
}
