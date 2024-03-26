

public class multi_level_inheritence {
    public static void main(String args[]){
        dogs tommy =new dogs();
        tommy.legs=4;
        System.out.println(tommy.legs);
    }
}
class Animal{
    String color;
    void eats(){
        System.out.println("it eats");
    }
    void breathes(){
        System.out.println("It breathes");
    }
}
class mammals extends Animal{
    int legs;
}
class dogs extends mammals{
    String brees;
}