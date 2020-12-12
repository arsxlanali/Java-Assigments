
/**
 * ADT MyStack: Private Part<br>.
 * The class implements all the operations available in MyStack<br>
 * same as createEmpty()
 */
public class MyStaticStack implements MyStack {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------
    private int items[];
    private int numItems;
    private int maxItems;

    //-------------------------------------------------------------------
    //-------------------------------------------------------------------
    //public myStack myCreateEmpty(){}
    /**
     * The constructor creates 1 instance (1 object) of the class MyStaticStack<br>
     * @param m: The maximum number of items MyStack can contain.
     */
    public MyStaticStack(int m) {//TO-COMPLETE
        this.maxItems = m;
        this.items = new int[this.maxItems];
        this.numItems = -1;
    }

    //-------------------------------------------------------------------
    // Basic Operation --> Check if MyStack is empty: isEmpty
    //-------------------------------------------------------------------
    /**
     * Given a concrete MyStack, it returns whether it is empty or not.<br>
     * @return: Whether MyStack is empty or not.
     */
    public boolean isEmpty() {//TO-COMPLETE
        //-----------------------------
        //Output Variable --> InitialValue
        //-----------------------------
        boolean res = true;
        res = (this.numItems < 0);
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
    // Basic Operation (Partial) --> Get and remove first element from top of MyStack: pop
    //-------------------------------------------------------------------
    /**
     * Given a concrete MyStack, it returns its head element (if any).<br>
     * @return: Head element from MyStack (ERROR if there are no items in MyStack).
     */
    public int pop() {//TO-COMPLETE
        //-----------------------------
        //Output Variable --> InitialValue
        //-----------------------------
        int res = -1;

        if (this.isEmpty()) {
            System.out.println("Stack is Empty!");
        } else {
            int x = this.items[numItems--];
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
    /**
     * Given a concrete MyStack, add an item by its head.<br>
     * @param element: New item to be added to MyStack.
     */
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
        
        if (this.numItems >= (this.maxItems - 1)) {
            System.out.println("Stack Overflow");
        } else {
            this.items[++numItems] = element;
            System.out.println(element + " pushed into stack");
        }
    }

    //-------------------------------------------------------------------
    // Basic Operation (Partial) --> prints all the elements from MyStack: print
    //-------------------------------------------------------------------
    /**
     * Given a concrete MyStack, prints all the elements (if any).<br>
     *
     */
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

        int i;
        for (i = this.items.length - 1 ; i >= 0; i--) {

            if (this.isEmpty()) {
                System.out.println("Stack Empty");
                break;
            } else {
                int x = this.items[i];
                System.out.println(x + " ");
            }
        }
    }
}
