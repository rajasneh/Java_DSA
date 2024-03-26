

public class Hierarchial_inheritance {
        public static void main(String args[]){
        human asneh=new human();
        asneh.eat();
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
    class human extends Animal{
        void walk(){
            System.out.println("it can walk");
        }
    }
    class bird extends Animal{
        void fly(){
            System.out.println("It can fly");
        }
    }

