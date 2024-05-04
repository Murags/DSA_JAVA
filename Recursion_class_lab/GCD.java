public class GCD{
    public static void main(String[] args){
        System.out.println(find_gcd(72, 36));
    }

    static int find_gcd(int a, int b){
        if (a == 0) return b;

        if (b == 0) return a;

        // Base Case
        if (a == b) return a;

        if (a > b){
            return find_gcd(a - b, b);
        }

        return find_gcd(a, b - a);
    }
}
