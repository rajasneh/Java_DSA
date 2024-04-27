package OOPS;
public class Hybrid_enheritance {
    public static void main(String args[]){
        cat mk=new cat();
        mk.breath();
    }
}
class animal{
    String color;
    void breath(){
        System.out.println("it breathe");
    }
    void eats(){
        System.out.println("it eats");
    }
}
class fish extends animal{
    void swim(){
        System.out.println("it can swim");
    }
}
class shark extends fish{
    void size(){
        System.out.println("it is larger");
    }
}
class dolphin extends fish{
    void style(){
        System.out.print("it jumps and swim ");
    }
}
class bird extends animal{
    void fly(){
        System.out.println("it can fly");
    }
}
class peackock extends bird{
    void flytime(){
        System.out.println("it dosent flies for long time");
    }
}
class penguin extends bird{
    void exception(){
        System.out.println("it is a exception case");
    }
}
class mammal extends animal{
    void walk(){
        System.out.println("it can walk");
    }
}
class dog extends mammal{
    void bark(){
        System.out.println("it can bark");
    }
}
class cat extends mammal{
    void meow(){
        System.out.println("it sounds meow");
    }
}
class human{
    void language(){
        System.out.println("it can speak multiple language");
    }
}
