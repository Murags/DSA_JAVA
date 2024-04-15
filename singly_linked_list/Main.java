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
    }
}
