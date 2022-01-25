package AlgoPlayground.GFG.Greedy;

import java.util.Arrays;
import java.util.HashSet;

class Activity implements Comparable<Activity> {
    int start;
    int finish;

    Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public int compareTo(Activity activity) {
        return this.finish - activity.finish;
    }
}

public class ActivitySelectionProblem {

    static int maxActivity(Activity[] arr) {
        Arrays.sort(arr);
        HashSet<Activity> set = new HashSet<>();
        set.add(arr[0]);
        int l = arr[0].finish;
        for (int i = 1; i < arr.length; i++) {
            if (l<=arr[i].start){
                set.add(arr[i]);
                l=arr[i].finish;
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        Activity[] arr = {new Activity(12, 25), new Activity(10, 20), new Activity(20, 30)};
        System.out.println(maxActivity(arr));
    }
}
