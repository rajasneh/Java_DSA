package Stacks;
public class Stack_Of_LL {
    class Student {
        private int id;
        private String name;
    
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    
        public int getId() {
            return id;
        }
    
        public String getName() {
            return name;
        }
    
        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + "]";
        }
    }
    
    class Node {
        Student data;
        Node next;
    
        public Node(Student data) {
            this.data = data;
            this.next = null;
        }
    }
    
    private Node top;
    
    public Stack_Of_LL() {
        this.top = null;
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public void push(Student data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed to stack");
    }
    
    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null; // Or throw an exception
        }
        Student popped = top.data;
        top = top.next;
        return popped;
    }
    
    public Student peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null; // Or throw an exception
        }
        return top.data;
    }
    
    public static void main(String[] args) {
        Stack_Of_LL stack = new Stack_Of_LL();
    
        // Pushing students onto the stack
        stack.push(stack.new Student(1, "Alice"));
        stack.push(stack.new Student(2, "Bob"));
        stack.push(stack.new Student(3, "Charlie"));
    
        // Peeking and popping students from the stack
        System.out.println("Top student: " + stack.peek());
        System.out.println("Popped student: " + stack.pop());
        System.out.println("Top student: " + stack.peek());
        System.out.println("Popped student: " + stack.pop());
        System.out.println("Top student: " + stack.peek());
    }
}
