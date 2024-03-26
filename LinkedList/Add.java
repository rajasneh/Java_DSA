package LinkedList;

public  class  Add {
    public static class Node {
        int data;
        Node Next;
        public Node(int data){
            this.data=data;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addfirst(int data){
        //create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.Next=head;
        head=newNode;
    }
    public static void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.Next=newNode;
        tail=newNode;
    }
    public static void printll(){
        Node x=head;
        while (x!=null) {
            System.out.print(x.data);
            x=x.Next;
        }
        System.out.println();
    }
    public static void add(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while(i < idx-1) {
        temp = temp.Next;
        i++;
        }
        //i = idx-1; temp -> prev
        newNode.Next = temp.Next;
        temp.Next = newNode;
        }
    public static void main(String args[]){
       Add.addfirst(1);
       Add.addfirst(2);
       Add.addlast(3);
       Add.addfirst(4);
       Add.add(3,9);
        printll();
    }
}
