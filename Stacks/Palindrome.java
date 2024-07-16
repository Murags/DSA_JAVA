// find out if String is palindrome. Note Bug: Does not work for sentences
public class Palindrome{

    public static boolean isPalindrome(String str){
        StackS reverse = new StackS(str.length());
        str = str.toLowerCase();
        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++){
            reverse.push(arr[i]);
        }

        for(int i = 0; i <= reverse.top / 2; i++){

            // reverse.pop() != arr[i] another way of doing the if statement
            if(reverse.stackArray[reverse.top - i] != arr[i]){
                System.out.println(str + " is not a palindrome");
                return false;
            }
        }

        System.out.println(str + " is a palindrome");
        return true;
    }
}
