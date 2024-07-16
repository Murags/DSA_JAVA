public class LinkedListTest1 {
    public static void main(String[] args){
        LinkedList2 firstList = new LinkedList2();
        firstList.add(30);
        firstList.add(40);
        firstList.add(50);
        firstList.add(60);
        firstList.add(70);
        firstList.add(80);

        // firstList.traverse();

        firstList.remove(0);
        firstList.remove(0);

        // firstList.traverse();

        try{
            firstList.add(90, 5);
        }catch(Exception e){
            System.out.println("Could not add node at index");
        }

        firstList.traverse();

    }
}
