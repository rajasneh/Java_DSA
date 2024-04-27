package OOPS;
public class _02_abstract_class {
    public static void main(String args[]){
        hen h1=new hen();
        h1.walk();
        h1.eats();
        System.out.println(h1.color);
    }
}
abstract class animal{
    String color;
    animal(){
        color="brown";
    }
    void eats(){
        System.out.println("it eats");
    }
    abstract void walk();
}
class hen extends animal{
    void changecolor(){
        color="white";
    }
    void walk(){
        System.out.println("walks on two legs");
    }
}
