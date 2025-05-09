public class StackLinkedList implements Stack {
    StackItem top = null;

    public void push(Object item) {
        StackItem temp_box = new StackItem(item);
        StackItem previous_top = this.top;
        this.top = temp_box;
        this.top.setNext(previous_top);
    }

    public Object pop() {
        Object data = this.top.getItem();
        this.top = this.top.getNext();
        return data;
    }

    public void peek() {
        System.out.println("the top is " + this.top.getItem());
    }

    public boolean isEmpty() {
        return this.top == null;
    }
}
