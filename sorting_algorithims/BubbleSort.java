public class BubbleSort {
    public static void main(String[] args){
        int[] my_arr = {2, 1, 3, 7, 9, 1000, 99, 4, 0, 10};
        sort(my_arr);

        for(int i = 0; i < my_arr.length; i++){
            System.out.println(my_arr[i]);
        }

    }

    static void sort(int[] arr){
        boolean swapped;
        int temp;

        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)break;
        }
    }
}
