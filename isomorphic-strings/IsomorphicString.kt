class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        var arr1 = CharArray(256)
        var arr2 = CharArray(256)

        for(i in 0..s.length-1){
            var charInS: Int = s[i].toInt()
            var charInT: Int = t[i].toInt()

            if(arr1[charInS] =='\u0000')
                arr1[charInS] = t[i] 
            if(arr2[charInT] == '\u0000')
                arr2[charInT] = s[i] 

            if(arr1[charInS] != t[i] || arr2[charInT] != s[i]){
                return false;
            }
        }
        return true
    }
}