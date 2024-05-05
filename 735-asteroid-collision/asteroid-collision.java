import java.util.*;
class Solution {
    public  static int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i : arr) {
            if (i > 0) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(i)) {
                    stack.pop();
                }
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(i);
                } else if (stack.peek() == Math.abs(i)) {
                    stack.pop();
                }
            }
        }
        
        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] ans = asteroidCollision(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
            
        }
        
    }
}
