public class Main {
    public static void main(String[] args){
        SinglyList firstList = new SinglyList(20);
        firstList.add(30);
        firstList.add(40);
        firstList.add_beginning(10);
        firstList.print_list();


        System.out.println(firstList.count());

        firstList.delete_head();
        firstList.print_list();
        System.out.println(firstList.count());

        firstList.reverse_list();
        firstList.print_list();

        try{
            System.out.println(firstList.get_node_at_index(0));
            System.out.println(firstList.get_node_at_index(2));
            System.out.println(firstList.get_node_at_index(5));

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
