package OOPS;
public class abstract__class {
    public static void main(String args[]){
        horse h1=new horse();
        h1.walk();
        hen he1=new hen();
        he1.walk();
        he1.eat();
    }
}
abstract class animal{
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class horse extends animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class hen extends animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
