class Solution {
    public void sortColors(int[] arr) {

        int n = arr.length;

        int a = 0;
        int b = 0;
        int c = 0;

        for(int i=0; i<n; i++){
            if(arr[i]==0){
                a++;
            } 
            else if(arr[i]==1) {
                b++;
            }
            else{ 
                c++;
            }
        }

        for(int i=0; i<a; i++){
        arr[i]=0;
        }

        for(int i=a; i<a+b; i++){ 
        arr[i]=1;
        }

        for(int i=a+b; i<a+b+c; i++) {
            arr[i]=2;
        }
    }
}