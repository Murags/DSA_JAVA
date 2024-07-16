public class LinkedList2
{

    // reference to the head node.
    private Node head;

    private int listCount;

    // LinkedList constructor
    public LinkedList2()
    {
        // this is an empty list, so the reference to the head node
        // is set to a new node with no data
        //head = new Node(null);
        head = null;
        listCount = 0;
    }

    public void addToHead(Object data)//Add data to the head of a linked list
    {
        Node newNode = new Node(data);
        //newNode.next = head;
        head = newNode;
        listCount++;
    }


   public void add(Object data)  // appends the specified element to the end of this list.
    {
        Node Temp = new Node(data);
        if(head == null){
            head = Temp;
            return;
        }
        Node Current = head;

        // starting at the head node, crawl to the end of the list

        while (Current.getNext() != null)
        {
            Current = Current.getNext();
        }

        // the last node's "next" reference set to our new node
        Current.setNext(Temp);
        listCount++;// increment the number of elements variable
    }


    public void add(Object data, int index) // inserts the specified element at the specified position in this list
    {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }

        Node Temp = new Node(data);

        if (index == 0) {
            Temp.setNext(head);
            head = Temp;
        } else {
            Node Current = head;
            for (int i = 0; i < index - 1; i++) {
                Current = Current.getNext();
            }
            Temp.setNext(Current.getNext());
            Current.setNext(Temp);
        }
        listCount++;// increment the number of elements variable
    }


    public Object get(int index) // returns the element at the specified position in this list.
    {
        // index must be 0 or higher and less than the size of the list
        if (index < 0 || index >= size())
            return null;

        Node Current = head;

        for (int i = 0; i < index; i++)
        {
            if (Current.getNext() == null)
                return null;

            Current = Current.getNext();
        }

        return Current.getData();
    }


    public void traverse()
    {
        Node current = head;
        int i = 0;
        while (current != null)
        {
            System.out.println("For the node at index" + i + " the data is " + current.data);
            i++;
            current = current.next;
        }
    }

    public boolean remove(int index) // removes the element at the specified position in this list.
    {
        // if the index is out of range, exit
        if (index < 0 || index >= size())
            return false;

        if (index == 0) {
            head = head.getNext();
            listCount--;
            return true;
        }

        Node Current = head;
        for (int i = 1; i < index; i++) {
            if (Current.getNext() == null)
                return false;

            Current = Current.getNext();
        }

        Current.setNext(Current.getNext().getNext());
        listCount--; // decrement the number of elements variable
        return true;
    }


    public int size() // returns the number of elements in this list.
    {
        return listCount;
    }

    public String toString() //Prints out all the nodes
    {
        Node Current = head.getNext();
        String output = "";
        while (Current != null)
        {
            output += "[" + Current.getData().toString() + "]";
            Current = Current.getNext();
        }
        return output;
    }

    private class Node
    {

        Node next;// reference to the next node in the chain, or null if there isn't one.

        Object data; // data carried by this node could be of any type you need.

        public Node(Object dataValue) // Node constructor
        {
            next = null;
            data = dataValue;
        }


        public Node(Object dataValue, Node nextValue) // another Node constructor if we want to specify the node to point to.
        {
            next = nextValue;
            data = dataValue;
        }

        public Object getData() // these methods should be self-explanatory
        {
            return data;
        }

        public void setData(Object dataValue)
        {
            data = dataValue;
        }

        public Node getNext() //returns reference to next node
        {
            return next;

        }

        public void setNext(Node nextValue) //set node's next reference
        {
            next = nextValue;
            //System.out.println(" Value of next" + next.getData());

        }
    }
}
