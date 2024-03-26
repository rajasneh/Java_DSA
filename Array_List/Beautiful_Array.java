package Array_List;
import java.util.*;
public class Beautiful_Array {
    public static void Beautiful(int n){
        ArrayList<Integer>ans = new ArrayList<>();
        ans.add(1);
        while (ans.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < ans.size(); i++) {
                if ((ans.get(i) * 2 - 1) <= n) {
                    temp.add(ans.get(i) * 2 - 1);
                }
            }
            for (int i = 0; i < ans.size(); i++) {
                if (ans.get(i) * 2 <= n) {
                    temp.add(ans.get(i) * 2);
                }
            }
            ans = temp;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Beautiful(10); // Example call with n = 10
    }
}