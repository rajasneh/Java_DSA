package OOPS;
public class BANKaccount {
    public static void main(String args[]){
        BankAccounts MyAcc= new BankAccounts();
        MyAcc.username="rajasneh28";
        MyAcc.setpassword("asnehraj12");
        MyAcc.bankname="SBI";
        MyAcc.ifscCode="ADJS738HU";
        System.out.println(MyAcc.username);
        System.out.println(MyAcc.bankname);
        System.out.println(MyAcc.ifscCode);
    }
}
class BankAccounts{
    public String username;
    private  String password;
    void setpassword(String pwd){
        pwd=password;
    }
    public String bankname;
    public String ifscCode;
}