
/**
 * ADT MyStack: Private Part<br>.
 * The class implements all the operations available in MyStack<br>
 */
public class MyDynamicStack implements MyStack {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------
    private MyNode head;

    //-------------------------------------------------------------------
    // Basic Operation --> Check if MyStack is empty: myCreateEmpty
    //-------------------------------------------------------------------
    //public myStack myCreateEmpty(){}
    public MyDynamicStack() {//TO-COMPLETE
        this.head = null;
    }

    //-------------------------------------------------------------------
    // Basic Operation --> Check if MyStack is empty: isEmpty
    //-------------------------------------------------------------------
    public boolean isEmpty() {//TO-COMPLETE
        //-----------------------------
        //Output Variable --> InitialValue
        //-----------------------------
        boolean res = true;
        res = (this.head == null);

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
    // Basic Operation (Partial) --> Get first element from the top of MyStack and removes it: pop
    //-------------------------------------------------------------------
    public int pop() {//TO-COMPLETE
        //-----------------------------
        //Output Variable --> InitialValue
        //-----------------------------
        int res = -1;

        if (this.isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            int x = this.head.getInfo();
            this.head = this.head.getNext();
            return x;
        }

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
    // Basic Operation (Partial) --> Add element to the top of MyStack: push
    //-------------------------------------------------------------------
    public void push(int element) {//TO-COMPLETE
        //-----------------------------
        //SET OF OPS
        //-----------------------------
        //-----------------------------
        // I. SCENARIO IDENTIFICATION
        //-----------------------------
        //-----------------------------
        // II. SCENARIO IMPLEMENTATION
        //-----------------------------

        // if pushing first element

        // create new node temp and allocate memory
        MyNode temp = new MyNode(element, this.head);

        // update top reference
        this.head = temp;
        System.out.println(element + " pushed into stack");

    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> prints all the elements from MyStack: print
    //-------------------------------------------------------------------
    public void print() {//TO-COMPLETE
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
            System.out.println("Stack Empty!");
        } else {
            MyNode temp = this.head;
            while (temp != null) {

                // print node data
                System.out.println(temp.getInfo());
                
                // assign temp link to temp
                temp = temp.getNext();
            }
        }
    }
}
