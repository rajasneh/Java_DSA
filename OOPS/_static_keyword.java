package OOPS;
public class _static_keyword {
    public static void main(String args[]){
       // student s1=new student();
        //s1.schoolname="DAV";//for coming yellow mark remove comment before running
        //System.out.println(s1.schoolname);
       // student s2=new student();
       // student s3=new student();
        //System.out.println(s2.schoolname);
        //System.out.println(s3.schoolname);
    }
}
class student{
    int roll;
    String name;
    static String schoolname;
    void setroll(int roll){
        this.roll=roll;
    }
    String getname(){
        return this.name;
    }
}
