package OOPS;

public class Non_parameterized {
    public static void main(String args[]){
        student s1=new student("asn");
        s1.roll=5;
        student s3=new student(5,"asneh");
        s3.name="raj";
    }
}
class student{
    String name;
    int roll;
    double cgpa;
    student(String name){
        this.name=name;
        System.out.println(name);
    }
    student(int roll,String name){
        this.roll=roll;
        this.name=name;
        System.out.println(roll+" "+name);
    }
}