package AlgoPlayground.GFG.Hashing;

public class OpenAddressing {
    int[] arr;
    int cap, size;
    OpenAddressing(int c){
        cap = c;
        size = 0;
        arr = new int[cap];
        for (int i = 0; i < cap; i++) {
            arr[i] = -1;
        }
    }
    int hash(int key){
        return key % cap;
    }
    boolean search(int key){
        int h = hash(key);
        int i = h;
        while(arr[i]!=-1){
            if (arr[i]==key)
                return true;
            i=(i+1)%cap;
            if(i==h) return false;
        }
        return false;
    }
    boolean insert(int key){
        if (size == cap) return false;
        int i = hash(key);
        while(arr[i]!=-1 && arr[i]!=-2 && arr[i]!=key)
            i=(i+1)%cap;
        if (arr[i]==key)
            return false;
        else {
            arr[i]=key;
            size++;
            return true;
        }
    }
    boolean erase(int key){
        int h = hash(key);
        int i = h;
        while (arr[i]!=-1){
            if (arr[i]==key){
                arr[i]=-2;
            }
            i=(i+1)%cap;
            if (i==h) return false;
        }
        return false;
    }
}
