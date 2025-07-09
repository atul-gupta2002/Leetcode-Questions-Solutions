class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        for(int i:nums1){
            h1.add(i);
        }
         HashSet<Integer> h2 = new HashSet<>();
        for(int i:nums2){
           if(h1.contains(i)){
            h2.add(i);
           }
        }

        int[] arr = new int[h2.size()];
        int index=0;
        for(int num:h2){
            arr[index++]=num;

        }

        return arr;
    }
}