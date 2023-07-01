
//Single Inheritance with method overriding
class Product{
    //Attribute (State)
//    private int pid; // private limits the users to not write data directly
    int pid;
    String name;
    int price;
    Product() {
        System.out.println("Product obj constructor");
    }
    //Methods (Behaviour)
    void setProductDetails(int pid, String name, int price) {
        this.pid=pid;
        this.name=name;
        this.price=price;
        System.out.println("Data written in product object");
    }
    void showProductDetails() {
        System.out.println("\nProduct id: " + pid);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
    void setPid(int pid) { //setters
        this.pid = pid;
    }
    int getPid() { // getters
       return pid;
    }
}

class Mobile extends Product { // Mobile IS-A Product
    String os;
    int ram;
    int sdCardSize;
     Mobile() {
         System.out.println("Mobile object constructor");
     }
    void setProductDetails(int pid, String name, int price, String os, int ram, int sdCardSize) { //overloading
        this.pid=pid;
        this.name=name;
        this.price=price;
        this.os=os;
        this.ram=ram;
        this.sdCardSize=sdCardSize;
        System.out.println("Data written in mobile object");
    }
    void showProductDetails() { // overriding
        System.out.println("\nProduct id: " + pid);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("OS: " + os);
        System.out.println("RAM: " + ram);
        System.out.println("sdCardSize: " + sdCardSize);
    }
}

public class InheritanceApp {
    public static void main(String[] args) {
//        Product product = new Product(); //product is not an object. it's a reference variable which holds the hashCode of the object in hexadecimal notation
//        product.setProductDetails(101, "iPhoneX", 70000);
//        product.showProductDetails();
        Mobile mobile = new Mobile();
//        mobile.setProductDetails(301, "iPhoneX", 70000);
//        mobile.showProductDetails();
        mobile.setProductDetails(301, "iPhoneX", 70000, "ios", 4, 128);
        mobile.showProductDetails();
    }
}

