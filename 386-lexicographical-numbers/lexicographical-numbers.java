class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> li = new ArrayList<>();
        printLexicographical(0,n,li);
        return li;

    }
        public static void printLexicographical(int current, int n,List<Integer> li) {
            if (current > n) {
                return;
            }


            int i=0;
            if(current ==0){
                i=1;

            }
            else{
                li.add(current);
            }
        
            for (; i <= 9; i++) {
                printLexicographical(current * 10 + i,n,li);
            }
        }
}