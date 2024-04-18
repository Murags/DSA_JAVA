public class SinglyList {
    Node head;
    Node current;
    Node tail;

    public SinglyList(int value) {
        this.head = new Node(value);
        this.current = this.head;
    }

    void add(int value){
        Node newNode = new Node(value);
        this.current.next = newNode;
        this.current = newNode;
        System.out.println(this.current.value + " has been added\n");
    }

    void add_beginning(int value){
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
    }

    void delete_head(){
        if(this.head != null){
            this.head = this.head.next;
        }
    }

    int count(){
        int nodeCount = 0;
        this.current = this.head;
        while(this.current != null){
            nodeCount++;
            this.current = this.current.next;
        }
        return nodeCount;
    }

    int get_node_at_index(int index){
        this.current = this.head;
        while(this.current != null && index-- != 0){
            this.current = this.current.next;
        }
        if (this.current != null){
            return this.current.value;
        }
        throw new NullPointerException("No node at this index");
    }

    int sum_all(){
        int sum = 0;
        this.current = this.head;
        while(this.current != null){
            sum += this.current.value;
        }
        return sum;
    }

    void reverse_list(){
        Node temp = null;
        Node prev = null;
        this.current = this.head;

        while(this.current != null){
            temp = this.current.next;
            this.current.next = prev;
            prev = this.current;
            this.current = temp;
        }
        this.head = prev;
    }

    void print_list(){
        System.out.println("This list contains the following values: ");
        this.current = this.head;
        while(this.current != null){
            System.out.println(this.current.value);
            this.current = this.current.next;
        }
    }
}
