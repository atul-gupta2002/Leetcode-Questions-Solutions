class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int del = 0;

        for( int cnt : map.values()){
            if(cnt >2){
                if(cnt % 2 == 0){
                    del += (cnt-2);
                }
                else{
                    del += (cnt-1);
                }
            }
        }
        return s.length()-del;    
    }
}