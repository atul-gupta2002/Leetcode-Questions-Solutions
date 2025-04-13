class Solution {
    public int findClosest(int x, int y, int z) {
        int a = z-x;
        int b = z-y;

        if(Math.abs(a)<Math.abs(b)){
            return 1;
        }else if(Math.abs(a)>Math.abs(b)){
            return 2;
        }else{
            return 0;
        }
        
    }
}