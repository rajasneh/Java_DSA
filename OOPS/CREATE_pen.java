package OOPS;

public class CREATE_pen {
    public static void main(String args[]){
        pens p1=new pens();
        p1.changecolor("Blue");
        p1.changebrand("LINK");
        p1.changetip(5);
        System.out.println(p1.color);
        System.out.println(p1.Brand);
        System.out.println(p1.tip);
        p1.changecolor("yellow");
        System.out.println(p1.color);
    }
}
class pens{
    String color;
    int tip;
    String Brand;
    void changecolor(String newcolor){
        color=newcolor;
    }
    void changetip(int newtip){
        tip=newtip;
    }
    void changebrand(String newbrand){
        Brand=newbrand;
    }

}




