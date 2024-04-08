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

    void print_list(){
        System.out.println("This list contains the following values: ");
        this.current = this.head;
        while(this.current != null){
            System.out.println(this.current.value);
            this.current = this.current.next;
        }
    }
}
