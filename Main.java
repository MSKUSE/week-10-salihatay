
public class Main {
    public static void main(String[] args) {
        

        StackLinkedList stack = new StackLinkedList();
        stack.push(5);
        stack.push("this is a string");
        stack.peek();
        System.out.println(stack.top.getData());
        System.out.println(stack.top.getNext().getData());
        System.out.println(stack.top.getNext().getNext());
    }
}
