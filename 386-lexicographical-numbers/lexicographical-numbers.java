    class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        lexic(n,0,num);
        return num;
    }
    public static void lexic(int n,int cur,ArrayList<Integer> num){
        if(cur>n){
            return;
        }
        int i=0;
        
        if(cur==0){
        
            i=1;
        }
        else{
        num.add(cur);}
        for(;i<=9;i++){
            lexic(n,cur*10+i,num);
        }
    }
}