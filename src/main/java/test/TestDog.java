package test;

class Animals{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog extends Animals{
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}
public class TestDog{
    public static void main(String args[]){
        Animals a = new Animals();
        Animals b = new Dog();
        a.move();
        b.move();
        ((Dog)b).bark();
    }
}