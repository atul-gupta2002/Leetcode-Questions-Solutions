// class Solution {
//     public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
//         int start = 0;
//         int max=0;
//         int sum=0;
//         int gs=0;
//         for(int end=0;end<customers.length;end++){
//             if(grumpy[end]!=1){
//                 sum+=customers[end];
//             }
//             else{
//                 while((end-start)>minutes){
//                     if(grumpy[start]==1){
//                         gs-=customers[start];
//                         start++;
//                     }
//                     gs+=customers[end];
//                     max=Math.max(gs,max);
//                 }
               
//             }

//         }
//          return sum+max;
//     }
// }


class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int start = 0;
        int max = 0;
        int sum = 0;
        int gs = 0; // Current extra satisfaction within the window

        // Calculate initial satisfaction without using the technique
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                sum += customers[i];
            }
        }

        // Initial window
        for (int end = 0; end < minutes; end++) {
            if (grumpy[end] == 1) {
                gs += customers[end];
            }
        }
        max = gs;

        // Slide the window across the array
        for (int end = minutes; end < customers.length; end++) {
            if (grumpy[end] == 1) {
                gs += customers[end];
            }
            if (grumpy[start] == 1) {
                gs -= customers[start];
            }
            start++;
            max = Math.max(max, gs);
        }

        return sum + max;
    }
}
