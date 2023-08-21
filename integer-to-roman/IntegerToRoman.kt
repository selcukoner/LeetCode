class Solution {
    fun intToRoman(num: Int): String {
        var numerals = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV","I")
        var values =arrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        var resultingSb = StringBuilder("")

        var temp = num
        for(i in numerals.indices){
            var repetition = temp / values[i]
            temp %= values[i]

            for(j in 0 until repetition){
                resultingSb.append(numerals[i])
            }
        }

        return resultingSb.toString()
    }
}