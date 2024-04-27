package OOPS;
public class method_overriding {
    public static void main(String args[]){
        deer d1=new deer();
        d1.eats();
    }
}
class animal{
    void eats(){
        System.out.println("eats anything");
    }
}
class deer extends animal{
    void eats(){
        System.out.println("eat only grass");
    }
}
