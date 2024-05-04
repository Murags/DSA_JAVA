public class Range {
    public static void main(String[] args){
        printRange(1, 5);
    }

    static void printRange(int a, int b){
        if (a == b){
            System.out.println(a);
            return;
        }
        else{
            System.out.println(a);
            printRange(a + 1, b);
        }
    }
}
