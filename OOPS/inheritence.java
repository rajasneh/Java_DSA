package OOPS;
public class inheritence {
    public static void main(String args[]){
    fish shark= new fish();
    shark.swim();
    shark.eat();
    }

}
class Animal{
   String color;
   void eat(){
    System.out.println("IT EATS");
   }
   void breathe(){
    System.out.println("It Breathes");
   }
}
class fish extends Animal{
    int fins;
    void swim(){
        System.out.println("It Swims");
    }
}