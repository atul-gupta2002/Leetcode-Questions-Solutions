class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String x : operations){
            if(x.equals("C")){
                st.pop();
            }
            else if(x.equals("D")){
                int t=st.peek();
                st.push(2*t);
            }
            else if(x.equals("+")){
                int t1=st.peek();
                st.pop();
                int t2=st.peek();
                int t3=t1+t2;
                st.push(t1);
                st.push(t3);
            }
            else{
                st.push(Integer.valueOf(x));
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.peek();
            st.pop();
        }
        return ans;
        
    }
}