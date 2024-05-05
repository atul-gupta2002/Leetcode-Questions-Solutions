class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        
        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || arr[i] < arr[stack.peek()])) {
                int height = arr[stack.pop()];
                int width = 0;
				if(stack.isEmpty()){
					width=i;
				}else{
					width=i-stack.peek()-1;
				}
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        
        return maxArea;	    
	}
        
    }
