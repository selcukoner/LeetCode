class Solution {
    fun reverse(x: Int): Int {
        var temp = x
        var reversed =0
        var prev  = 0

        while(temp !=0){
            var remainder = temp % 10
            reversed = reversed * 10 + remainder 

            if((reversed - remainder) / 10 != prev ) return 0
            temp /= 10
            prev = reversed
        }
        return reversed
    }
}