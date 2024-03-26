package OOPS;

public class Method_overloading {
    public static void main(String args[]){
    calculator c1=new calculator();
    System.out.println(c1.sum(5,6));
    System.out.println(c1.sum((float)0.5,(float)0.5));
}
}
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
}