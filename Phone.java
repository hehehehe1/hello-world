package Day02.oop_2_fengzhuang_set_get;

public class Phone {
    //一个标准的类中成员都是私有的，并提供对应的getset方法，以及无参和有参的构造方法
    //！！！！其中构造方法与setget可以使用Alt+Inset的快捷键来直接选择输入！！！！

    private String brand;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}
