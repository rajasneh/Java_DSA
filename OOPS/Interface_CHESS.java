package OOPS;

public class Interface_CHESS {
    public static void main(String args[]){
        queen q1=new queen();
        q1.move();
        king k1=new king();
        k1.move();
    }
}
interface chess {
    void move();
}
class queen implements chess{
    public void move(){
        System.out.println("up,down.left,right,diagnolly(in all 4 directions)");
    }
}
class king implements chess{
    public void move(){
        System.out.println("up,down.left,right,diagnolly by one step");
    }
}
class rook implements chess{
    public void move(){
        System.out.println("up,down.left,right,diagnolly");
    }
}