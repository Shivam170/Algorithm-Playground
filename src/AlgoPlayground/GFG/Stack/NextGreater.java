package AlgoPlayground.GFG.Stack;

public class NextGreater {
    void naive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    System.out.print(arr[j]);
                    break;
                }
            }
            if (j == arr.length) System.out.print(-1 + " ");
        }
    }

    void nextGreater(int[] arr) {

    }
}
