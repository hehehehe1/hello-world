package Day02.oop_2_fengzhuang_set_get;

public class Student {
    String name;
    //成员变量私有化即封装
    private int age;
    //私有化后要提供对应的set/get方法才能使用该私有变量,set设置变量的值，get获取变量值
    public void setAge(int age){
        this.age =age ;
    }
    public int getAge(){
        return age;
    }

    //构造方法 方法名同类名，无需返回值
    public Student(){
        //这是一个无参构造
    }
//    public Student(String name,int age){
//        //这是一个有参构造
//        this.name=name;
//        this.age=age;
//    }

    public void eat(){
        System.out.println(age+"岁的"+name+"在吃饭");
    }
    public void sleep(){
        System.out.println(age+"岁的"+name+"在睡觉");
    }
    public void study(){
        System.out.println(age+"岁的"+name+"在学习");
    }
}
