package OOPS;
public class _03_abstract_class {
    public static void main(String args[]){
        //mustang m1=new mustang();//for coming yellow mark remove comment before running
    }
}
abstract class animal{
    animal(){
        System.out.println("animals,constructor called");
    }
}
class horse extends animal{
    horse(){
        System.out.println("horse,constructor called");
    }
}
class mustang extends horse{
    mustang(){
        System.out.println("mustang,constructor called");
    }
}

