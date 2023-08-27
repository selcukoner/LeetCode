class Solution {
    public int reverse(int x) {
        int sum = 0, digit = 0, prev = 0;
        while(x != 0){
            digit = x % 10;
            sum = sum*10 + digit; 
            x /= 10;
            
            if((sum - digit) / 10 != prev )
                return 0;
            
            prev = sum;
        }

        return sum;
    }
}