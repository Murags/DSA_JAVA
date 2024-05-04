public class CountDown {
    public static void main(String[] args){
        countdown(10);
    }

    static void countdown(int n){
        if (n == 0){
            System.out.println(n);
            return;
        }
        else{
            System.out.println(n);
            countdown(n-1);
        }
    }
}
