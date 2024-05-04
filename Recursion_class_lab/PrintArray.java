public class PrintArray{
    public static void main(String[] args){
        int[] my_arr = {1, 2, 3 , 4, 5};
        print_array(my_arr, 0);
    }

    static void print_array(int[] arr, int n){
        if (n == arr.length - 1){
            System.out.println(arr[n]);
            return;
        }
        else{
            System.out.println(arr[n]);
            print_array(arr, n + 1);
        }
    }
}
