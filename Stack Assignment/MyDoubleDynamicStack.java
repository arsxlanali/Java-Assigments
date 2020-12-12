
/**
 * ADT MyStack: Private Part<br>.
 * The class implements all the operations available in MyStack<br>
 */
public class MyDoubleDynamicStack<T> implements MyStack2<T> {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------
    private MyDoubleLinkedNode<T> head;
    private MyDoubleLinkedNode<T> tail;

    //-------------------------------------------------------------------
    // Basic Operation --> Check if myStack is empty: myCreateEmpty
    //-------------------------------------------------------------------
    //public myStack myCreateEmpty(){}
    public MyDoubleDynamicStack() {
        this.head = null;
        this.tail = null;
    }

    //-------------------------------------------------------------------
    // Basic Operation --> Check if myStack is empty: isEmpty
    //-------------------------------------------------------------------
    public boolean isEmpty() {
        //-----------------------------
        //Output Variable --> InitialValue
        //-----------------------------

        boolean res = true;
        res = (this.head == null && this.tail == null);
        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------

        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------

        //-----------------------------
        //Output Variable --> Return FinalValue
        //-----------------------------
        return res;
    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> Get first element from front of MyStack: first
    //-------------------------------------------------------------------
    public T first() {
        //-----------------------------
        //Output Variable --> InitialValue
        //-----------------------------
        T res = null;

        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------

        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------

        //-----------------------------
        //Output Variable --> Return FinalValue
        //-----------------------------

        if (!this.isEmpty()) {
            res = this.head.getInfo();
        }

        return res;
    }

    //-------------------------------------------------------------------
    // Basic Operation --> Add element to back of MyStack: addByFirst
    //-------------------------------------------------------------------
    public void addByFirst(T element) {
        //-----------------------------
        //SET OF OPS
        //-----------------------------
        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------

        if (this.isEmpty()) {
            MyDoubleLinkedNode<T> temp = new MyDoubleLinkedNode<T>(null, element, null);
            this.head = temp;
            this.tail = temp;
        } else {
            MyDoubleLinkedNode<T> temp = new MyDoubleLinkedNode<T>(this.head.getLeft(), element, this.head);
            this.head.setLeft(temp);
            this.head = temp;
        }

        System.out.println(element + " pushed into the front of stack");
    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> Remove element from front of MyStack: removeByFirst
    //-------------------------------------------------------------------
    public void removeByFirst() {
        //-----------------------------
        //SET OF OPS
        //-----------------------------
        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------

        if (this.isEmpty()) {
            System.out.println("Stack is empty");
        } else if (this.head == this.tail) {
            System.out.println(this.head.getInfo() + " is removed from front of stack");
            this.head = null;
            this.tail = null;
        } else {
            System.out.println(this.head.getInfo() + " is removed from front of stack");
            (this.head.getRight()).setLeft(this.head.getLeft());
            this.head = this.head.getRight();
        }
    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> Get first element from front of MyStack: last
    //-------------------------------------------------------------------
    public T last() {
        //-----------------------------
        //Output Variable --> InitialValue
        //-----------------------------
        T res = null;

        //-----------------------------
        //SET OF OPS
        //-----------------------------

        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------

        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------

        //-----------------------------
        //Output Variable --> Return FinalValue
        //-----------------------------

        if (!this.isEmpty()) {
            res = this.tail.getInfo();
        }

        return res;
    }

    //-------------------------------------------------------------------
    // Basic Operation --> Add element to back of MyStack: addByLast
    //-------------------------------------------------------------------
    public void addByLast(T element) {
        //-----------------------------
        //SET OF OPS
        //-----------------------------
        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------


        if (this.isEmpty()) {
            MyDoubleLinkedNode<T> temp = new MyDoubleLinkedNode<T>(null, element, null);
            this.head = temp;
            this.tail = temp;
        } else {
            MyDoubleLinkedNode<T> temp = new MyDoubleLinkedNode<T>(this.tail, element, this.tail.getRight());
            this.tail.setRight(temp);
            this.tail = temp;
        }

        System.out.println(element + " pushed into the last of stack");

    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> Remove element from front of MyStack: removeByFirst
    //-------------------------------------------------------------------
    public void removeByLast() {
        //-----------------------------
        //SET OF OPS
        //-----------------------------
        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------

        if (this.isEmpty()) {
            System.out.println("Stack is empty");
        } else if (this.head == this.tail) {
            System.out.println(this.head.getInfo() + " is removed from last of stack");
            this.head = null;
            this.tail = null;
        } else {
            System.out.println(this.tail.getInfo() + " is removed from last of stack");
            (this.tail.getLeft()).setRight(this.tail.getRight());
            this.tail = this.tail.getLeft();
        }

    }
}
