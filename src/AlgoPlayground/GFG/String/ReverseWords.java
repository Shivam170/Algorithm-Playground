package AlgoPlayground.GFG.String;

import java.util.Stack;

public class ReverseWords {
    public static void main(String[] args) {
        naive("Welcome to gfg");
    }

    static void naive(String str) {
        Stack<String> s = new Stack<>();
        int begin = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                s.push(str.substring(begin, i - 1));
                begin = i;
            }
        }
        s.push(str.substring(begin));
        String out = "";
        while (!s.isEmpty()) {
            out += s.pop() + " ";
        }
        System.out.println(out);
    }

    void reverseWords(String str, int n) {
        int start = 0;
        char[] arr = str.toCharArray();
        for (int end = 0; end < n; end++) {
            if (arr[end]==' '){
                reverse(arr,start,end-1);
                start=end+1;
            }
        }
        reverse(arr,start,n-1);
        reverse(arr,0,n-1);
        str = new String(arr);
    }

    void reverse(char[] str, int low, int high) {
        while (low <= high) {
            swap(str,low,high);
            low++;
            high--;
        }
    }

    void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

}
