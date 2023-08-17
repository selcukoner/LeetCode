class Solution {
    fun longestPalindrome(s: String): String {
        var longestCounter = 0
        var longestPalindrome = ""

        for(i in 0 until s.length-longestCounter){
            for(j in s.length-1 downTo i + longestCounter ){
                val temp = s.substring(i,j+1)
                if(temp.length > longestCounter && isPalindrome(temp)){
                    longestPalindrome = temp
                    longestCounter = temp.length
                }
            }
        }
        return longestPalindrome
    }

    fun isPalindrome(s:String):Boolean{
        var firstIndex = 0
        var lastIndex = s.length-1

        while(firstIndex < lastIndex){
            if(s[firstIndex++] != s[lastIndex--])
                return false
        }
        return true
    }
}