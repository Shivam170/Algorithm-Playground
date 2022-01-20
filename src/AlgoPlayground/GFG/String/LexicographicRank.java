package AlgoPlayground.GFG.String;

public class LexicographicRank {
    public static int factorial(int n){
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int lexRank(String str){
        int res = 1;
        int n = str.length();
        int mul = factorial(n);
        int[] count = new int[256];
        for (int i = 0; i < n; i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i-1];
        }
        for (int i = 0; i < n - 1; i++) {
            mul = mul/(n-i);
            res = res + count[str.charAt(i)-1]*mul;
            for (int j = str.charAt(i); j < count.length; j++) {
                count[j]--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lexRank("STRING"));
    }

}
