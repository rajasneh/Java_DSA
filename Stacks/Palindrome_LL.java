package Stacks;
import java.util.*;
public class Palindrome_LL {
    public static class node{
        char data;
        node next;
        public node(char data){
            this.data=data;
        }
    }
    public static node head;
    public static node tail;
    public static void addlast(char data){
        node newNode=new node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static boolean isPalindrome(node head){
        Stack <Character> s =new Stack<>();
        node temp=head;
        while(temp!=null){
            s.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while (!s.isEmpty()) {
            if(temp.data!=s.pop()){
                return false;
            }
            else{
                temp=temp.next;
            }
        }
        return true;

    }
    public static void main(String args[]){
        addlast('c');
        addlast('b');
        addlast('b');
        addlast('c');
        System.out.print(isPalindrome(head));
    }
}
