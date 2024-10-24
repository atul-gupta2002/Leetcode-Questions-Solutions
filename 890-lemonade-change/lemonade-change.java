class Solution {  
    public boolean lemonadeChange(int[] bills) {  
        int five = 0;  
        int ten = 0;  

        for (int i = 0; i < bills.length; i++) {  
            if (bills[i] == 5) {  
                five++;  
            } else if (bills[i] == 10) {  
                if (five == 0) {  
                    return false; // Not enough 5 dollars bills to make change  
                }  
                ten++;  
                five--;  
            } else if (bills[i] == 20) {  
                if (ten > 0 && five > 0) {  
                    ten--;  
                    five--;  
                } else if (five > 2) {  
                    five -= 3;  
                } else {  
                    return false; // Not enough bills to make change  
                }  
            }  
        }  
        return true;  
    }  
}