class Solution { 
    long mod = (long) 1e9+7;
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd=n/2;
        long first = pow(5,even);
        long second = pow(4,odd);

        return (int)((first*second)%mod);
    }

    public long pow(long x,long n){
        if(n==0){
            return 1;
        }
        long temp = pow(x,n/2);
        if(n%2==0){
            return (temp*temp)%mod;   
        }
        else{
            return (x*temp*temp)%mod;
        }
    }
}