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

    void print_list(){
        System.out.println("This list contains the following values: ");
        this.current = this.head;
        while(this.current != null){
            System.out.println(this.current.value);
            this.current = this.current.next;
        }
    }
}
